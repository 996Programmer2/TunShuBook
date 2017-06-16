package com.tunshu.tunshubook.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.tunshu.tunshubook.R;
import com.tunshu.tunshubook.view.CircleImageView;

/**
 * Created by Whipan on 2017/6/16.
 */

public class MessageListHolder extends RecyclerView.ViewHolder {

    private CircleImageView mMsgIcon;
    private TextView        mMsgName;
    private TextView        mMsgTime;
    private TextView        mMsgContent;

    public MessageListHolder(View itemView) {
        super(itemView);
        mMsgIcon = (CircleImageView) itemView.findViewById(R.id.msg_icon);
        mMsgName = (TextView) itemView.findViewById(R.id.msg_name);
        mMsgTime = (TextView) itemView.findViewById(R.id.msg_time);
        mMsgContent = (TextView) itemView.findViewById(R.id.msg_content);
    }
}
