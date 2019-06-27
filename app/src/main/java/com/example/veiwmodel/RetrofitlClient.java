package com.example.veiwmodel;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitlClient {

    private final static String base_url = "https://api.pushbullet.com/v2/";

    private static Retrofit retrofit = null;


    public static Retrofit getClient(){

        OkHttpClient defaultHttpClient = new OkHttpClient.Builder()
                .addInterceptor(
                        new Interceptor() {
                            @Override
                            public Response intercept(Interceptor.Chain chain) throws IOException {
                                Request request = chain.request().newBuilder()
                                        .addHeader("Access-Token", "o.1uV712xKbBqUOZw7SmDfScxz6fgADrym").build();
                                return chain.proceed(request);
                            }
                        }).build();

        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(base_url)
                    .client(defaultHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build();
        }
        return retrofit;
    }

}
