


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class OrdListe {
    
    private ArrayList<Ord> list;
   
    int counter;
    
   public OrdListe(){
       
        list=new ArrayList<>();
        counter=0;
    }
    public void lesBok(String fil) throws Exception{
        Scanner in=new Scanner(new File(fil));
       
        while(in.hasNextLine()){
            String txt=in.nextLine();
            
            Ord os=new Ord(txt);
            list.add(os);
            counter++;
            
        }
        
        
        in.close();
    }
    
    public void print(){
      for(Ord s: list)
          System.out.println(s.toString());
    }
   
    public void leggTilOrd(String ord){
        Ord os=new Ord(ord);
        if(!list.contains(os.toString().equalsIgnoreCase(ord)))
            list.add(os);
            
        else
           counter++;
        
    }
    public Ord finnord(String tekst){
       Ord os=new Ord(tekst);
       for(int i=0;i<list.size();i++){
           if(list.get(i).toString().equalsIgnoreCase(tekst))
               return os;
       }
               return null;
    }
    public int antallOrd(){
        return counter;
    }
    public int antallForkomester(String tekst){
        int count=0;
        Ord os=new Ord(tekst);
       for(int i=0;i<list.size();i++){
           if(list.get(i).toString().equalsIgnoreCase(tekst))
               count++;
       }
             if(count > 0)
                 return count;
             else
                 return 0;
    }
    public int getunik(){
        ArrayList<String> temp=new ArrayList<>();
        int count=0;
        for(Ord or:list){
            if(!temp.contains(or.toString())){
                temp.add(or.toString());
                 count++;
            }
        }
        return count;
    }
    public Ord finnLengeste(){
        String longest="";
        Ord or=new Ord(longest);
        int counter=0;
       for(int i=0;i<list.size();i++){
          if(list.get(i).toString().length() > or.toString().length()){
              or=list.get(i);
          }
          else{
              String t=list.get(i).toString();
              t=or.toString();
          }
         
       }
       return or;
      
        
    }
    public Ord finnKorteste(){
        
        Ord or=list.get(0);
        for(int i=1;i<list.size();i++) {
            
             
          
          if(list.get(i).toString().length() < or.toString().length()){
             or=list.get(i);
          }
          else{
              String t=list.get(i).toString();
              t=or.toString();
          }
           }
       
       return or;
    }
    public Ord tarMestPlassDokument(){
         int first=0;
         int second=0;
         String tx="";
         String temp="";
         String temp2="";
        for(int i=0;i<list.size();i++){
            temp=list.get(i).toString();
            for(int j=0;j<list.size();j++){
                temp2=list.get(j).toString();
                if(temp.equalsIgnoreCase(temp2)){
                    first++;
                }
            }
            if(first > second){
                second=first; 
            tx=list.get(i).toString();
            }
            first=0;
            
        }
        Ord os=new Ord(tx);
        return os;
    }
    
   
}
