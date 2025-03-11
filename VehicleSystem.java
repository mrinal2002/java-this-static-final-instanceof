class Vehicle {
    private static double registrationFee = 500; // Static variable shared by all vehicles
    private final String registrationNumber; // Final variable (unique for each vehicle)
    private String ownerName;
    private String vehicleType;

    // Constructor using 'this' to initialize instance variables
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) { // Using instanceof
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: Rs." + registrationFee);
            System.out.println("-------------------------");
        }
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: Rs." + registrationFee);
    }
}

// Main class
public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("XYZ123", "Aman", "Car");
        Vehicle vehicle2 = new Vehicle("ABC789", "Raj", "Motorcycle");

        // Display vehicle details
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        // Updating registration fee
        Vehicle.updateRegistrationFee(600);

        // Display vehicle details after updating fee
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
