public class GasBurner extends Burner{
    private String gasType;

    public GasBurner() {
        super();
    }

    public boolean spark(){ 
        return true; 
    }
    public String getGasType(){ 
        return gasType; 
    }
    private void increaseGasFlow(){

    }
    private void decreaseGasFlow(){

    }
}
