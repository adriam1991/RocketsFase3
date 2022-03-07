import java.util.ArrayList;
import java.util.List;

public class Rocket {

    private String code;
    public List<Propeller> powerPropellants = new ArrayList<>();

    public Rocket(String code) throws Exception {
        checkCode(code);
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


    private void checkCode(String code) throws Exception {
        if (code.length() != 8) throw new Exception();
    }

    public void managePower(int maxPower) throws Exception {
        powerPropellants.add(createPropeller(maxPower));
    }

    private Propeller createPropeller(int maxPower) throws Exception {
        Propeller propeller = new Propeller();
        propeller.setMaxPower(maxPower);
        return propeller;
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


    public String getCode() {
        return code;
    }

}