package example.com.finalproject;

import java.time.LocalDate;
import java.util.List;

public class CarShow {
    private List<Car> carsDisplayed;
    private LocalDate date;
    private String location;
    private String photo;
    private String recapVideoUrl;

    public CarShow(List<Car> carsDisplayed, LocalDate date, String location, String photo, String recapVideoUrl) {
        this.carsDisplayed = carsDisplayed;
        this.date = date;
        this.location = location;
        this.photo = photo;
        this.recapVideoUrl = recapVideoUrl;
    }

    // Getters and Setters
    public List<Car> getCarsDisplayed() {
        return carsDisplayed;
    }

    public void setCarsDisplayed(List<Car> carsDisplayed) {
        this.carsDisplayed = carsDisplayed;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getRecapVideoUrl() {
        return recapVideoUrl;
    }

    public void setRecapVideoUrl(String recapVideoUrl) {
        this.recapVideoUrl = recapVideoUrl;
    }
}
