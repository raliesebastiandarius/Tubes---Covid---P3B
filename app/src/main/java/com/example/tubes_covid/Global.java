package com.example.tubes_covid;

import com.google.gson.annotations.SerializedName;

public class Global {
    @SerializedName("globalId")
    private Integer globalId;
    @SerializedName("newConfirmed")
    private Integer newConfirmed;
    @SerializedName("totalConfirmed")
    private Integer totalConfirmed;
    @SerializedName("newDeaths")
    private Integer newDeaths;
    @SerializedName("totalDeaths")
    private Integer totalDeaths;
    @SerializedName("newRecovered")
    private Integer newRecovered;
    @SerializedName("totalRecovered")
    private Integer totalRecovered;

    public Global(Integer globalId, Integer newConfirmed, Integer totalConfirmed, Integer newDeaths, Integer totalDeaths, Integer newRecovered, Integer totalRecovered) {
        this.globalId = globalId;
        this.newConfirmed = newConfirmed;
        this.totalConfirmed = totalConfirmed;
        this.newDeaths = newDeaths;
        this.totalDeaths = totalDeaths;
        this.newRecovered = newRecovered;
        this.totalRecovered = totalRecovered;
    }

    public Integer getGlobalId() {
        return globalId;
    }

    public void setGlobalId(Integer globalId) {
        this.globalId = globalId;
    }

    public Integer getNewConfirmed() {
        return newConfirmed;
    }

    public void setNewConfirmed(Integer newConfirmed) {
        this.newConfirmed = newConfirmed;
    }

    public Integer getTotalConfirmed() {
        return totalConfirmed;
    }

    public void setTotalConfirmed(Integer totalConfirmed) {
        this.totalConfirmed = totalConfirmed;
    }

    public Integer getNewDeaths() {
        return newDeaths;
    }

    public void setNewDeaths(Integer newDeaths) {
        this.newDeaths = newDeaths;
    }

    public Integer getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(Integer totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public Integer getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(Integer newRecovered) {
        this.newRecovered = newRecovered;
    }

    public Integer getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(Integer totalRecovered) {
        this.totalRecovered = totalRecovered;
    }
}
