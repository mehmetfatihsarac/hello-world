public class Vehicle {
    private String brand;
    private String model;
    private String segment;
    private String gearType;
    private int luggageCapacity;
    private String color;
    private int age;
    private String fuelType;
    private double dailyRentalPrice;

    public Vehicle(String brand, String model, String segment, String transmissionType, int luggageCapacity,
                   String color, int age, String fuelType, double dailyRentalPrice) {
        this.brand = brand;
        this.model = model;
        this.segment = segment;
        this.gearType = transmissionType;
        this.luggageCapacity = luggageCapacity;
        this.color = color;
        this.age = age;
        this.fuelType = fuelType;
        this.dailyRentalPrice = dailyRentalPrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public int getLuggageCapacity() {
        return luggageCapacity;
    }

    public void setLuggageCapacity(int luggageCapacity) {
        this.luggageCapacity = luggageCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getDailyRentalPrice() {
        return dailyRentalPrice;
    }

    public void setDailyRentalPrice(double dailyRentalPrice) {
        this.dailyRentalPrice = dailyRentalPrice;
    }

    @Override
    public String toString() {
        return brand + " " + model + " -> $" + dailyRentalPrice;
    }

    public double calculateRentalPrice() {
        return dailyRentalPrice * 30;
    }
}
