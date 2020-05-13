/*
 * Controller Class for patients related activity.
 * @author com.euphoria
 */
package com.euphoria.orchestration.patient.model;

/*
 * Model Class for patients.
 * @author com.euphoria
 */
import java.io.Serializable;

/**
 * Model patient class.
 */
public class Patient implements Serializable {

    private String id;
    private String name;
    private String address;
    private String phoneNumber;
    private String emailId;
    private String district;
    private String state;
    private boolean active = true;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
