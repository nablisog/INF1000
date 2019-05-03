import java.util.Scanner;
public class FirstArray {

   
    public static void main(String[] args) {
       //A
        int[] myArray = new int[4];
       //B
        int i=0;
        int j=0;
       
       while(i<myArray.length){
             myArray[i]=i;
           i ++;
          
       }
        //C 
          myArray[0]=1337;
          myArray[3]=1337;
          
       for(int x:myArray)
           System.out.println(x);
       
       //D
       int l=0;
       String[]maArray=new String[4];
       System.out.println("Enter your name");
       Scanner in=new Scanner(System.in);
       String input=in.nextLine();
          while(l < maArray.length){
          maArray[l]=input;
          l++;
       System.out.println("Enter another your name");
       Scanner n=new Scanner(System.in);
       input=n.nextLine(); 
       }
          int k=0;
         while (k<maArray.length){
         System.out.println(maArray[k]);
         k++;
      } 
    }
    
}