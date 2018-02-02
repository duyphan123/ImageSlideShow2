package com.example.quangviet.imageslideshow2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnNext,btnPrevious;
    ImageView img;
    ArrayList<Integer> al = new ArrayList<>();
    int pos =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControl();
        al.add(R.drawable.a01);
        al.add(R.drawable.a02);
        al.add(R.drawable.a03);
        al.add(R.drawable.a04);
        al.add(R.drawable.a05);
        al.add(R.drawable.a06);
        al.add(R.drawable.a07);
        al.add(R.drawable.a08);
        al.add(R.drawable.a09);
        al.add(R.drawable.a10);
        al.add(R.drawable.a11);


    }

    @Override
    public void onProvideAssistData(Bundle data) {
        super.onProvideAssistData(data);
    }

    private void addControl() {
        btnNext = findViewById(R.id.buttonNext);
        btnPrevious = findViewById(R.id.buttonPrevious);
        img = findViewById(R.id.imageView);
    }

    public void onClickXML(View view){
        switch (view.getId()){
            case R.id.buttonNext:
                if(pos==10){
                    pos--;
                }
                pos++;
                img.setImageResource(al.get(pos));

                break;
            case R.id.buttonPrevious:
                if(pos==0){
                    pos++;
                }
                pos--;
                img.setImageResource(al.get(pos));

                break;
        }
    }
}
