package com.aortiz.sponsorservice.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SPONSORS")
public class Sponsor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "JUDOKA_ID")
    private int judokaId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJudokaId() {
        return judokaId;
    }

    public void setJudokaId(int judokaId) {
        this.judokaId = judokaId;
    }
}
