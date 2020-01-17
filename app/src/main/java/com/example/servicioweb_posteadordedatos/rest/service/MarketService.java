package com.example.servicioweb_posteadordedatos.rest.service;

import com.example.servicioweb_posteadordedatos.rest.model.Post;

import java.util.List;

import com.example.servicioweb_posteadordedatos.rest.contants.ApiConstants;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Body;

public interface MarketService {

    @POST(ApiConstants.MARKET_POST_ENDPOINT)
    Call<Post> InsertPost(@Body Post post);

    @GET(ApiConstants.MARKET_POST_ENDPOINT)
    Call<List< Post>> getPosts();
}
