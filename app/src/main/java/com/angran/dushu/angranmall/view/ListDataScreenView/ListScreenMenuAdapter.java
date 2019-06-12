package com.angran.dushu.angranmall.view.ListDataScreenView;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class ListScreenMenuAdapter extends BaseMenuAdapter{
    private Context mContext;

    public ListScreenMenuAdapter(Context context){
        this.mContext = context;
    }

    private String[] mItems ={"附近","美食","智能排序","筛选"};

    @Override
    public int getCount() {
        return mItems.length;
    }

    @Override
    public View getTabView(int position, ViewGroup parent) {
        TextView tabView = (TextView) LayoutInflater.from(mContext).inflate(R.layout.ui_list_data_screen_tab,parent,false);
        tabView.setText(mItems[position]);
        tabView.setTextColor(Color.BLACK);
        return tabView;
    }

    @Override
    public View getMenuView(int position, ViewGroup parent) {
        // 真正开发过程中，不同的位置显示的布局不一样
        TextView menuView = (TextView) LayoutInflater.from(mContext).inflate(R.layout.ui_list_data_screen_menu,parent,false);
        menuView.setText(mItems[position]);
        return menuView;
    }

    @Override
    public void menuClose(View tabView) {
        TextView tabTv = (TextView) tabView;
        tabTv.setTextColor(Color.BLACK);
    }

    @Override
    public void menuOpen(View tabView) {
        TextView tabTv = (TextView) tabView;
        tabTv.setTextColor(Color.RED);
    }
}