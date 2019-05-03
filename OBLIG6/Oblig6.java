

public class Oblig6 {

    
    public static void main(String[] args) throws Exception{
       
        
        OrdListe list=new OrdListe();
        
        list.lesBok("/home/nablis/oblig6/scarlet.txt");
        
         System.out.println("the number of unike words are " + list.getunik());

        //legg til ord
        list.leggTilOrd("Edinburgh");
       
        
        
        System.out.println("Ordet watson forkommer " + list.antallForkomester("watson"));
       
         System.out.println("Ordet elementery forkommer " + list.antallForkomester("elementary"));
       // finn ord
        System.out.println("word found " + list.finnord("Edinburgh"));
        
       System.out.println("the number of unike words are " + list.getunik());
       
       // finn lengeste
       
      System.out.println( "the longest word is " + list.finnLengeste().toString());
      
      // finn korteste
      
      System.out.println( "the shortest word  is " + list.finnKorteste().toString());
      
      // tar mest plass
      
      System.out.println("the word that takes mest plass is " + list.tarMestPlassDokument().toString());
    }
    
}
