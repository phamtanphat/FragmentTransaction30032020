package com.example.fragmenttransaction30032020;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import java.util.Random;

public class AndroidFragment extends Fragment {



    View v;
    RelativeLayout mContainer;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_android, container, false);
        mContainer = v.findViewById(R.id.relativeBackgroundAndroid);
        mContainer.setBackgroundColor(Color.rgb(new Random().nextInt(255),new Random().nextInt(255),new Random().nextInt(255)));
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("BBB","onViewCreated");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("BBB","OnDestroyview");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("BBB","onDetach");
    }
}