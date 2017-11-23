/*
 * Copyright (C) 2016 jiashuangkuaizi, Inc.
 */
package com.diygreen.slidingpanelayoutdemo.simple;

import android.app.Fragment;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.diygreen.slidingpanelayoutdemo.R;

/**
 * Description:
 * <br/>Program Name:
 * <br/>Date: 2016年3月7日
 *
 * @author 李旺成
 * @version 1.0
 */

public class RightContentFragment extends Fragment {

    private TextView mContentTV;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rightcontent, container, false);
        mContentTV = (TextView) view.findViewById(R.id.tv_content);

        ContentLoadingProgressBar progressBar=view.findViewById(R.id.progressBar);
        progressBar.getIndeterminateDrawable()
                .setColorFilter(ContextCompat.getColor(getActivity(),R.color.colorPrimary),
                        PorterDuff.Mode.MULTIPLY);
        return view;
    }

    public void setContent(String content) {
        mContentTV.setText(content);
    }
}
