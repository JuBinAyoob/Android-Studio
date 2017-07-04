package jubin.fragments2;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by androidCodeFinder on 4/18/2017.
 */

public class MainActivity extends AppCompatActivity {

    static int count=0;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        OddFragment sf = OddFragment.getInstance();
        ft.add(R.id.frag_container,sf);
        ft.commit();

        button=(Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                count++;

                Log.d("clicked ",count+"times");

                int temp=count%2;
                if(temp==0)
                {
                    Log.d("clicked and inside one ",count+"times");
                    FragmentManager fm=getSupportFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    EvenFragment sf = EvenFragment.getInstance();
                    ft.replace(R.id.frag_container,sf);
                    ft.commit();
                    ft.addToBackStack("added");

                }else
                {
                    Log.d("clicked and inside two ",count+"times");
                    FragmentManager fm=getSupportFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    OddFragment sf = OddFragment.getInstance();
                    ft.replace(R.id.frag_container,sf);
                    ft.commit();
                    ft.addToBackStack("added");


                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       // return super.onCreateOptionsMenu(menu);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // action with ID action_refresh was selected
            case R.id.action_refresh:
                 Toast.makeText(this, "Refresh selected", Toast.LENGTH_SHORT)
                    .show();
                FragmentManager fm=getSupportFragmentManager();
                fm.popBackStack("added",FragmentManager.POP_BACK_STACK_INCLUSIVE);
            break;


            // action with ID action_settings was selected
            case R.id.action_settings:
                Toast.makeText(this, "Settings selected", Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.action_login:
                Toast.makeText(this, "Login Page Selected", Toast.LENGTH_SHORT)
                        .show();
                break;
            default:
                break;
        }

        return true;
    }
}
