import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        Rocket rocket1 = createRocket1();
        Rocket rocket2 = createRocket2();
        rocket1Accelerate3times(rocket1);
        rocket2Accelerate3times(rocket2);
        rocket1Decelerate5times(rocket1);
        rocket2Accelerate7times(rocket2);
        rocket1Accelerate15times(rocket1);
        rocket2Accelerate15times(rocket2);

    }

    private static void rocket2Accelerate15times(Rocket rocket2) {
        rocket2.accelerate(15);
        System.out.println("Asceleracio 15 vegades:");
        printStatusResult(rocket2);

    }

    private static void rocket1Accelerate15times(Rocket rocket1) {
        rocket1.accelerate(15);
        System.out.println("Asceleracio 15 vegades:");
        printStatusResult(rocket1);
    }

    private static void rocket2Accelerate7times(Rocket rocket2) {
        rocket2.accelerate(7);
        System.out.println("Asceleracio 7 vegades:");
        calculateAndPrintTotalPower(rocket2);

    }

    private static void rocket1Decelerate5times(Rocket rocket1) {
        rocket1.decelerate(5);
        System.out.println("Desaleracio 3 vegades:");
        calculateAndPrintTotalPower(rocket1);

    }

    private static void rocket2Accelerate3times(Rocket rocket2) {
        rocket2.accelerate(3);
        System.out.println("Aceleracio 3 vegades:");
        calculateAndPrintTotalPower(rocket2);
    }

    private static void rocket1Accelerate3times(Rocket rocket1) {
        rocket1.accelerate(3);
        System.out.println("Aceleracio 3 vegades:");
        calculateAndPrintTotalPower(rocket1);
    }

    private static Rocket createRocket2() throws Exception {
        Rocket rocket2 = new Rocket("LDSFJA32");
        assignPowerRocket2(rocket2);
        printStatusResult(rocket2);
        return rocket2;
    }

    private static Rocket createRocket1() throws Exception {
        Rocket rocket1 = new Rocket("32WESSDS");
        assignPowerRocket1(rocket1);
        printStatusResult(rocket1);
        return rocket1;
    }

    private static void assignPowerRocket1(Rocket rocket1) throws Exception {
        rocket1.managePower(10);
        rocket1.managePower(30);
        rocket1.managePower(80);
    }

    private static void assignPowerRocket2(Rocket rocket2) throws Exception {
        rocket2.managePower(30);
        rocket2.managePower(40);
        rocket2.managePower(50);
        rocket2.managePower(50);
        rocket2.managePower(30);
        rocket2.managePower(10);
    }

    private static void printStatusResult(Rocket rocket) {
        System.out.println("El coet " + rocket.getCode() + " te: ");
        System.out.println(rocket.printStatus());
    }

    private static void calculateAndPrintTotalPower(Rocket rocket) {
        List<Propeller> propellerList = rocket.powerPropellants;
        int totalPower = 0;

        for (Propeller propeller : propellerList) {
            totalPower = totalPower + propeller.getPower();
        }

        System.out.println("Coet " + rocket.getCode() + "te potencia total de: " + totalPower);
    }
}