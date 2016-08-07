package com.ard.desgintablayoutapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



/**
 * Created by Clock on 2016/08/01.
 */
public class AuthorInfoFragment extends Fragment {

    public static Fragment newInstance() {
        AuthorInfoFragment fragment = new AuthorInfoFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //需要利用实现了嵌套滚动机制的控件，才能出现AppBarLayout往上推的效果
        View rootView = inflater.inflate(R.layout.fragment_author_info, container, false);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);    //若用其他风格显示---需定义LinearLayoutManager显示类型

        recyclerView.setAdapter(new AuthorRecyclerAdapter());
        return rootView;
    }
}
