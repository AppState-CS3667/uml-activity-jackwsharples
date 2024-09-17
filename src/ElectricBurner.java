public class ElectricBurner extends Burner{

    private double voltReq;
    private double ampReq;

    public ElectricBurner(double voltReq) {
        super(1, 1, 1);
    }
 
    public void increaseTemp(){
    }
  
    public void decreaseTemp(){
    }

    public double getVoltReq(){ 
        return voltReq; 
    }
}
