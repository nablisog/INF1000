import java.util.Scanner;
import java.io.File;


public class Temperature {

   
    public static void main(String[] args)throws Exception {
       String f="temperature.txt";
       Scanner infile=new Scanner(new File(f));
       int []r=new int[12];
       int i=0;
       while (infile.hasNextInt()){
           r[i]=infile.nextInt();
           i++;}
       for (int z: r){
           System.out.println(z);
       }
       
       
           infile.close();
         
           int sum=0;
           for(int k=0; k< r.length;k++){
              sum=sum+r[k]; 
           }
          System.out.println("TOTAL = " + sum );
          double avg = (double) sum / (double) r.length;
          System.out.println("AVERAGE = " + avg );
    }
    
}