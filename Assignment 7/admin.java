
package library;

import java.util.*;


public class admin {
    
    ArrayList <Person> list = new ArrayList<>();
    
    admin(){
        
    }

    
    public void run(){
        System.out.println(" 0 FOR EXIT ");
        System.out.println(" 1 REGISTERATION ");
        System.out.println(" 2 PURCHASE ");
        System.out.println(" 3 LOAN ");
        System.out.println(" 4 RETURN ");
        System.out.println(" 5 VIS ");
        System.out.println(" 6 OVERSIKT ");
        
   
    }
    
    public void menu(){
        System.out.println(" ***** WELCOME *******");
        run();
        Scanner in = new Scanner(System.in);
        int choice = Integer.parseInt(in.nextLine());
        while(true){
            switch(choice){
                case 0 -> exit();
                case 1 -> Ny();
                case 2 -> Kjop();
                case 3 -> Loan();
                case 4 -> Return();
                case 5 -> Vis();
                case 6 -> Oversikt();
                default -> System.out.println(" WRONG INPUT ");
                
        }
            
            run();
           choice = Integer.parseInt(in.nextLine());
        }
        
    }
    
    public void exit(){
        System.out.println(" ******** EXITING FROM THE SYSTEM !!!! **********");
        System.exit(0);
    }


      public void Ny(){
        
        System.out.println(" Register your name ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine().toLowerCase();
        if(!alreadyRegistret(name)){
            list.add(new Person(name));
        }
        else{
            
            System.out.println(" YOUR NAME IS NOT REGISTER IN ARKIV ");
            
        }

        }
    
    protected boolean alreadyRegistret(String name){
        return list.stream().anyMatch(p -> (p.get_name().equalsIgnoreCase(name)));   
    }
    

     protected void kjop_add(String name, String title){
         list.stream().filter(p -> (p.get_name().equalsIgnoreCase(name))).forEachOrdered(p -> {
             p.add_dvdlist(title);
        });
     }
     
     protected void laan(String owner, String loaner, String title){  
         for(Person p : list){
             if(p.get_name().equalsIgnoreCase(owner)){
                 if(p.finnes(title)){
                    for(Person pp : list){
                        if(pp.get_name().equalsIgnoreCase(loaner)){
                            pp.add_loanlist(title);
                            p.remove_dvdlist(title);
                            p.add_givelist(title);
                            return;
                        }
                       
                    }
                 }
                 else{
                     System.out.println(title + " IS NOT AVALABLE AT THE MOMENT");
                 }
             }
         }
         
     }
     

     

    public void Kjop(){
        
        System.out.println(" NAME OF THE BUYER ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine().toLowerCase();
        System.out.println(" TITLE OF THE DVD ");
        String title = in.nextLine().toLowerCase();
            if(!alreadyRegistret(name)){
                System.out.println(" YOUR NAME IS NOT REGISTER IN ARKIV ");  
                return;

            }
            else{
                kjop_add(name, title);
                System.out.println(" DVD IS ADDED ");
                return;
                }
            
        }


        
    
    public void Loan(){
        System.out.println(" NAME OF THE PERSON ");
        Scanner in = new Scanner(System.in);
        String loaner = in.nextLine().toLowerCase();
        System.out.println(" NAME OF THE PERSON YOU WANT TO BORROW FROM ");
        String owner = in.nextLine().toLowerCase();
        System.out.println(" TITLE OF THE DVD ");
        String title = in.nextLine().toLowerCase();
        laan(owner,loaner,title);
        
    }
    

    public void Oversikt() {
       
        list.stream().map(person -> {
            System.out.println(person.get_name().toUpperCase());
            return person;
        }).map(person -> {
            System.out.println("OWN : " + person.dvdlist.size()+" DVDś ");
            return person;
        }).map(person -> {
            person.print_dvdlist();
            return person;
        }).map(person -> {
            System.out.println("BORROW : " + person.loanlist.size()+" DVDś ");
            return person;
        }).map(person -> {
            person.print_loanlist();
            return person;
        }).map(person -> {
            System.out.println("LEND : " + person.givelist.size()+" DVDś ");
            return person;
        }).map(person -> {
            person.print_givelist();
            return person;
        }).forEachOrdered(_item -> {System.out.println();
        });
      System.out.println();
    }
    
    
         protected void retur(String own, String laan, String title){
             for(Person owner : list){
                 if(owner.get_name().equalsIgnoreCase(own)){
                     for(Person loner : list){
                         if(loner.get_name().equalsIgnoreCase(laan)){
                             if(loner.finnes_lann(title)){
                                 loner.remove_loanlist(title);
                                 owner.add_dvdlist(title);
                                 owner.remove_givelist(title);
                             }
                             else{
                                 System.out.println(" YOU HAVE NOT BORROWED THE DVD  ");
                                return;
                             }
                             
                         }
                     }
                 }
             }
             
    
}
    
    public void Return() {
        System.out.println(" NAME OF THE PERSON YOU WANTS TO RETURN DVD ");
        Scanner in = new Scanner(System.in);
        String loaner = in.nextLine().toLowerCase();
        System.out.println(" NAME OF THE PERSON YOU WANT TO RETURN TO ");
        String owner = in.nextLine().toLowerCase();
        System.out.println(" TITLE OF THE DVD ");
        String title = in.nextLine().toLowerCase();
        retur(owner,loaner,title);
        
        
    }
    public void Vis(){
        System.out.println(" CLICK * TO SEE EVERYTHING IN THE ARKIV OR THE PERSON YOU WANT TO SEE ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().toLowerCase();
        if(input.equalsIgnoreCase("*")){
            Oversikt();
        }
        else{
            vis(input);
        }
        
    }
    
    
    
    protected void vis(String name){
        list.stream().filter(p -> (p.get_name().equalsIgnoreCase(name))).map(p -> {
            System.out.println("OWN : " + p.dvdlist.size()+" DVDś ");
            return p;
        }).map(p -> {
            p.print_dvdlist();
            return p;
        }).map(p -> {
            System.out.println();
            return p;
        }).map(p -> {
            System.out.println("LEND: " + p.givelist.size()+" DVDś ");
            return p;
        }).map(p -> {
            p.print_givelist();
            return p;
        }).map(p -> {
            System.out.println();
            return p;
        }).map(p -> {
            System.out.println("Borrowed : " + p.loanlist.size()+" DVDś ");
            return p;
        }).map(p -> {
            p.print_loanlist();
            return p;
        }).forEachOrdered(_item -> {
            System.out.println();
        });
        
    }
 
    

    
}
