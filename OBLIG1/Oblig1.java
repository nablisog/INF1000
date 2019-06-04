
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
public class Oblig1 {

    Oblig1(){

}
static int maks(int[] a){
    if(a.length==0){
       throw new NoSuchElementException();
    }
    int max=a[0];
    for (int i = 0; i < a.length; i++){
        if(a[i]> max){
            max=a[i];
         }

        }
    return max;
    }
 static int ombyttinger(int[] a){

       int cc=0;
        for (int i = 0; i < a.length-1; i++)
            for (int j = 0; j < a.length-i-1; j++)
                if (a[j] > a[j+1]){
                    cc++;
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }


            return cc;
  }
 static boolean sorted(int[]a){
        for (int i = 0; i < a.length; i++)
                if (a[i] > a[i+1]){
                    return false;
                }
        return true;

    }
 static int antallUlikeSortert(int[] a){

        if(!sorted(a)){
            throw new IllegalStateException("Not Sorted");
        }
        ArrayList<Integer> list= new ArrayList<>();

        for (int i = 0; i < a.length; i++)
                if (!list.contains(a[i])){
                    list.add(a[i]);

                }
        return list.size();
    }
static int antallUlikeUsortert(int[] a){
       ArrayList<Integer> list= new ArrayList<>();
        for (int i = 0; i < a.length; i++)
                if (!list.contains(a[i])){
                    list.add(a[i]);
    }
        return list.size();

}
static void delsortering(int[] a){
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int i : a) {
            if (i%2!=0 ) {
                odd.add(i);
           }else {
                even.add(i);
    }
}
Collections.sort(odd);
Collections.sort(even);
odd.addAll(even);
System.out.println(odd);

}
static void rotasjon(char[] a){
    char b = a[a.length-1];
    for(int i = a.length-1; i > 0; i--)
        a[i]=a[i-1];
        a[0]=b;
        System.out.println(Arrays.toString(a));

    }
static void rotasjon(char[] a, int k){
        if(a.length==0 || a.length==1){
            System.out.println("No change");
        }
            for(int i=0; i < k; i++){
                for(int j=a.length-1; j > 0; j--){
                char tmp=a[j];
                a[j]=a[j-1];
                a[j-1]= tmp;
            }
        }


        System.out.println(Arrays.toString(a));
    }
static String flett(String s, String t){
        String n="";
        if(s.length()==t.length())
        for(int i=0;i<s.length();i++){
            //System.out.print(s.substring(i, i+1) + t.substring(i, i+1));

        }
        else if(s.length()>t.length()){
            for(int i=0; i<t.length()-1;i++){
                n+=s.substring(i,i+1) + t.substring(i,i+1);


            }
            n+=s.substring(t.length(), s.length());
            //System.out.println(n);


        }
        else{
            for(int i=0;i<s.length()-1;i++){
              n+=s.substring(i, i+1) + t.substring(i, i+1);
            //System.out.print(s.substring(i, i+1) + t.substring(i, i+1)  );

        }
            n+=t.substring(s.length(), t.length());
            //System.out.println(n);
     }
        return n;

    }
 static int[] indekssortering(int[] a){
        int []index=new int[a.length];
        for(int i=0;i<index.length;i++){
            index[i]=i;
        }

        for (int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
            if(a[i]>a[j]){
                int tmp=a[i];
                a[i]=a[j];
                a[j]=tmp;

                int pos=index[i];
                index[i]=index[j];
                index[j]=pos;
            }

          }
            //System.out.println(index[i]);


        }
        return index;

    }
  static int[] tredjeMin(int[] a){

      int m1=a[1]; int m2=a[1]; int m3=a[1];
        int i1=1; int i2=1; int i3=1;
        if(a.length < 3){
            throw new NoSuchElementException();
        }
        for(int i=0; i<a.length;i++){
            if(a[i]< m3 && a[i]>= m2){
                m3=a[i];
                i3=i;

            }
            if(a[i]< m2 && a[i]>=m1 ){
                m3=m2;
                i3=i2;
                m2=a[i];
                i2=i;
            }
            if(a[i]< m1 ){
               m3=m2;
               i3=i2;
               m2=m1;
               i2=i1;
               m1=a[i];
               i1=i;
            }

        }
    int index[]= new int[]{i1,i2,i3};
   return index;
 }

  static boolean inneholdt(String longer, String shorter){
     boolean found=false;
     for(int i=0;i<shorter.length();i++){
         boolean f=false;
         for(int j=0;j<longer.length();j++){

             if(shorter.charAt(i)==longer.charAt(j)){
                 f=true;
                 found=f;
                 break;
             }else{
                 f=false;
             }
         }

     }
    return found;
 }
}
