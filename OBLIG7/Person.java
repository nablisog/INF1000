


import java.util.*;

public class Person {
    private String name;
    HashMap<String, DVD> dvdlist = new HashMap<>(); // list av dvder
    HashMap<String, DVD> dvdborrowed = new HashMap<>(); // borrowed av dvder
    HashMap<String, DVD> dvdgiven = new HashMap<>(); // gitt dvder
    
    public Person(String name){
	this.name = name;
    }
    
    public void setDVD(String name,DVD dv){
	if(!dvdlist.containsKey(name))
	    dvdlist.put(name, dv);
    }
    
    public void setBorrowedDVD(String name, DVD dvd, Person n){
	if(!dvdborrowed.containsKey(name)){
	    dvdborrowed.put(name, dvd);
	} 
    }
    public DVD getDVD(String name){
	if(this.dvdlist.containsKey(name)){
	    DVD dvd = dvdlist.get(name);
	   
	    return dvd;
	}	    
	return null;
	
    }
   
   
    
    public void borrowDVD(String name,Person ret){
        if(dvdlist.containsKey(name)){
            if(dvdlist.get(name).checkIfRented() !=true){
		DVD dvd = ret.getDVD(name);
		dvd.setRenter(ret);
		dvdborrowed.put(dvd.toString(), dvd);
		ret.dvdgiven.put(dvd.toString(), dvd);
            }
	}
	else
	    System.out.println("kan ikke lanne");
    }
   
    public DVD returnDVD(String name){
	DVD dvd = dvdborrowed.get(name);
	Person p = dvd.getOwner();
	p.setBorrowedDVD(dvd.toString(), dvd, dvd.getRenter());
	dvd.setRenter(null);
	return dvd;
    }

    public void showList(){
	for(Map.Entry<String, DVD> key: dvdlist.entrySet()){
	
	    if(dvdlist.get(key.getKey()).checkIfRented()){
		System.out.println(key.getKey());
		System.out.println(dvdlist.get(key.getKey()).getRenter());
	    } else {
		System.out.println(key.getKey());
	    }	    
	}
	System.out.println();
    }
    public String toString(){
	return this.name;
    }
}
