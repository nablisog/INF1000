
package library;

import java.util.*;

/**
 *
 * @author nablisog
 */
public class Person {
    
    ArrayList <Dvd> dvdlist = new ArrayList<>();
    ArrayList <Dvd> loanlist = new ArrayList<>();
    ArrayList <Dvd> givelist = new ArrayList<>();

    private String name;
    
    
    Person(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
    
    public String get_name(){
        return name;
    }

    public void add_dvdlist(String title){
        if(!finnes(title)){
            dvdlist.add(new Dvd(title));
        }

    }
        public void remove_dvdlist(String title) {          
            for(Dvd d : dvdlist){
                if(d.get_title().equalsIgnoreCase(title)){
                    dvdlist.remove(d);
                    return;
                }
               
            }
            
        
    }
    
    public void add_loanlist(String title){
        loanlist.add(new Dvd(title));
    }
    
    public void add_givelist(String title){
        givelist.add(new Dvd(title));
    }
    
    
    public boolean finnes(String title){
        return dvdlist.stream().anyMatch(d -> (d.get_title().equalsIgnoreCase(title)));
    }
    
    public boolean finnes_lann(String title){
        return loanlist.stream().anyMatch(d -> (d.get_title().equalsIgnoreCase(title)));
    }
      
    public void remove_loanlist(String title) {          
        for(Dvd d : loanlist){
            if(d.get_title().equalsIgnoreCase(title)){
               loanlist.remove(d);
               return;
                }
               
            }   
    }
    
    public void remove_givelist(String title) {          
        for(Dvd d : givelist){
           if(d.get_title().equalsIgnoreCase(title)){
               givelist.remove(d);
               return;
                }
               
            }
            
        
    }

    
    
    public void print_dvdlist(){
        dvdlist.forEach(list -> {
            System.out.println(list.get_title());
        });
    }

    public void print_loanlist() {
        loanlist.forEach(list -> {
            System.out.println(list.get_title());
        });
    }
    
    public void print_givelist() {
        givelist.forEach(list -> {
            System.out.println(list.get_title());
        });
    }

    

    
    
}
