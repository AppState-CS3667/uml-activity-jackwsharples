public class ElectricBurner extends Burner{

    private double voltReq;
    private double ampReq;

    public ElectricBurner(double voltReq) {
        super(voltReq);
    }
 
    public void increaseTemp(){
    }
  
    public void decreaseTemp(){
    }

    public double getVoltReq(){ 
        return voltReq; 
    }
}
