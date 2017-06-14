package com.tunshu.tunshubook.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.tunshu.tunshubook.R;
import com.tunshu.tunshubook.fragment.FragmentFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final static int EXIT_DOUBLE_CLICK_INTERVAL_TIME = 2000;

    private ImageButton mTabHomeImg;
    private ImageButton mTabCommunityImg;
    private ImageButton mTabMessageImg;
    private ImageButton mTabMeImg;

    private Fragment mHomeFragment;
    private Fragment mCommunityFragment;
    private Fragment mMessageFragment;
    private Fragment mMeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mTabHomeImg = (ImageButton) findViewById(R.id.tab_home_img);
        mTabCommunityImg = (ImageButton) findViewById(R.id.tab_community_img);
        mTabMessageImg = (ImageButton) findViewById(R.id.tab_message_img);
        mTabMeImg = (ImageButton) findViewById(R.id.tab_me_img);

        setSelect(0);
        setOnClickListener();
    }

    private void setOnClickListener() {
        mTabHomeImg.setOnClickListener(this);
        mTabCommunityImg.setOnClickListener(this);
        mTabMessageImg.setOnClickListener(this);
        mTabMeImg.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        resetTabImg();

        switch (v.getId()) {
            case R.id.tab_home_img:
                setSelect(0);
                break;
            case R.id.tab_community_img:
                setSelect(1);
                break;
            case R.id.tab_message_img:
                setSelect(2);
                break;
            case R.id.tab_me_img:
                setSelect(3);
                break;
            default:
                break;
        }
    }

    private void resetTabImg() {
        mTabHomeImg.setImageResource(R.drawable.tab_home_img_normal);
        mTabCommunityImg.setImageResource(R.drawable.tab_community_img_normal);
        mTabMessageImg.setImageResource(R.drawable.tab_message_img_normal);
        mTabMeImg.setImageResource(R.drawable.tab_me_img_normal);
    }

    private void setSelect(int i) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        switch (i) {
            case 0:
                transaction.replace(R.id.id_container,FragmentFactory.createFragment(0));
                mTabHomeImg.setImageResource(R.drawable.tab_home_img_pressed);
                break;
            case 1:
                transaction.replace(R.id.id_container,FragmentFactory.createFragment(1));
                mTabCommunityImg.setImageResource(R.drawable.tab_community_img_pressed);
                break;
            case 2:
                transaction.replace(R.id.id_container,FragmentFactory.createFragment(2));
                mTabMessageImg.setImageResource(R.drawable.tab_message_img_pressed);
                break;
            case 3:
                transaction.replace(R.id.id_container,FragmentFactory.createFragment(3));
                mTabMeImg.setImageResource(R.drawable.tab_me_img_pressed);
                break;
            default:
                break;
        }
        transaction.commit();
    }

    private long mPressedTime = 0;

    @Override
    public void onBackPressed() {
        long mNowTime = System.currentTimeMillis();
        if (mNowTime - mPressedTime > EXIT_DOUBLE_CLICK_INTERVAL_TIME) {
            Toast.makeText(this, R.string.press_again, Toast.LENGTH_SHORT).show();
            mPressedTime = mNowTime;
        } else {
            this.finish();
        }
    }
}
