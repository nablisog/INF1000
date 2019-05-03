import java.util.Scanner;
public class SumTall {

    public static void main(String[] args) {
      System.out.println("put a number");
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      
      int total=0;
      while (num!=0){
       total=num+total;
       
     Scanner n=new Scanner(System.in);
      System.out.println("put a number");
       num=n.nextInt();
    }
      System.out.println( "the sum is " + total);
  }  
}