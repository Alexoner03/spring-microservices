package com.aortiz.judokaservice.entities.externals;

public class Medal {

    private int id;

    private String championship;

    private String type;

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
