package com.example.photo;

import java.io.File;
import java.io.IOException;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
	File imagefile = new File(Environment.getExternalStorageDirectory(), "tempimage.jpg");
	private final int CROP_PHOTO =2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_image = (Button) findViewById(R.id.btn_image);
        ImageView iv_image =(ImageView) findViewById(R.id.iv_image);
        if(imagefile.exists()){
        
        		imagefile.delete();
			
		
        }
    	try {
			imagefile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       final Uri imageUri = Uri.fromFile(imagefile);
        btn_image.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent image_intent = new Intent("android.intent.action.GET_CONTENT");
				Log.e("error", Environment.getExternalStorageDirectory().getPath());
				image_intent.setType("image/*");
				image_intent.putExtra("crop", true);
				image_intent.putExtra("scale", true);
				image_intent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri);
				startActivityForResult(image_intent, CROP_PHOTO); 
				}
				
			
		});
        
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	// TODO Auto-generated method stub
    	super.onActivityResult(requestCode, resultCode, data);
    }
}
