package jubin.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Frag1.OnNameSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setName(String name) {
        Frag2 f2=(Frag2) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        f2.updateInfo(name );
    }
}
