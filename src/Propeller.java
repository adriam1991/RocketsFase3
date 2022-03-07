

public class Propeller {

    private int power;
    private int maxPower;

    public Propeller() {
    }

    public void addPower(){
        this.power = power + 10;
    }

    public void restPower(){
        this.power = power - 10;
    }

    public int getPower() {
        return power;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }
}
