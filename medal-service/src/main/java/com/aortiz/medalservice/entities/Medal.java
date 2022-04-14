package com.aortiz.medalservice.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "MEDALS")
public class Medal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "CHAMPIONSHIP")
    private String championship;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "JUDOKA_ID")
    private int judokaId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChampionship() {
        return championship;
    }

    public void setChampionship(String championship) {
        this.championship = championship;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getJudokaId() {
        return judokaId;
    }

    public void setJudokaId(int judokaId) {
        this.judokaId = judokaId;
    }
}
