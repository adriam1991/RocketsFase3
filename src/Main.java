public class Main {

    public static void main(String[] args) throws Exception {

        Rocket rocket1 = createRocket1();
        Rocket rocket2 = createRocket2();
        accelerateRocketXtimes(rocket1, 3);
        accelerateRocketXtimes(rocket2, 3);
        decelerateRocketXTimes(rocket1, 5);
        accelerateRocketXtimes(rocket2, 7);
        accelerateRocketXtimes(rocket1, 15);
        accelerateRocketXtimes(rocket2, 15);

    }


    private static void accelerateRocketXtimes(Rocket rocket, int times) {
        for (int i = 0; i < times; i++) {
            rocket.accelerate();
        }
        printStatusResult(rocket);
        Rocket.calculateAndPrintTotalPower(rocket);

    }


    private static void decelerateRocketXTimes(Rocket rocket, int times) {
        for (int i = 0; i < times; i++) {
            rocket.decelerate();
        }
        printStatusResult(rocket);
        Rocket.calculateAndPrintTotalPower(rocket);
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

    private static void assignPowerRocket1(Rocket rocket) throws Exception {
        int[] powers = {10, 30, 80};
        for (int power : powers) {
            rocket.addPropeller(power);
        }
    }

    private static void assignPowerRocket2(Rocket rocket) throws Exception {
        int[] powers = {30, 40, 50, 50, 30, 10};
        for (int power : powers) {
            rocket.addPropeller(power);
        }
    }

    private static void printStatusResult(Rocket rocket) {
        System.out.println("El coet " + rocket.getCode() + " te: ");
        System.out.println(rocket.showPropellerStatus());
    }


}