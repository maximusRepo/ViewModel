package com.example.veiwmodel;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv_view1,tv_view2,tv_view3,tv_view4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_view1 = findViewById(R.id.txt1);
        tv_view2 = findViewById(R.id.txt2);
        tv_view3 = findViewById(R.id.txt3);
        tv_view4 = findViewById(R.id.txt4);
        getData();

    }

    private void getData(){
        ViewModel viewModel = ViewModelProviders.of(this).get(ViewModel.class);
        viewModel.getData().observe(this, new Observer<PostResponseModel>() {
            @Override
            public void onChanged(@Nullable PostResponseModel postResponseModel) {
                tv_view1.setText(postResponseModel.getReceiver_email_normalized());
                tv_view2.setText(postResponseModel.getTitle());
                tv_view3.setText(postResponseModel.getBody());
                tv_view4.setText(postResponseModel.getReceiver_email());
            }
        });
    }

}
