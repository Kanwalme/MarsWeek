public class Mars {
    public static void main(String[] args) {
        String colonyName = "xColony";
        int shipPopulation = 300;
        double shipFood = 4000.00;
        boolean landing= true;
        String landingLocation = "The Hill";

        shipFood -= (shipPopulation * 0.75);
        shipFood -= (shipPopulation * 0.75);
        System.out.println(shipFood);

        shipFood += (4000.00 * 0.50);

        shipPopulation += 5;

        if (landingLocation.equals("The Plain")) {
            System.out.println("Bbzz Landing on the Plain");
        }else {
            System.out.println("Error! Flight plan already set. Landing on the plain");
        }
    }
}
