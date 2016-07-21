package com.optimistic.contactlist;

import android.R.string;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper{
	
	public static final String DATABASE_NAME="CONTACTLIST";
	public static final String TABLE_NAME="CONTACT";
	public static final String KEY_ID="ID";
	public static final String KEY_NAME="NAME";
	public static final String PHONE_NUM="PHONENUM";
	public static final String EMAIL="EMAIL";
	public static final int DATABASE_VERSION=1;
	
	

	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase database) {
		// TODO Auto-generated method stub
		String sqlquerysString="create "+TABLE_NAME+" ( "+KEY_ID+" INTEGER PRIMARY KEY "+KEY_NAME+" TEXT "+PHONE_NUM+" TEXT "+
		EMAIL+" TEXT )";
		database.execSQL(sqlquerysString);
		
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		String sqlString="drop table "+TABLE_NAME+""
		
	}

}
