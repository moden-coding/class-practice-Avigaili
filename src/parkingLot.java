public class parkingLot {
    private int currentCars;
    private int capacity;

    public parkingLot(int maxCapacity) {
        currentCars = 0; 
        capacity = maxCapacity;
    }

    public void parkCar() {
        if (currentCars < capacity) {
            currentCars = currentCars + 1;
            System.out.println("A car was parked. Cars : " + currentCars);
        } else {
            System.out.println("Parking lot is full");
        }
    }
public void removeCar() {
    if (currentCars > 0) {
        currentCars = currentCars - 1;
        System.out.println("A car left the parking lot. Cars : " + currentCars);
    } else {
        System.out.println("Parking lot is already empty");
    }
}
    public boolean openSpot() {
        if (currentCars < capacity) {
            return true;
        } else {
            return false;
        }
    }
}
