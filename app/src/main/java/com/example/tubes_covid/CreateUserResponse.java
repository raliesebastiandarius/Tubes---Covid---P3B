package com.example.tubes_covid;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreateUserResponse {
    @SerializedName("ID")
    @Expose
    public String iD;
    @SerializedName("Country")
    @Expose
    public String country;
    @SerializedName("CountryCode")
    @Expose
    public String countryCode;
    @SerializedName("Slug")
    @Expose
    public String slug;
    @SerializedName("NewConfirmed")
    @Expose
    public Integer newConfirmed;
    @SerializedName("TotalConfirmed")
    @Expose
    public Integer totalConfirmed;
    @SerializedName("NewDeaths")
    @Expose
    public Integer newDeaths;
    @SerializedName("TotalDeaths")
    @Expose
    public Integer totalDeaths;
    @SerializedName("NewRecovered")
    @Expose
    public Integer newRecovered;
    @SerializedName("TotalRecovered")
    @Expose
    public Integer totalRecovered;
    @SerializedName("Date")
    @Expose
    public String date;
}
