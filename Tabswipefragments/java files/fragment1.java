package jubin.tabfragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment1 extends Fragment {

    EditText name;
    Button sub;
    public fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v= inflater.inflate(R.layout.frag_one, container, false);
        name=(EditText) v.findViewById(R.id.edittextfrag1);
        sub=(Button)v.findViewById(R.id.buttonfrag1) ;

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragment2 secondFragment=new fragment2();
                String name1=name.getText().toString();
                Bundle args = new Bundle();
                args.putString("name1", name1);
                Log.e("name1",name1);
                secondFragment.setArguments(args);

                getFragmentManager().beginTransaction().replace(R.id.frag2,secondFragment).commit();






            }
        });
        return v;

    }

}
