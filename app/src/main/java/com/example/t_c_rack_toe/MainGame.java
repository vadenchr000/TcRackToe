package com.example.t_c_rack_toe;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainGame extends AppCompatActivity{

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
