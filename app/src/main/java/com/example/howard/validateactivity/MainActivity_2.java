package com.example.howard.validateactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity_2 extends Activity {
    Button btn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.mylayout);
        btn = (Button) this.findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                MainActivity_2.this.setResult(99, MainActivity_2.this.getIntent());
                MainActivity_2.this.finish();
            }
        });
    }
}
