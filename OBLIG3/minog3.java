import java.util.Arrays;

public class minog3 {

    //write a program using arrays where A) you fill numbers into an array and print them out 
  // B) delete an elemnet from the array you create in an ordered way.

    public static void main(String[] args) {
        int[] array   = new int[10];
        
        for(int i = 0; i < array.length; i++){
         array[i]=i+1;
         }        
        System.out.println(Arrays.toString(array));
        int size=10;
        int pos=5;
        int[]Array={1,2,3,4,5,6,7,8,9,10,11};
    
            for (int k= pos; k < size ; k++){
            Array[k]=Array[k+1];      
}
          int[] newArray= new int[size]; 
             for(int k=0; k<size; k++){
              newArray[k]=Array[k];
                System.out.println(newArray[k]);
      
}
        
       
    }
    
          
}
