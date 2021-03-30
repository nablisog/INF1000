/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author nablisog
 */
public class Dvd {
    
    private String title;
    private Person owner;
    private Person loaner;
    
       public Dvd(String title){
        this.title = title;
          
    }
    
    public Dvd(String title, Person owner){
        this.title = title;
        this.owner = owner;   
    }
        public Dvd(String title, Person owner,Person loaner){
        this.title = title;
        this.owner = owner; 
        this.loaner= loaner;
    }
    
        @Override
    public String toString(){
        return title;
    }
    
    public String get_title(){
        return title;
    }
    

    public Person get_owner(){
        return owner;
    }
    public Person get_loaner(){
        return loaner;
    }
    
    public void set_owner(Person owner){
        this.owner = owner;
    }
    
    public void set_loaner(Person loaner){
        this.loaner = loaner;
    }

}
