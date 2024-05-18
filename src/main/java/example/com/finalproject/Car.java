package example.com.finalproject;

public class Car {
    private String make;
    private String model;
    private String logo;
    private String manufacturingCountry;
    private int manufacturingYear;

    public Car(String make, String model, String logo, String manufacturingCountry, int manufacturingYear) {
        this.make = make;
        this.model = model;
        this.logo = logo;
        this.manufacturingCountry = manufacturingCountry;
        this.manufacturingYear = manufacturingYear;
    }

    // Getters and Setters
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getManufacturingCountry() {
        return manufacturingCountry;
    }

    public void setManufacturingCountry(String manufacturingCountry) {
        this.manufacturingCountry = manufacturingCountry;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }
}
