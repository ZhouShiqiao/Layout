package edu.fjnu.com.layouttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by Administrator on 2017/3/7 0007.
 */
public class SimpleAdapter extends AppCompatActivity {
    private ListView list;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter);
        findview();
        initview();
    }
    private void findview(){
        list=(ListView)findViewById(R.id.listview);
    }
    private void initview(){

    }
}
