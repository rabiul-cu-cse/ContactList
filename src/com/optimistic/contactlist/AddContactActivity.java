package com.optimistic.contactlist;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddContactActivity extends Activity {

	String namesString, phoneString, emailString;
	EditText nameEditText, phoneEditText, emailEditText;
	Button saveButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_contact);
		initialize();
	}

	private void initialize() {
		// TODO Auto-generated method stub
		nameEditText = (EditText) findViewById(R.id.addNameEditText);
		phoneEditText = (EditText) findViewById(R.id.phoneNumberEditText);
		emailEditText = (EditText) findViewById(R.id.Email);
		saveButton = (Button) findViewById(R.id.saveButton);
		saveButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				namesString = nameEditText.getText().toString();
				phoneString = phoneEditText.getText().toString();
				emailString = emailEditText.getText().toString();
				if (namesString.equals("") || phoneString.equals("")
						|| emailString.equals("")) {
					Contact contact=new Contact(namesString, phoneString, emailString);
					Toast.makeText(getApplicationContext(),"Add all the fields", Toast.LENGTH_LONG).show();
				} else {
					Toast.makeText(getApplicationContext(), "successful",
							Toast.LENGTH_LONG).show();
				}

			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_contact, menu);
		return true;
	}

}
