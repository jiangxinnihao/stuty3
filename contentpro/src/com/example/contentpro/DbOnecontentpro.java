package com.example.contentpro;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

public class DbOnecontentpro extends ContentProvider {
	private final static int USERDIR = 1;
	private final static int USERITEM = 2;
	
	private static UriMatcher urimatcher= new UriMatcher(UriMatcher.NO_MATCH);
	private final static String anuri="com.example.contentpro";
	private MySqliteOpenHelper mysqlitehelp;
	static{
		urimatcher.addURI(anuri, "user", USERDIR);
		urimatcher.addURI(anuri, "user/#", USERITEM);
	}
	public DbOnecontentpro() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onCreate() {
		 mysqlitehelp = new MySqliteOpenHelper(getContext(), "user", null, 1);
		return true;
	}

	@Override
	public Cursor query(Uri uri, String[] projection, String selection,
			String[] selectionArgs, String sortOrder) {
		Cursor cursor=null;
		SQLiteDatabase	db = mysqlitehelp.getWritableDatabase();
		switch(urimatcher.match(uri)){
		case USERDIR:
		cursor = db.query("user", projection, selection, selectionArgs, null, null, sortOrder);	
			break;
		case USERITEM:
			 String id = uri.getPathSegments().get(1);
		cursor = db.query("user", projection, "id=?", new String[]{id}, null, null, null);
			break;
		}
		return cursor;
	}

	@Override
	public String getType(Uri uri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Uri insert(Uri uri, ContentValues values) {
		SQLiteDatabase	db = mysqlitehelp.getWritableDatabase();
		Uri reuri=null;
		switch (urimatcher.match(uri)) {
		case USERDIR:
		case USERITEM:
			long renewid = db.insert("user", null, values);
			reuri = Uri.parse("content://"+anuri+"/user/"+renewid);
			break;
		}
		return reuri;
	}

	@Override
	public int delete(Uri uri, String selection, String[] selectionArgs) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Uri uri, ContentValues values, String selection,
			String[] selectionArgs) {
		// TODO Auto-generated method stub
		return 0;
	}

}
