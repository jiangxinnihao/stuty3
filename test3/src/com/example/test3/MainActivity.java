package com.example.test3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "hello world!",Toast.LENGTH_LONG).show();
				Intent intent = new Intent("com.jiang.xin.second");
				startActivityForResult(intent, 1);
				
			}
		});
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	super.onActivityResult(requestCode, resultCode, data);
    	if(requestCode==1){
    		String result = data.getStringExtra("result");
    		Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
    	}
    }
    
}
