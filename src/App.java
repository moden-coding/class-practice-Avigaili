public class App {
    public static void main(String[] args) throws Exception {

        parkingLot lot = new parkingLot(2);

        System.out.println("r there open spots = " + lot.openSpot());

        lot.parkCar();
        lot.parkCar();
        lot.parkCar();

        System.out.println("r there open spots = " + lot.openSpot());

        lot.removeCar();

        System.out.println("r there open spots = " + lot.openSpot());

    }
}
