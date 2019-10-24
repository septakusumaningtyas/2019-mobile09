package com.example.recyclerviewtugas1.models;

import android.graphics.drawable.Drawable;

public class Buah {
    public String judul;
    public Drawable image;

    public Buah(Drawable image, String judul)
    {
        this.judul = judul;
        this.image = image;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}
