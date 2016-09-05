package com.example.contentpro;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class MySqliteOpenHelper extends SQLiteOpenHelper {

	private Context mcontexnt;
	private final String dbstr = "create table user"
								+"(id INTEGER PRIMARY KEY AUTOINCREMENT,"
			                    +"name text,"
								+"sex text,"
			                    +"desc text)";
	public MySqliteOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		this.mcontexnt = context;
	}



	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(dbstr);
		Toast.makeText(mcontexnt, "create table success", Toast.LENGTH_LONG).show();

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		

	}

}
