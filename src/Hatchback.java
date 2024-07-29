public class Hatchback extends Vehicle {
    public Hatchback(String brand, String model, String segment, String transmissionType, int luggageCapacity, String color,
                     int age, String fuelType, double dailyRentalPrice) {
        super(brand, model, segment, transmissionType, luggageCapacity, color, age, fuelType, dailyRentalPrice);
    }

    @Override
    public double calculateRentalPrice() {
        double monthlyPrice = getDailyRentalPrice() * 30;

        double coefficient = 0;
        if (getSegment().equals("A")) {
            coefficient = 0.02;
        } else if (getSegment().equals("B")) {
            coefficient = 0.06;
        }

        return monthlyPrice * (1 - coefficient);
    }
}
