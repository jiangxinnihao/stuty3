package com.example.titlelayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class TitleLayout extends LinearLayout {

	public TitleLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		LayoutInflater.from(context).inflate(R.layout.title_layout,this);
		Button button1 = (Button)findViewById(R.id.tbtn1);
		Button button2= (Button)findViewById(R.id.tbtn2);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getContext(), "this is btn1", 100).show();
				
			}
		});
	}
	
}
