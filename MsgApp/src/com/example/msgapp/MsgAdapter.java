package com.example.msgapp;

import java.util.List;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;

public class MsgAdapter extends ArrayAdapter<Msg> {
	private int viewres;
	public MsgAdapter(Context context, int textViewResourceId, List<Msg> objects) {
		super(context, textViewResourceId, objects);
		// TODO Auto-generated constructor stub
		viewres = textViewResourceId;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		Log.v("viewpositon",position+"");
		View view;
		Msg msg = getItem(position);
		view=LayoutInflater.from(getContext()).inflate(viewres, null);
		EditText etsend =(EditText)view.findViewById(R.id.leftbg);
		EditText etrecv =(EditText)view.findViewById(R.id.rightbg);
		if(msg.getMsgtype()==Msg.RMSG){
			etsend.setText(msg.getMsg());
			//etsend.setVisibility(0);
			
		}
		else{
			etrecv.setText(msg.getMsg());
			//etrecv.setVisibility(0);
			
		
		}
		Log.v("tet",view.toString());
		return view;
	}

}
