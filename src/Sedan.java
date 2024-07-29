public class Sedan extends Vehicle {
    private final double DISCOUNT_RATE = 0.07;

    public Sedan(String brand, String model, String segment, String transmissionType, int luggageCapacity, String color,
                 int age, String fuelType, double dailyRentalPrice) {
        super(brand, model, segment, transmissionType, luggageCapacity, color, age, fuelType, dailyRentalPrice);
    }

    @Override
    public double calculateRentalPrice() {
        double monthlyPrice = getDailyRentalPrice() * 30;
        return monthlyPrice * (1 - DISCOUNT_RATE);
    }
}
