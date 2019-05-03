import java.util.Scanner;
public class EnkelKalkulator {

   
    public static void main(String[] args) {
        
        caller();
       
    }
        public static void addition(int number1, int number2){
        int sum=number1+number2;
        System.out.println(" summen er " + sum);
       }
        public static void subtraction(int number1, int number2){
           int sum=number1-number2;
           System.out.println(" differansen er " + sum);
        } 
        public static void multiplication(int number1, int number2){
           int sum=number1*number2;
           System.out.println(" produktet er " + sum);
          
        }
        public static void caller(){
          System.out.println("put a number");
          Scanner in=new Scanner(System.in);
          int num=in.nextInt();
          System.out.println("put another number");
          Scanner n=new Scanner(System.in);
          int num1=n.nextInt();
          addition(num,num1);
          subtraction(num,num1);
          multiplication(num,num1);
          
        }
    }
