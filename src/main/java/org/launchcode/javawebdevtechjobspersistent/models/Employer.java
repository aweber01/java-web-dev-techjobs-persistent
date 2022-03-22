package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(max = 100, message = "Exceeds maximum of 100 characters.")
    private String location;

    @OneToMany(mappedBy = "employer")
    //@JoinColumn(name = "id")
    private final List<Job> jobs = new ArrayList<>();

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

    public List<Job> getJobs() {
        return jobs;
    }
}
