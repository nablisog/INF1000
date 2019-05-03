import java.util.Scanner;
public class Minoppgave1 {

    
    public static void main(String[] args) {
      //This program tells whether a student passed or failed on his or her exam
        int passing_grade=50;
      Scanner in=new Scanner(System.in);
      System.out.println("What did you score on your test?");
      int score=in.nextInt();
      
      if(score>=50){
       System.out.println("congratulation! You passed the exam");    
      }
      else{
          System.out.println("Unfortunately you failed to pass the exam");
      }  
    }   
}