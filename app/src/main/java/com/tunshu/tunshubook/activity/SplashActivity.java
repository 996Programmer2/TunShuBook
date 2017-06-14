package com.tunshu.tunshubook.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.tunshu.tunshubook.R;
import com.tunshu.tunshubook.utils.RxCountDown;

import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;

/**
 * Created by Whipan on 2017/5/22.
 */

public class SplashActivity extends AppCompatActivity {

    private final static int COUNT_DOWN_TIME = 5;

    private TextView     mTxtSkipAd;
    private Subscription mSubscription;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        hideStatusBar();
        initView();
        clickSkipAd();
    }

    private void clickSkipAd() {
        mSubscription = RxCountDown.countDown(COUNT_DOWN_TIME)
                .doOnSubscribe(new Action0() {
                    @Override
                    public void call() {

                    }
                })
                .subscribe(new Subscriber<Integer>() {
                    @Override
                    public void onCompleted() {
                        goMainActivity();
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Integer integer) {
                        mTxtSkipAd.setText(TextUtils.concat(integer + "s", getResources().getString(R.string.skip_ad)));
                    }
                });
    }

    private void goMainActivity() {
        if (mSubscription != null && !mSubscription.isUnsubscribed()) {
            mSubscription.unsubscribe();
        }
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    private void initView() {
        FrameLayout flSkipAd = (FrameLayout) findViewById(R.id.fl_skip_add);
        mTxtSkipAd = (TextView) findViewById(R.id.txt_skip_ad);

        flSkipAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goMainActivity();
            }
        });
    }

    private void hideStatusBar() {
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }

}
