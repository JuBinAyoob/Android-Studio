package jubin.tabfragments;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;

/**
 * Created by jubin on 5/7/17.
  */


public class ViewPagerAdapter extends FragmentStatePagerAdapter {


    ArrayList<Fragment>fragments=new ArrayList<>();
    ArrayList<String>tabtitiles=new ArrayList<>();



    public void addfragments(Fragment fragments,String titiles)
    {
        this.fragments.add(fragments);
        this.tabtitiles.add(titiles);
    }


    public ViewPagerAdapter(FragmentManager fragmentManager)
    {
        super(fragmentManager);

    }
    @Override
    public Fragment getItem(int position) {

        return fragments.get(position);
    }

    @Override
    public int getCount() {

        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return tabtitiles.get(position);
    }

}