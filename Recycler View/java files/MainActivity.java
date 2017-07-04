package jubin.recyclerbin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        List<ItemDetails> itemDetailses=new ArrayList<>();

        ItemDetails obj1=new ItemDetails();
        obj1.setTitle("one");
        obj1.setDetail("first_details");
        obj1.setImage(R.drawable.one);
        itemDetailses.add(obj1);

        ItemDetails obj2=new ItemDetails();
        obj2.setTitle("two");
        obj2.setDetail("Second_details");
        obj2.setImage(R.drawable.two);
        itemDetailses.add(obj2);

        ItemDetails obj3=new ItemDetails();
        obj3.setTitle("three");
        obj3.setDetail("Third_details");
        obj3.setImage(R.drawable.three);
        itemDetailses.add(obj3);

       // LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,3);
        Adapter adapter=new Adapter(itemDetailses);

        //recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);

    }
}
