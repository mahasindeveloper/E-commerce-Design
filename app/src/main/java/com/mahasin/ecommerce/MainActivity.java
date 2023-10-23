package com.mahasin.ecommerce;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=findViewById(R.id.bottomNavigation);


        // Get or create a badge for a specific menu item
        BadgeDrawable badge = bottomNavigationView.getOrCreateBadge(R.id.navigation);

// Get the color resources
        Resources resources = getResources();
        int badgeBackgroundColor = resources.getColor(R.color.selected_color);  // Replace R.color.selected_color with your desired color resource
        int badgeTextColor = resources.getColor(R.color.white);  // Replace R.color.white with your desired text color resource

// Set the badge background color
        badge.setBackgroundColor(badgeBackgroundColor);

// Set the badge text (number) color
        badge.setBadgeTextColor(badgeTextColor);

// Set a number on the badge
        badge.setNumber(11);  // Set the desired number



        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout,new HomeFragment());
        fragmentTransaction.commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId()==R.id.home){

                    FragmentManager fragmentManager=getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout,new HomeFragment());
                    fragmentTransaction.commit();


                } else if (item.getItemId()==R.id.navigation) {

                    FragmentManager fragmentManager=getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout,new NatificatipnFragment());
                    fragmentTransaction.commit();

                }else if (item.getItemId()==R.id.favorites) {

                    FragmentManager fragmentManager=getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout,new FavoritsFragment());
                    fragmentTransaction.commit();


                }else if (item.getItemId()==R.id.account) {

                    FragmentManager fragmentManager=getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout,new AccountFragment());
                    fragmentTransaction.commit();


                }



                return true;
            }
        });



    }
}