package com.tunshu.tunshubook.fragment;

import android.view.View;

import com.tunshu.tunshubook.R;

/**
 * Created by Whipan on 2017/6/14.
 */

public class MessageFragment extends BaseFragment {

    @Override
    public View initLayout() {
        mRootView = View.inflate(mActivity, R.layout.fragment_message, null);
        return mRootView;
    }
}
