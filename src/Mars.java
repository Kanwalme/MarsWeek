import org.w3c.dom.ls.LSOutput;

public class Mars {
    public static void main(String[] args) throws InterruptedException {
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
        landing= landingCheck(100);
        new GuessingGame();
        new MarsExpedition();
        new FindingsLists();
    }
    public static boolean landingCheck(int loop) throws InterruptedException {
        for (int i = 0; i <=loop ; i++) {
            if((i%3==0) && (i%5==0)){
                System.out.println("Keep Center");
            }else if ((i%5==0)){
                System.out.println("Right");
            }else if((i%3==0)){
                System.out.println("left");
            }else{
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }

}
