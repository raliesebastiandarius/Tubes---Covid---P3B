package com.example.tubes_covid;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("/confirmed")
    Call<List<Global>> getTotalConfirmed();
}