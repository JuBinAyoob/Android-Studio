package jubin.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.name;


/**
 * Created by jubin on 3/7/17.
 */

public class Frag1 extends Fragment {

    EditText value;
    Button sub;
    OnNameSetListener onNameSetListener;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragement1,container,false);

        value=(EditText)v.findViewById(R.id.enterval);
        sub=(Button)v.findViewById(R.id.submit);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1=value.getText().toString();
                onNameSetListener.setName(name1);
            }



         });
        return v;

    }
    public interface OnNameSetListener{
        public void setName(String name);

    }

        @Override
        public void onAttach(Context context) {
            super.onAttach(context);
            try {
                onNameSetListener=(OnNameSetListener)context;
            }
            catch (Exception e)
            {

            }
        }
}
