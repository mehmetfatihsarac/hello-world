import java.util.List;

public class Main {
    public static void main(String[] args) {
        RentalService rentalService = new RentalService();

        Vehicle sedan = new Sedan(
                "Toyota", "Camry", "Standard", "Automatic",
                500, "White", 2, "Gasoline", 800
        );
        Vehicle hatchback = new Hatchback(
                "Ford", "Focus", "A", "Manual",
                300, "Red", 3, "Diesel", 600
        );
        Vehicle suv = new SUV(
                "Jeep", "Cherokee", "SUV", "Automatic",
                700, "Black", 1, "Gasoline", 1000
        );

        rentalService.addVehicle(sedan);
        rentalService.addVehicle(hatchback);
        rentalService.addVehicle(suv);

        Customer individualCustomer = new IndividualCustomer("John Doe", "555-1234", "12345678901");
        Customer companyCustomer = new CorporateCustomer("TechCorp", "555-5678", "9876543210");

        List<Vehicle> individualVehicles = rentalService.getAvailableVehiclesForCustomer(individualCustomer);
        List<Vehicle> companyVehicles = rentalService.getAvailableVehiclesForCustomer(companyCustomer);

        System.out.println("Vehicles available for individual customers:");
        for (Vehicle vehicle : individualVehicles) {
            System.out.println(vehicle);
        }

        System.out.println("Vehicles available for company customers:");
        for (Vehicle vehicle : companyVehicles) {
            System.out.println(vehicle);
        }
    }
}
