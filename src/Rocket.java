import java.util.ArrayList;
import java.util.List;

public class Rocket {

    private String code;
    private List<Propeller> powerPropellants = new ArrayList<>();

    public Rocket(String code) throws Exception {
        checkCode(code);
        this.code = code;
    }

    public String showPropellerStatus() {
        String result = "";
        int i = 1;
        for (Propeller propeller : powerPropellants) {
            result += "Propulsor " + i + " :" + propeller.getCurrentPower() + " potencia\n";
            i++;
        }
        return result;
    }


    private void checkCode(String code) throws Exception {
        if (code.length() != 8) throw new Exception();
    }

    public void addPropeller(int maxPower) throws Exception {
        Propeller p=createPropeller(maxPower);
        powerPropellants.add(p);
    }

    private Propeller createPropeller(int maxPower) throws Exception {
        Propeller propeller = new Propeller();
        propeller.setMaxPower(maxPower);
        return propeller;
    }

    public void accelerate() {
        for (Propeller propeller : powerPropellants) {
            propeller.increasePower();
        }
    }

        public void decelerate() {
            for (Propeller propeller : powerPropellants) {
                propeller.decreasePower();
            }
        }

    public static void calculateAndPrintTotalPower(Rocket rocket) {
        List<Propeller> propellerList = rocket.powerPropellants;
        int totalPower = 0;

        for (Propeller propeller : propellerList) {
            totalPower = totalPower + propeller.getCurrentPower();
        }

        System.out.println("Coet " + rocket.getCode() + "te potencia total de: " + totalPower);
    }


    public String getCode() {
        return code;
    }

}