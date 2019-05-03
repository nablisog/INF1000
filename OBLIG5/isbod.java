import java.util.Arrays;


public class isbod {
private final int antall_ansatte=10;
private String []ansatte = new String[antall_ansatte];
private int counter=0;
String name;
    public void ansett(String navn){
     this.name=navn;
    if (counter < antall_ansatte){
       ansatte[counter]=name;
       counter++;
    }
    else {
        System.out.println("its full ");
    }
    }
    public void giSistemannSparken(){
       if (counter > 0){
           ansatte[counter] = null;
           counter--;
       }
       else {
           System.out.println("nobody is gonna get fired");
       }
    }
    public void printAlleAnsatte(){
    for (int i=0; i<counter;i++) {
        System.out.println(ansatte[i]); 
    }
   
    }
}
