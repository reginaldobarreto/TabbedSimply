package br.com.barrsoft.tabbedsimply.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import br.com.barrsoft.tabbedsimply.fragments.AFragment;
import br.com.barrsoft.tabbedsimply.fragments.BFragment;
import br.com.barrsoft.tabbedsimply.fragments.CFragment;

public class TabAdapter extends FragmentStatePagerAdapter {


    private String [] tabTitle ;

    public TabAdapter(@NonNull FragmentManager fm, int behavior, String[] tabTitle) {
        super(fm, behavior);
        this.tabTitle = tabTitle;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position){
            case 0:fragment = new AFragment();
            break;
            case 1:fragment = new BFragment();
            break;
            case 2: fragment = new CFragment();
            break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return tabTitle.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle[position];
    }
}
