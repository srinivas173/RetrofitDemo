package com.example.retrofitdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface GetDataService {

    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhoto();

    @POST


}
