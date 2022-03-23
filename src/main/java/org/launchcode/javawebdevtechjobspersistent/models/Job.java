package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

    //private Skill skills;

    @ManyToMany//(mappedBy = "jobs")
    private List<Skill> skills;

    public Job() {}

    public Job(Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

//    public Skill getSkills() {
//        return skills;
//    }
//
//    public void setSkills(Skill skills) {
//        this.skills = skills;
//    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> someSkills) {
        this.skills = someSkills;
    }

//    public void addSkills(Skill someSkills) {
//        skills.add(someSkills);
//    }
}
