package com.example.hllowword;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.text.AlteredCharSequence;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        Log.v("oncreate","this is oncreate");
        Button button =(Button) findViewById(R.id.button1);
        Button button2 =(Button)findViewById(R.id.button2);
        Button button3 =(Button)findViewById(R.id.gotoactivity);
        Button button4 = (Button)findViewById(R.id.gobaidu);
        Button button5 = (Button)findViewById(R.id.alertbtn);
        button.setOnClickListener(new OnClickListener(){
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "nihao", Toast.LENGTH_SHORT).show();
				
			}
		});
        button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				MainActivity.this.finish();
				
			}
		});
        button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,TwoActivity.class);
				startActivity(intent);
				
			}
		});
        button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent2 = new Intent(Intent.ACTION_VIEW);
				intent2.setData(Uri.parse("http://baidu.com"));
				startActivity(intent2);
			}
		});
        button5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AlertDialog.Builder alertdialog = new AlertDialog.Builder(MainActivity.this);
				alertdialog.setCancelable(false);
				alertdialog.setMessage("this is message");
				alertdialog.setTitle("this is title");
			
				alertdialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						Toast.makeText(MainActivity.this, "ok is click", 1000).show();
						
					}
				});
				alertdialog.show();
				
			}
		});
    }
    	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
        	Toast.makeText(MainActivity.this, "this is menu", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onResume() {
    	// TODO Auto-generated method stub
    	super.onResume();
    	Log.v("onresume","this is onresume");
    }
    @Override
    protected void onStop() {
    	// TODO Auto-generated method stub
    	super.onStop();
    	Log.v("onstop","this is onstop");
    }
    @Override
    protected void onRestart() {
    	// TODO Auto-generated method stub
    	super.onRestart();
    	Log.v("onrestart","this is onrestart");
    }
}
