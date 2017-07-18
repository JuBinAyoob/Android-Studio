package com.example.www.search4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView showitems;
    EditText searchitem;
    Button Search;
    String str;
    List<String> listitems;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showitems= (ListView)findViewById(R.id.listshow);

        listitems = new ArrayList();

        listitems.add("Android");
        listitems.add("Ios");
        listitems.add("Java");
        listitems.add("Nodejs");

        adapter=new ArrayAdapter<String>(MainActivity.this,R.layout.list_item,R.id.textView1,listitems);
        showitems.setAdapter(adapter);

        Search=(Button)findViewById(R.id.search);
        searchitem=(EditText) findViewById(R.id.element);



        showitems.setTextFilterEnabled(true);


        searchitem.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                str=searchitem.getText().toString().toLowerCase();
                filters(str);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });}

    public void filters(String fil)
    {
        List<String> singlelist = new ArrayList<>();
        fil = fil.toLowerCase();
        // adapter.clear();
        if (fil.length() == 0) {
            showitems.setAdapter(adapter);
        }
        else
        {
           for(String value: listitems)
           {
               if(value.contains(fil))
               {
                   singlelist.add(value);
               }
           }
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,R.layout.list_item,R.id.textView1,singlelist);
            showitems.setAdapter(adapter);


        }
    }
}
