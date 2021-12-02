package com.example.ecommerce.network;


import com.example.ecommerce.model.MasterResponceModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("product-details?")
    Call<MasterResponceModel> getproductlist(@Query("product_id")int product_id, @Query("lang") String lang, @Query("store") String store);
}
