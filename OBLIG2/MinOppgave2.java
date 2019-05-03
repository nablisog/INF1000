import java.util.Scanner;
public class MinOppgave2 {
//Write a program that has a method which has a parameter of name and age. In this program if 
 // a person is younger than 12 and older than 67, that person should pay half price other wise
    // fullprice.
   
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter your name");
        String input= in.nextLine();
        Scanner n= new Scanner(System.in);
        System.out.println("Enter your age");
        int ag= n.nextInt();
        
        
       caller(input,ag);
    }
    public static void caller(String name, int age){
        int half_price=10;
        int full_price=20;
        
        
         if(age < 12){
 System.out.println("You got a 50% offer which is" + half_price+ " kr");
         }
         else if (age>67){
 System.out.println("You got a 50% offer which is" + half_price+ " kr");  
         }
         else{
             System.out.println("The price is " + full_price + " kr" );
         } 
    }
}
