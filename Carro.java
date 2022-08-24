//This class describes a few of the possible attributes every car has

public class Carro {
    
    public String brand; //Car brand: i.e. Renault, Chevrolet, Mazda
    public String model; //Car model: i.e. Duster, Spark GT, CX-5
    public double displacement; //Engine displacement (in liters): i.e. 1.2, 2.0, 3.0
    public int year; //Manufacturing year: i.e. 2009, 2020, 2023

    //Method to define all attributes of the car at once
    public void setAttributes(String brand, String model, double displacement, int year) {
        this.brand = brand;
        this.model = model;
        this.displacement = displacement;
        this.year = year;
    }

    //Returns only the car's brand
    public String getBrand() {
        return this.brand;
    }

}
