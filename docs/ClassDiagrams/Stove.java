public class Stove {
    private Burner[] burners;

    public boolean hookUp(){
        return true;
    }
    public setBurnerTemp(int burner, double temp){

    }
    public boolean isHot(){ 
        return false; 
    }
    public boolean isHot(int burner){ 
        return false; 
    }
    public double getBurnerTemp(int burner){
        return 0.0; 
    }
    public Burner getBurner(int burner){
        return burners[burner];
    }
}
