package com.example.msgapp;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	private List<Msg> msgs = new ArrayList<Msg>();
	  public Button sendmsgbtn;
      public TextView tvmsg ;
      public TextView msgtype;
      private ListView listview;
      private MsgAdapter msgad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        sendmsgbtn =(Button)findViewById(R.id.sendbtn);
        tvmsg = (TextView)findViewById(R.id.msgcontent);
        msgtype = (TextView)findViewById(R.id.msgtype);
        listview = (ListView)findViewById(R.id.listmsg);
        msgs.add(new Msg("hellow", 0));
       msgad = new MsgAdapter(this, R.layout.msgcav, msgs);
       msgs.add(new Msg("hellow", 0));
       listview.setAdapter(msgad);
        
        sendmsgbtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				msgs.add(new Msg(tvmsg.getText().toString(), Integer.parseInt(msgtype.getText().toString())));
				msgad.notifyDataSetChanged();
				
				
			}
		});
        
    }
   
}
