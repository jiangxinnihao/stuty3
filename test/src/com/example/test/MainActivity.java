package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Button btn1 = (Button) findViewById(R.id.btn1);
       btn1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
		  
			Intent intent = new Intent("com.jiang.xin.Second");
			intent.putExtra("name", "jiangxin");
			startActivityForResult(intent, 1);
		}
	});
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	if(requestCode==1 & resultCode==RESULT_OK){
    		String str = data.getStringExtra("name");
    		Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    	}
    }
}
