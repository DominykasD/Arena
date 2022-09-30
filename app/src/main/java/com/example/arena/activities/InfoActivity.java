package com.example.arena.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.arena.R;
import com.example.arena.fragments.InstructionltFragment;

public class InfoActivity extends AppCompatActivity {

    private Class fragmentClass;
    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        Toolbar toolbar = findViewById(R.id.toolbar2);
        TextView instructionsLT = findViewById(R.id.textView63);
        ConstraintLayout instructionButtons = findViewById(R.id.instructionButtons);

        toolbar.setTitle("Informacija");
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));

        fragment = null;
        instructionsLT.setOnClickListener(v -> {

            instructionButtons.setVisibility(View.GONE);

            fragmentClass = InstructionltFragment.class;

            try {
                fragment = (Fragment) fragmentClass.newInstance();
            } catch (IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }

            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();

            toolbar.setTitle("Naudojimo taisyklės LT");
        });


    }
}