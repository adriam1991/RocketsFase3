public class Propeller {

    private int currentPower;
    private int maxPower;

    public Propeller() {
        this.currentPower = currentPower=0;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    public void increasePower(){
        this.currentPower += 10;
        if(currentPower>maxPower){
            currentPower=maxPower;
        }
    }

    public void decreasePower(){
        this.currentPower = currentPower - 10;
        if(currentPower<=0){
            currentPower=0;
        }

    }

    public int getCurrentPower() {
        return currentPower;
    }

    public int getMaxPower() {
        return maxPower;
    }


}