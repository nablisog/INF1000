



public class DVD {
    private String name;
    Person owner;
    Person renter;
    
    public DVD(String name, Person owner){
	this.name = name;
	this.owner = owner;
    }
    // sjekker om dvden er laant
    public boolean checkIfRented(){
	return renter != null;
	
    }
   
    public void setRenter(Person p){
	this.renter = p;
    }
    public Person getOwner(){
	return this.owner;
    }
    // returner renter hvis checkifRented() er != null
    public Person getRenter(){
        if(checkIfRented())
            return this.renter;
        else
            return null;
        
    }
    public String toString(){
	return this.name;
    }
}
