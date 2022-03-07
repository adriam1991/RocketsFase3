import java.util.ArrayList;
import java.util.List;

public class Rocket {

    private String code;
    public List<Propeller> powerPropellants = new ArrayList<>();

    public List<Propeller> getPowerPropellants() {
        return powerPropellants;
    }

    public void setPowerPropellants(List<Propeller> powerPropellants) {
        this.powerPropellants = powerPropellants;
    }

    public Rocket(String code) {
        this.code = code;
    }

    public String printStatus() {
        String result = "";
        int i = 1;
        for (Propeller propeller : powerPropellants) {
            result += "Propulsor " + i + " :" + propeller.getMaxPower() + " potencia\n";
            i++;
        }
        return result;
    }

    public void managePower(int maxPower) throws Exception {
        powerPropellants.add(createPropeller(maxPower));
    }

    public void accelerate(int times) {
        for (Propeller propeller : powerPropellants) {
            int count = 0;
            while (count < times) {
                if (propeller.getPower() < propeller.getMaxPower()) {
                    propeller.addPower();
                    count++;
                } else {
                    count = times;
                }
            }
        }
    }

    public void decelerate(int times) {
        for (Propeller propeller : powerPropellants) {
            int count = 0;
            while (count < times) {
                if (propeller.getPower() > 0) {
                    propeller.restPower();
                } else {
                    count = times;
                }
            }
        }
    }

    private Propeller createPropeller(int maxPower) throws Exception {
        Propeller propeller = new Propeller();
        propeller.setMaxPower(maxPower);
        return propeller;
    }

    public String getCode() {
        return code;
    }

}
