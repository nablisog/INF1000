import java.lang.NullPointerException;
import java.io.File;
import java.util.Scanner;
public class Valg {  
    public static void main(String[] args) throws Exception {
        int Ap=0;
        int KrF=0;
        int Sp=0;
        int H=0;
        String []r=new String[456];
        String f= "stemmer.txt";
        Scanner in= new Scanner(new File(f));
        while (in.hasNextLine()){    
        for(int i=0;i<r.length; i++){
            r[i]=in.nextLine();
            
            switch (r[i]) {
                case "Ap":
                    Ap++;
                    break;
                case "KrF":
                    KrF++;
                    break;
                case "Sp":
                    Sp++;
                    break;
                case "H":
                    H++;
                    break;
                default:
                    break;
                 
            }
            System.out.println(r[i]);
        }  
              double percentAP = Ap * 100 / 456;
              double percentKrF = KrF * 100 / 456;
              double percentH =  H * 100 / 456;
              double percentSp = Sp * 100 / 456;
              System.out.println("H FIKK "+ H + " STEMMER OG DET ER " + percentH + "%");
              System.out.println("KrF FIKK " + KrF + " STEMMER OG DET ER " + percentKrF + "%");
              System.out.println("Ap FIKK " + Ap + " STEMMER OG DET ER " +  percentAP + "%");
              System.out.println("Sp fikk " + Sp + " STEMMER OG DET ER "+  percentSp + "%");
}
        
    }
}
             
