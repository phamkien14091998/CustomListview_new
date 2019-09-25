package com.example.customcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<tp> tps;
    tpAdapter tpAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhXa();

        tpAdapter = new tpAdapter(this,R.layout.thanhpho_main,tps);
        lv.setAdapter(tpAdapter);


    }

    public void anhXa(){
        lv = findViewById(R.id.lv);
        tps = new ArrayList<>();

        tps.add(new tp("qq","1",R.drawable.a));
        tps.add(new tp("qqw","2",R.drawable.a));
        tps.add(new tp("đ","3",R.drawable.a));
        tps.add(new tp("ggf","4",R.drawable.a));
        tps.add(new tp("Ok","5",R.drawable.a));


    }
}
