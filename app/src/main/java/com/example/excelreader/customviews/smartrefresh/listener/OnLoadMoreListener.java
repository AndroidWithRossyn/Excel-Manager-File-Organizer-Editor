package com.example.excelreader.customviews.smartrefresh.listener;


import androidx.annotation.NonNull;

import com.example.excelreader.customviews.smartrefresh.api.RefreshLayout;



public interface OnLoadMoreListener {
    void onLoadMore(@NonNull RefreshLayout refreshLayout);
}
