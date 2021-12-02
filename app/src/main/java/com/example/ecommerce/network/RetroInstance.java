package com.example.ecommerce.network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroInstance {

//    private static Retrofit retrofit = null;
//
//    public static Retrofit getClient() {
//
//        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
//        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
//
//
//        retrofit = new Retrofit.Builder()
//                .baseUrl("http://mobicraftsv2.com/bloc49/api/v3/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .client(client)
//                .build();
//
//
//        return retrofit;
//    }

    public static String BASE_URL = "http://mobicraftsv2.com/bloc49/api/v3/";

    private static Retrofit retrofit;

    public static Retrofit getRetroClient() {

        if(retrofit == null ) {

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
