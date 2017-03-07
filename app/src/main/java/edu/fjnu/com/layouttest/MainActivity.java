package edu.fjnu.com.layouttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findview();
        initview();
    }

    private void findview() {
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
    }

    private void initview() {
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.button1:
                intent.setClass(this,LinearLayoutActivity.class);
                break;
            case R.id.button2:
                intent.setClass(this,RelativeLayoutActivity.class);
                break;
            case R.id.button3:
                intent.setClass(this,TableLayoutActivity.class);
                break;
            case R.id.button4:
                intent.setClass(this,SimpleAdapter.class);
                break;
        }
        this.startActivity(intent);
    }
}
