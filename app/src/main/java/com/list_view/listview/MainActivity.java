package com.list_view.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    protected ListView lv;
    protected ListAdapter adapter;
    SimpleAdapter Adapter;
    HashMap<String, String> map;
    ArrayList<HashMap<String, String>> myList;
    String[] Ing;
    String[] Gbr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Animal");
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);
        Ing = new String[]{"Bull","Chick","Fox","Hedgehog","Koala","Lemur","Pig","Tiger","Whale","Zebra"};
        Gbr = new String[] {Integer.toString(R.drawable.anbull),
                            Integer.toString(R.drawable.anchick),
                            Integer.toString(R.drawable.anfox),
                            Integer.toString(R.drawable.anhedgehog),
                            Integer.toString(R.drawable.ankoala),
                            Integer.toString(R.drawable.anlemur),
                            Integer.toString(R.drawable.anpig),
                            Integer.toString(R.drawable.antiger),
                            Integer.toString(R.drawable.anwhale),
                            Integer.toString(R.drawable.anzebra),
        };
        myList = new ArrayList<HashMap<String, String>>();
        for (int i = 0; i < Ing.length; i++){
            map = new HashMap<String, String>();
            map.put("list-ing", Ing[i]);
            map.put("gbr", Gbr[i]);
            myList.add(map);
        }
        Adapter = new SimpleAdapter(this, myList, R.layout.layout_isi_lv,
                new String[]{"list-ing","gbr"},
                new int[] {R.id.tv, R.id.imgv}
                );
        lv.setAdapter(Adapter);
    }
}
