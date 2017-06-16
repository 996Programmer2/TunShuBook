package com.tunshu.tunshubook.fragment;

import android.view.View;
import android.widget.ImageView;

import com.tunshu.tunshubook.R;

/**
 * Created by Whipan on 2017/6/14.
 */

public class HomeFragment extends BaseFragment {

    private ImageView mBookSearchBtn;

    @Override
    public View initLayout() {
        mRootView = View.inflate(mActivity, R.layout.fragment_home, null);
        return mRootView;
    }

    @Override
    public void initView() {
        mBookSearchBtn = (ImageView) mRootView.findViewById(R.id.book_search);
        mBookSearchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
