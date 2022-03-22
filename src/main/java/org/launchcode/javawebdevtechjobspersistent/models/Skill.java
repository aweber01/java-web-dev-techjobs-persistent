package org.launchcode.javawebdevtechjobspersistent.models;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank
    @Size(max = 255, message = "Exceeds maximum of 255 characters.")
    private String description;

    @ManyToMany(mappedBy = "skill")
    //@JoinColumn(name = "id")
    private final List<Job> jobs = new ArrayList<>();

    public Skill(){}

    public Skill(String description) {
        super();
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}