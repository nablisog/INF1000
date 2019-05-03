


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DVDAdministrasjon {
    HashMap<String, Person> personlist = new HashMap<>();


    
    public void setPerson(Person p){
        if(!personlist.containsKey(p.toString()))
            personlist.put(p.toString(), p);
    }

    public Person getPerson(String name){
	if(personlist.containsKey(name))
	    return personlist.get(name);
	return null;
    }



    public void showList(){

	for (Map.Entry<String, Person> entry : personlist.entrySet()) {
	    System.out.println(entry.getKey() );
	    entry.getValue().showList();
	}
    }
    public void oversikt(){
	for(Map.Entry<String, Person> entry : personlist.entrySet()){
	    Person p = entry.getValue();
	    System.out.println("The person " + p );
	    System.out.println("has " + p.dvdlist.size());
	    System.out.println("lante " + p.dvdgiven.size());
	    System.out.println("gitt" + p.dvdborrowed.size());
	}
    }

    public void menu(){

	System.out.println("1: Nyperson");
	System.out.println("2: kjop");
	System.out.println("3: laan");
	System.out.println("4: vis");
	System.out.println("5: oversikt");
	System.out.println("6: Retur");
	System.out.println("7: Avslutt");
    }
    public void NyPerson(){
	Scanner in=new Scanner (System.in);
	System.out.println("hva heter den nye person");
	String name = in.nextLine();
	Person p = new Person(name);		
	if(!personlist.containsKey(p.toString()))
	    personlist.put(p.toString(), p);
        else
            System.out.println("Allerede registrart");
    }
    public void kjop(){
	Scanner in=new Scanner(System.in);
	System.out.println("Hvem kjoper DVD-en");
	String name = in.nextLine();
	//Person p = getPerson(name);
	Person p=personlist.get(name);
	if(personlist.containsKey(name)){
	    System.out.println("Hva er titlen paa dvd-en");		    
	    String title = in.nextLine();

	    p.setDVD(title, new DVD(title, p));

	} else 
	    System.out.println("Registrere personen forst");

    }

    public void laan(){
	System.out.println("Hvem vil laane dvden");
	Scanner in=new Scanner(System.in);
	String name = in.nextLine();
	Person p = getPerson(name);

	if(p != null){
	    System.out.println("Hvem skal dvden laanes fra");
	    name = in.nextLine();
	    Person p2 = getPerson(name);
	    if(p2 != null){
		System.out.println("Hva er titlen paa dvden");
		String titl = in.nextLine();	
              
		if(p.dvdlist.containsKey(name)){
		    if(p.dvdlist.get(titl).checkIfRented()!=true)

			p.borrowDVD(titl, p2);

		
		} 
                else
		    System.out.println("enten personen er ikke registrert eller har ikke dvden");

	    }
	  
	}
    }
    public void vis(){
	System.out.println("Hvilen personen vil du se ( * for all)");
	Scanner in=new Scanner(System.in);
	String name = in.nextLine();
	if(name.equalsIgnoreCase("*")){
	    showList();
	}
	else if(personlist.containsKey(name)){
	    Person p = getPerson(name);
	    p.showList();
	} 
	else 
	    System.out.println("fant ikke personen");

    }
    public void returne(){
	System.out.println("hvem har lant dvden");
	Scanner in=new Scanner(System.in);
	String name = in.nextLine();
	if(personlist.containsKey(name)){
	    Person p = personlist.get(name);
	    System.out.println("hva er titlen som skal returnere?");
	    String dvdName = in.nextLine();
	    if(p.dvdgiven.containsKey(dvdName)){
		DVD dvd = p.returnDVD(dvdName); // changed here


	    }
	} else 
	    System.out.println("fant ikke personen");

    }
    public void runMenu(){

	menu();
	Scanner in = new Scanner(System.in);
	String choice=in.nextLine();

	while (!choice.equalsIgnoreCase("7")){

            if(choice.equalsIgnoreCase("1")){
		NyPerson();
	    }
	    if(choice.equalsIgnoreCase("2")){
		kjop();
	    }

	    if(choice.equalsIgnoreCase("3")){
		laan();
	    }

	    if(choice.equalsIgnoreCase("4"))
		oversikt();


	    if(choice.equalsIgnoreCase("5")){
		vis();
	    }

	    if(choice.equalsIgnoreCase("6")) {
		returne();
	    }
	    menu();
	    choice=in.nextLine();

	}
	System.out.println("GOOD BYE");
    }
    public void readFile(String fil) throws Exception{
        Scanner in=new Scanner(new File(fil));
        Person p = null;
        Person p2=null;
        DVD d=null;
        while(in.hasNextLine()){
	    String txt=in.nextLine();
	    if(txt.isEmpty())
		continue;
	    else {
               
		if(!txt.equals("-")){
		    p=new Person(txt);
		}
		else {
		    String txt2=in.nextLine();         
		    String title=in.nextLine();
                    
		    if(title.startsWith("*")){
			p2=getPerson(txt2);
			if(p2 != null){
			    p2.setBorrowedDVD(title, d, p);
                        }
			else{
			    p2=new Person(txt2);
			    p2.setBorrowedDVD(title, d, p);
			}
		    }
		    else{
			p.setDVD(title, new DVD(title,p));
                    
		    }
          
		}
         
            }
     
	}
        
    }

}

