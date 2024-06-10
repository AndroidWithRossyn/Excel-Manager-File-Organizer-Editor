package com.example.excelreader.customviews.smartrefresh.impl;

import android.annotation.SuppressLint;
import android.view.View;

import com.example.excelreader.customviews.smartrefresh.api.RefreshFooter;
import com.example.excelreader.customviews.smartrefresh.internal.InternalAbstract;



@SuppressLint("ViewConstructor")
public class RefreshFooterWrapper extends InternalAbstract implements RefreshFooter/*, InvocationHandler */{

    public RefreshFooterWrapper(View wrapper) {
        super(wrapper);
    }



}
