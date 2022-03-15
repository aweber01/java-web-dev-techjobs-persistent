package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.*;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(max = 100, message = "Exceeds maximum of 100 characters.")
    private String location;

    public Employer(String location) {
        super();
        this.location = location;
    }

    public Employer(){}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
