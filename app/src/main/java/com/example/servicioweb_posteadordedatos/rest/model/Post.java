package com.example.servicioweb_posteadordedatos.rest.model;

import android.icu.text.CaseMap;

import com.google.gson.annotations.SerializedName;

public class Post {
    @SerializedName("title")
    private  String Tittle;
    @SerializedName("descripcion")
    private  String Descripcion;
    @SerializedName("url_image")
    private  String UrlImage;


    public Post(String tittle, String descripcion, String urlImage) {
        Tittle = tittle;
        Descripcion = descripcion;
        UrlImage = urlImage;
    }

    public String getTittle() {
        return Tittle;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getUrlImage() {
        return UrlImage;
    }
}
