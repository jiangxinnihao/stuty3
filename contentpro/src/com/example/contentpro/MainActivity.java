package com.example.contentpro;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private MySqliteOpenHelper mysqlihelp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mysqlihelp = new MySqliteOpenHelper(this, "dbone", null, 1);
        Button btn_create = (Button) findViewById(R.id.btn_create);
        btn_create.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				ContentResolver contentresolver= getContentResolver();
				Uri uri = Uri.parse("content://com.example.contentpro/user");
				ContentValues values = new ContentValues();
				values.put("name", "jiangxin");
				values.put("sex", "nan");
				values.put("desc", "dfdfd");
				contentresolver.insert(uri, values);
				
			}
		});
    }
}
