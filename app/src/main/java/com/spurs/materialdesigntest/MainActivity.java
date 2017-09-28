package com.spurs.materialdesigntest;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFab(View v){
        //Toast.makeText(this, "fab click", Toast.LENGTH_SHORT).show();

        Snackbar sb = Snackbar.make(v,"this is snackbar",Snackbar.LENGTH_INDEFINITE);
        sb.setAction("I Agree", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "click Action", Toast.LENGTH_SHORT).show();
            }
        });
        sb.setActionTextColor(0xffff0000);

        sb.show();
    }

}
