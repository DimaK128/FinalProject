package example.com.finalproject;

import java.util.List;

public class CarModel {
    private String modelName;
    private Car make;
    private String dimensions;
    private double weight;
    private String type;
    private int horsepower;
    private int torque;
    private String mainPhoto;
    private List<String> additionalPhotos;
    private String description;
    private String features;

    public CarModel(String modelName, Car make, String dimensions, double weight, String type, int horsepower, int torque, String mainPhoto, List<String> additionalPhotos, String description, String features) {
        this.modelName = modelName;
        this.make = make;
        this.dimensions = dimensions;
        this.weight = weight;
        this.type = type;
        this.horsepower = horsepower;
        this.torque = torque;
        this.mainPhoto = mainPhoto;
        this.additionalPhotos = additionalPhotos;
        this.description = description;
        this.features = features;
    }

    // Getters and Setters
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Car getMake() {
        return make;
    }

    public void setMake(Car make) {
        this.make = make;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public String getMainPhoto() {
        return mainPhoto;
    }

    public void setMainPhoto(String mainPhoto) {
        this.mainPhoto = mainPhoto;
    }

    public List<String> getAdditionalPhotos() {
        return additionalPhotos;
    }

    public void setAdditionalPhotos(List<String> additionalPhotos) {
        this.additionalPhotos = additionalPhotos;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }
}
