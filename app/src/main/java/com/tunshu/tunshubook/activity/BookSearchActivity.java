package com.tunshu.tunshubook.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.tunshu.tunshubook.R;

/**
 * Created by Whipan on 2017/6/16.
 */

public class BookSearchActivity extends AppCompatActivity {

    private RecyclerView mMsgList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_search);
        initView();
    }

    private void initView() {
        mMsgList = (RecyclerView) findViewById(R.id.msg_list);
//        mMsgList.setAdapter();
    }
}
