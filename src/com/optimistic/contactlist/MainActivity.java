package com.optimistic.contactlist;

import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements
		android.view.View.OnClickListener {

	Button showContact, addContact, deleteContact, updateContact;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initialize();

		showContact.setOnClickListener(this);
		addContact.setOnClickListener(this);
		deleteContact.setOnClickListener(this);
		updateContact.setOnClickListener(this);

	}

	private void initialize() {

		showContact = (Button) findViewById(R.id.contactListButton);
		addContact = (Button) findViewById(R.id.addButton);
		deleteContact = (Button) findViewById(R.id.deleteButton);
		updateContact = (Button) findViewById(R.id.updateButton);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		switch (view.getId()) {
		case R.id.contactListButton:

			break;
		case R.id.addButton:
			Intent addIntent=new Intent(MainActivity.this,AddContactActivity.class); 
			startActivity(addIntent);
			break;
		case R.id.deleteButton:
			break;
		case R.id.updateButton:
			break;

		default:
			break;
		}

	}

}
