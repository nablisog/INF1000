import java.util.Scanner;

public class Kalkulator { 
    public static void main(String[] args) {
        int addSvar = addition(3, 4); 
        System.out.println(addSvar);
        int subSvar = subtration(5, 2);
        System.out.println(subSvar);
int helDivSvar = heltallsdivisjon(10, 3);
        System.out.println(helDivSvar);
        double divSvar = divisjon(10, 3);
        System.out.println(divSvar);
    }    
   public static int addition(int n1, int n2) {
       int sum=n1+n2;
       return sum;}
   public static int subtration(int nr1, int nr2) {
       int sum1=nr1-nr2;
       return sum1;}
   public static int heltallsdivisjon(int num1, int num2){
       int sum2=num1/num2;
       return sum2;
   }
   public static double divisjon(double number1, double number2){
       double sum3= number1/number2;
       return sum3;
   }
}
    