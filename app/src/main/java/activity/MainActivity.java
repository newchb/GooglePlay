package activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.item.googleplay.R;

import org.itheima.tabindicator.library.TabIndicator;

import butterknife.Bind;
import butterknife.ButterKnife;
import fragment.APPFragment;
import fragment.HomeFragment;
import utils.UiUtils;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.main_drawer)
    DrawerLayout mMainDrawer;
    @Bind(R.id.mainact_vp)
    ViewPager mMainactVp;
    @Bind(R.id.indicator)
    TabIndicator mIndicator;
    private ActionBar mActionBar;
    private ActionBarDrawerToggle mToggle;
    private String[] mPagers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initdrawerlayout();
        initviewpager();
    }

    private void initviewpager() {
        mPagers = UiUtils.getarray(R.array.pagers);
        viewpagerAdapter adapter = new viewpagerAdapter(getSupportFragmentManager());
        mMainactVp.setAdapter(adapter);
        mIndicator.setViewPager(mMainactVp);
    }

    private class viewpagerAdapter extends FragmentPagerAdapter {

        public viewpagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment;
            switch (position){
                case 0:
                    fragment = new HomeFragment();
                    break;
                case 1:
                    fragment = new APPFragment();
                    break;
                default:
                    fragment = new HomeFragment();
                    break;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            if (mMainactVp != null) {
                return mPagers.length;
            }
            return 0;
        }




        @Override
        public CharSequence getPageTitle(int position) {
            return mPagers[position];
        }
    }

    private void initdrawerlayout() {
        mActionBar = getSupportActionBar();
        mActionBar.setDisplayHomeAsUpEnabled(true);
        mToggle = new ActionBarDrawerToggle(this, mMainDrawer, R.string.openDrawerContentDescRes, R.string.closeDrawerContentDescRes);
        mToggle.syncState();
        mMainDrawer.addDrawerListener(mToggle);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                mToggle.onOptionsItemSelected(item);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
