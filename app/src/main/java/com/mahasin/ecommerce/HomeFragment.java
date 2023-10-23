package com.mahasin.ecommerce;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    ImageView shopping;
    ImageSlider imageSlider;
    LinearLayout product1;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_home, container, false);


        imageSlider =view.findViewById(R.id.image_slider);
        product1=view.findViewById(R.id.product1);

        ArrayList<SlideModel> imageList = new ArrayList<>();
        imageList.add(new SlideModel(R.drawable.img, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.img_1,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.img,ScaleTypes.CENTER_CROP));
        imageSlider.setImageList(imageList);

        product1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(),Details.class));



            }
        });


        return view;
    }
}