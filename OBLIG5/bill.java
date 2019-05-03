 public class bill {
  
    int distance;
    int maxdistance;
    double tank=25.00;
    double maxtank= 25.00;
    double bensinperkm= 1.5;
    int km;
    
    public boolean kjorkm(int km){
       tank=tank-(km*bensinperkm);
       distance=distance+km;
        if (tank<maxtank)
         
            return false;
        else
            
        return true;
    
    }
    public boolean fylltank(double liter){
        
        if(liter<tank){
         tank=tank+liter;   
            return false;
    }
        else 
            
        return true;
    }
    public double hentmaxdistance(double liter, double bensinperkm){
        double r=tank/bensinperkm;
        maxdistance=distance * km;
        System.out.println("u can drive "+r+"km");
        return r;
    }
    public int hentkilometertlstand(int km){
        maxdistance=distance * km;
        int sum=0;
        sum= sum+km;
        return sum;
    }
    
}
