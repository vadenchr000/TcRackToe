package com.example.t_c_rack_toe;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.KeyTrigger;

import java.util.AbstractCollection;

    public class MainGame extends AppCompatActivity{
        {
            enum class Turn
        {
            NOUGHT,
            CROSS
        }
        }

        private var firstTurn = Turn.CROSS
        private var currentTurn = Turn.CROSS

        private lateinit var binding : ActivityMainBinding{

        }

        TextView textView;

        @Override

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            textView = (TextView) findViewById(R.id.textView);
        }

        public void updateText(View view){
            textView.setText("ButtonClicked!");
            System.out.println("Button clicked");
        }
    }
