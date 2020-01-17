package com.example.servicioweb_posteadordedatos.rest.adapter;

import com.example.servicioweb_posteadordedatos.rest.model.Post;


import com.example.servicioweb_posteadordedatos.rest.contants.ApiConstants;
import com.example.servicioweb_posteadordedatos.rest.service.MarketService;

import java.util.List;

import retrofit2.Call;

public class MarketAdapter
        extends BaseAdapter
        implements MarketService {

    private MarketService marketService;

    public MarketAdapter() {
        super(ApiConstants.BASE_POST_URL);
        marketService = createService(MarketService.class);
    }

    @Override
    public Call<Post> InsertPost(Post post) {
        return marketService.InsertPost(post);
    }

    @Override
    public Call<List<Post>> getPosts() {
        return marketService.getPosts();
    }
}
