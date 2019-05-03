

import java.util.Scanner;
public class Metoder {

    public static void main(String[] args) {
     caller();
     caller();
     caller();}
   public static void caller()  {
       Scanner in=new Scanner(System.in);
       System.out.println("Enter your name ");
       String name =in.nextLine();
       System.out.println("Enter address ");
       String address=in.nextLine();
       System.out.println( "HI," + name + " You're from " +  address );
       }}

