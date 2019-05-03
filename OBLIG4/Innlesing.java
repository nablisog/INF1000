import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Innlesing {

  
    public static void main(String[] args) throws Exception {
        int counter=0;
        ArrayList<String> l = new ArrayList<>(); 
        String f= "winnie.txt";
        Scanner in= new Scanner(new File(f));
        System.out.println("put a word from winnie.txt");
        Scanner x=new Scanner(System.in);
        String b=x.nextLine();
        while(in.hasNextLine()){
            String txt=in.nextLine();
            l.add(txt);
        if(txt.equalsIgnoreCase(b))
                counter++;
        } 
        //for (String z: l){System.out.println(z);}
 System.out.println("THE WORD YOU'RE LOOKING IS REPEATED " + counter+ " TIMES");
                }
                }