package com.tunshu.tunshubook.fragment;

import android.view.View;
import android.widget.TextView;

import com.tunshu.tunshubook.R;

/**
 * Created by Whipan on 2017/6/14.
 */

public class HomeFragment extends BaseFragment {

    private TextView mSearch;

    @Override
    public View initLayout() {
        mRootView = View.inflate(mActivity, R.layout.fragment_home, null);
        return null;
    }

    @Override
    public void initView() {
        mSearch = (TextView) mRootView.findViewById(R.id.search);
        mSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
