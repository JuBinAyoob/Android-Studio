package jubin.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView showitems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showitems= (ListView)findViewById(R.id.listshow);

        List listitems = new ArrayList();

        listitems.add("Android");
        listitems.add("Ios");
        listitems.add("Java");
        listitems.add("Nodejs");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,R.layout.list_item,R.id.textView1,listitems);
        showitems.setAdapter(adapter);

        showitems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String name=parent.getItemAtPosition(position).toString();

                Toast.makeText(MainActivity.this, name+" is selected", Toast.LENGTH_SHORT).show();


            }
        });
    }
}
