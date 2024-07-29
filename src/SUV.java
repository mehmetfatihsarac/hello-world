public class SUV extends Vehicle {
    public SUV(String brand, String model, String segment, String transmissionType, int luggageCapacity, String color,
               int age, String fuelType, double dailyRentalPrice) {
        super(brand, model, segment, transmissionType, luggageCapacity, color, age, fuelType, dailyRentalPrice);
    }

    public double calculateRentalPrice(int numberOfDays) {
        return getDailyRentalPrice() * numberOfDays;
    }
}
