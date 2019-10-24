package com.example.recyclerviewtugas1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.recyclerviewtugas1.adapters.BuahAdapter;
import com.example.recyclerviewtugas1.models.Buah;

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
        BuahAdapter buahAdapter = new BuahAdapter(listBuah);
        rvBuah.setAdapter(buahAdapter);
        rvBuah.setLayoutManager(new LinearLayoutManager(this));
    }
}
