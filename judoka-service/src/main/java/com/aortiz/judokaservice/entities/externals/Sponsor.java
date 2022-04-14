package com.aortiz.judokaservice.entities.externals;

public class Sponsor {

    private int id;
    private String name;
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
