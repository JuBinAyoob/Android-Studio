package jubin.fragments2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by androidCodeFinder on 4/18/2017.
 */

public class EvenFragment extends Fragment {

    public static EvenFragment getInstance(){
        EvenFragment sf = new EvenFragment();
        return sf;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_layout,null);

        return v;
    }
}
