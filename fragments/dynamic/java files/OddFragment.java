package jubin.fragments2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by androidCodeFinder on 4/18/2017.
 */

public class OddFragment extends Fragment{

    public static OddFragment getInstance(){
        OddFragment sf = new OddFragment();
        return sf;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_one,null);

        return v;
    }
}
