package com.example.smd_ass1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

import com.google.android.material.tabs.TabLayout;

public class SignupActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);

        tabLayout.setupWithViewPager((viewPager));
        VPadapter vPadapter = new VPadapter((getSupportFragmentManager()), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vPadapter.addFragment(new fragment1(),"One");
        vPadapter.addFragment(new fragment2(),"Two");
        vPadapter.addFragment(new fragment3(),"Three");
        viewPager.setAdapter(vPadapter);
    }
//    public boolean onTouchEvent(MotionEvent touchEvent){
//        float x2,y1,y2;
//        float x1 = 0;
//        switch(touchEvent.getAction()){
//            case MotionEvent.ACTION_DOWN:
//                 x1 = touchEvent.getX();
//                 y1 = touchEvent.getY();
//                break;
//            case MotionEvent.ACTION_UP:
//                 x2 = touchEvent.getX();
//                 y2 = touchEvent.getY();
//                if(x1 < x2){
//                Intent i = new Intent(SignupActivity.this, ThirdActivity.class);
//                startActivity(i);
//            }else if(x1 > x2){
//                Intent i = new Intent(SignupActivity.this, ThirdActivity.class);
//                startActivity(i);
//            }
//            break;
//        }
//        return false;
//    }
}