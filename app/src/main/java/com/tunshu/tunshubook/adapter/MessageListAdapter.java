package com.tunshu.tunshubook.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.tunshu.tunshubook.R;
import com.tunshu.tunshubook.holder.MessageListHolder;

/**
 * Created by Whipan on 2017/6/16.
 */

public class MessageListAdapter extends RecyclerView.Adapter {

    private Context mContext;
    private MessageListHolder mMessageListHolder;

    public MessageListAdapter(Context context) {
        mContext = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mMessageListHolder = new MessageListHolder(View.inflate(mContext, R.layout.item_msg_list, null));
        return mMessageListHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
