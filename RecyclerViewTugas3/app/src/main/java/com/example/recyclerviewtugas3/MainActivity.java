package com.example.recyclerviewtugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewtugas3.adapters.BuahAdapter;
import com.example.recyclerviewtugas3.models.Buah;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //instansiasi Recyclerview
    RecyclerView rvBuah;
    //instansiasi list superhero
    List<Buah> listBuah = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBuah = findViewById(R.id.rvBuah);
        Buah buah = new Buah(this.getResources().getDrawable(R.drawable.alpukat),"Alpukat");
        listBuah.add(buah);
        buah = new Buah(this.getResources().getDrawable(R.drawable.anggur),"Anggur");
        listBuah.add(buah);
        buah = new Buah(this.getResources().getDrawable(R.drawable.apel),"Apel");
        listBuah.add(buah);
        buah = new Buah(this.getResources().getDrawable(R.drawable.belimbing),"Belimbing");
        listBuah.add(buah);
        buah = new Buah(this.getResources().getDrawable(R.drawable.buahnaga),"Buah Naga");
        listBuah.add(buah);
        buah = new Buah(this.getResources().getDrawable(R.drawable.jeruk),"Jeruk");
        listBuah.add(buah);
        buah = new Buah(this.getResources().getDrawable(R.drawable.mangga),"Mangga");
        listBuah.add(buah);
        buah = new Buah(this.getResources().getDrawable(R.drawable.melon),"Melon");
        listBuah.add(buah);
        buah = new Buah(this.getResources().getDrawable(R.drawable.pisang),"Pisan");
        listBuah.add(buah);
        buah = new Buah(this.getResources().getDrawable(R.drawable.stroberi),"Stroberi");
        listBuah.add(buah);
        BuahAdapter buahAdapter = new BuahAdapter(listBuah);
        rvBuah.setAdapter(buahAdapter);
        rvBuah.setLayoutManager(new GridLayoutManager(this, 2));
    }
}
