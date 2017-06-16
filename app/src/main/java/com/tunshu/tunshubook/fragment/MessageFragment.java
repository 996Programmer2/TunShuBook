package com.tunshu.tunshubook.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.tunshu.tunshubook.R;
import com.tunshu.tunshubook.adapter.MessageListAdapter;

/**
 * Created by Whipan on 2017/6/14.
 */

public class MessageFragment extends BaseFragment {

    private RecyclerView mMsgListRecyclerView;

    @Override
    public View initLayout() {
        mRootView = View.inflate(mActivity, R.layout.fragment_message, null);
        return mRootView;
    }

    @Override
    public void initView() {
        mMsgListRecyclerView = (RecyclerView) mRootView.findViewById(R.id.msg_list);
        mMsgListRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mMsgListRecyclerView.setAdapter(new MessageListAdapter(getActivity()));
    }
}
