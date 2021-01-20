package com.example.tubes_covid;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface APIInterface {

    @GET("/api/unknown")
    Call<MultipleResource> doGetListResources();

    @POST("/api/country")
    Call<Country> createCountry(@Body Country country);

    @GET("/api/country?")
    Call<CountryList> doGetCountryList(@Query("Id") String id);

    @FormUrlEncoded
    @POST("/api/users?")
    Call<CountryList> doCreateUserWithField(@Field("Country") String name, @Field("CountryCode") String job);
}
