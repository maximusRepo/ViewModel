package com.example.veiwmodel;

import java.util.ArrayList;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RetrofitService {

    @GET("marvel")
    Observable<ArrayList<Responsemodel>> getResponse();

    @POST("pushes")
    Observable<PostResponseModel> getData(@Body RequestModel requestModel);




}
