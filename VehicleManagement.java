
import java.time.Year;


class Vehicle {
    String brand;
    String model;
    int year;
    double basePrice;

    Vehicle(String brand, String model, int year, double basePrice) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.basePrice = basePrice;
    }

    int getAge() {
        int currentYear = Year.now().getValue();
        return currentYear - year;
    }

    double ResaleValue() {
        int age = getAge();
        return basePrice * Math.pow(0.85, age); // 15% depreciation per year
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Base Price: Rs" + basePrice);
    }
}


class Car extends Vehicle {
    int numberOfDoors;

    Car(String brand, String model, int year, double basePrice, int numberOfDoors) {
        super(brand, model, year, basePrice);
        this.numberOfDoors = numberOfDoors;
    }

    int Insurance() {
        return 5000 + (1000 * numberOfDoors);
    }

    int MaintenanceCost() {
        return 3000 + (500 * numberOfDoors);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Insurance Cost: Rs" + Insurance());
        System.out.println("Maintenance Cost: Rs" + MaintenanceCost());
        System.out.println("Resale Value: Rs" + ResaleValue());
        
    }
}


class Motorcycle extends Vehicle {
    boolean hasSidecar;

    Motorcycle(String brand, String model, int year, double basePrice, boolean hasSidecar) {
        super(brand, model, year, basePrice);
        this.hasSidecar = hasSidecar;
    }

    int Insurance() {
        return 2500 + (hasSidecar ? 1500 : 0);
    }

    int MaintenanceCost() {
        return 2000 + (hasSidecar ? 1000 : 0);
    }

  
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
        System.out.println("Insurance Cost: Rs" + Insurance());
        System.out.println("Maintenance Cost: Rs" + MaintenanceCost());
        System.out.println("Resale Value: Rs" + ResaleValue());
        
    }
}


public class VehicleManagement {
    public static void main(String[] args) {
        Car car = new Car("Maruthi", "Swift", 2020, 700000, 4);
        Motorcycle bike = new Motorcycle("Royal Enfield", "Classic 350", 2017, 200000, true);

        System.out.println("CAR DETAILS:");
        car.displayInfo();

        System.out.println("MOTORCYCLE DETAILS:");
        bike.displayInfo();
    }
}
