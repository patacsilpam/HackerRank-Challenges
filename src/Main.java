abstract class Vehicle{
    String make;
    String model;
    int year;
    String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    void fuelEfficiency(){

    }

    void distanceTravel(){

    }

    void maxSpeed(){

    }
}
class Truck extends Vehicle{

    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
}
public class Main {
    public static void main(String[] args) {

    }
}
