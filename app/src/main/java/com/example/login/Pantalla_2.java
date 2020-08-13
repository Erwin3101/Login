package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;


public class Pantalla_2 extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_2);

        ListView listView = (ListView) findViewById(R.id.listview);

        final ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Nombre: Manuel");
        arrayList.add("Apellido: Martinez Polanco");
        arrayList.add("Sexo: M");
        arrayList.add("Nombre de padre: Raul Martinez");
        arrayList.add("Nombre de madre: Maria Polanco");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               Toast.makeText(Pantalla_2.this, "Informacion"+i+" "+arrayList.get(i).toString(), Toast.LENGTH_SHORT).show();
           }
       });
    }
}