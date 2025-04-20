package workerApp.Entities;

import jakarta.persistence.*;

@Entity
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phoneNumber;
    private String aadharNumber;
    private String skills;
    private String currentLocation;
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getAadharNumber() {
        return aadharNumber;
    }
    public String getSkills() {
        return skills;
    }
    public String getCurrentLocation() {
        return currentLocation;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }
    public void setSkills(String skills) {
        this.skills = skills;
    }
    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }
    @Override
    public String toString() {
        return "Worker [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", aadharNumber=" + aadharNumber
                + ", skills=" + skills + ", currentLocation=" + currentLocation + "]";
    }

    // Getters and setters
}
