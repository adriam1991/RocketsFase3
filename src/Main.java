import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        // 1. Creem dos coets amb els codis “32WESSDS” I “LDSFJA32”.
        Rocket rocket1 = new Rocket("32WESSDS");
        Rocket rocket2 = new Rocket("LDSFJA32");
        assignPowerRocket1(rocket1);
        assignPowerRocket2(rocket2);

        // 2. Mostrar a pantalla el codi dels coets, el nombre de propulsors que té i la potència
        //màxima de cada propulsor.
        printStatusResult(rocket1);
        printStatusResult(rocket2);

        // 3. Accelerar amb els coets tres cops
        rocket1.accelerate(3);
        rocket2.accelerate(3);

        // 4. Mostrar a pantalla la potencia actual (suma de les potencies per propulsor)
        calculateAndPrintTotalPower(rocket1);
        calculateAndPrintTotalPower(rocket2);

        //5. Frenar cinc cops amb el primer coet (“32WESSDS”) i accelerar set amb el segon coet.
        rocket1.decelerate(5);
        rocket2.accelerate(7);

        //6. Mostrar a pantalla la potencia actual (suma de les potencies per propulsor)
        calculateAndPrintTotalPower(rocket1);
        calculateAndPrintTotalPower(rocket2);

        //7. Accelerar 15 cops amb els dos coets.
        rocket1.accelerate(15);
        rocket2.accelerate(15);

        //8. Mostrar a pantalla la potencia actual
        printStatusResult(rocket1);
        printStatusResult(rocket2);
    }

    private static void assignPowerRocket1(Rocket rocket1) throws Exception {
        rocket1.managePower( 10);
        rocket1.managePower( 30);
        rocket1.managePower( 80);
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
        System.out.println("El coet " + rocket.getCode() + " es: " );
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
