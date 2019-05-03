



public class Ord {
    
    private String tekst;
    private int counter;
    public Ord(String tekst){
        this.tekst=tekst;
        counter=0;
    }
    public String toString(){
      return this.tekst;
    }
    public int hentAntall(){
        oakAntall();
        return this.counter;
    }
    public void oakAntall(){
        counter++;
    }
    public int hentLengde(){
        return this.tekst.length();
    }
    public int plassDokument(){
        
        return hentAntall() * hentLengde();
        
    }
    
}
