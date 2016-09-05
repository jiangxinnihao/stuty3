package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondactivity);
		TextView tv1 = (TextView) findViewById(R.id.tv1);
		Intent intent = getIntent();
		String str =intent.getStringExtra("name");
		if(!str.equals("")){
			tv1.setText(str);
		}
		
	}
   @Override
public void onBackPressed() {
	   Intent intent2 = new Intent();
		intent2.putExtra("name", "xinjiang");
		setResult(RESULT_OK, intent2);
		finish();
}
}
