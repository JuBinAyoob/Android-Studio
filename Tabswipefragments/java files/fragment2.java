package jubin.tabfragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment2 extends Fragment {

    TextView tv;

    public fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v=inflater.inflate(R.layout.frag_two, container, false);
        tv=(TextView)v.findViewById(R.id.textSecond);


        Bundle args =getArguments();
        if(args!=null) {
            String received = args.getString("name1","default");
            tv.setText(received);
            Log.e("receivedname", received);
        }else
        {
            Log.e("receivedname", "null value");
        }
        return v;


    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        // Inflate the layout for this fragment
        Bundle args =getArguments();
        if(args!=null) {
            String received = args.getString("name1","default");


            Log.e("receivedname", received);
        }else
        {
            Log.e("receivedname", "null value");
        }
    }
}