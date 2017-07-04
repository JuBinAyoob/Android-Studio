package jubin.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jubin on 3/7/17.
 */

public class Frag2 extends Fragment {


    TextView disp;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment2,container,false);

        disp=(TextView)v.findViewById(R.id.valdisp);

        return  v;
    }

    public  void updateInfo(String name)
    {
        disp.setText("Welcome " + name);

    }
}
