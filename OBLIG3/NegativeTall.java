

import java.util.Arrays;

public class NegativeTall {

    public static void main(String[] args) {
       int[] heltall = {1, 4, 5, -2, -4, 6, 10, 3, -2};
        int i=0;
        int counter=0;
        while(i<heltall.length){
           if(heltall[i]<0)
            
           counter++; 
           
           i++;
       }
       System.out.println("De negative tallene er " + counter);
       Arrays.sort(heltall);
       
       for (int m=0;m<heltall.length;m++)
       System.out.println(heltall[m]);
    }
     
  
}
