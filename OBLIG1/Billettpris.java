
import java.util.Scanner;
public class Billettpris {

   
    public static void main(String[] args) {
  
      int fullprice=50;
      int halfprice= 25;
     
      Scanner in=new Scanner(System.in);
      System.out.println("Enter age");
      int age=in.nextInt();
      if (age < 12) {
      System.out.println(halfprice);
      }
      else if (age > 67){
      System.out.println(halfprice);
      }
      else {
     System.out.println(fullprice);
    }
        
    }
      
      
    }
    

