import java.util.ArrayList;
import java.util.List;

public class RentalService {
    private List<Vehicle> availableVehicles;

    public RentalService() {
        availableVehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        availableVehicles.add(vehicle);
    }

    public List<Vehicle> getAvailableVehiclesForCustomer(Customer customer) {
        List<Vehicle> customerVehicles = new ArrayList<>();
        for (Vehicle vehicle : availableVehicles) {
            if (customer instanceof IndividualCustomer && (vehicle instanceof Sedan || vehicle instanceof Hatchback)) {
                customerVehicles.add(vehicle);
            } else if (customer instanceof CorporateCustomer) {
                customerVehicles.add(vehicle);
            }
        }
        return customerVehicles;
    }
}
