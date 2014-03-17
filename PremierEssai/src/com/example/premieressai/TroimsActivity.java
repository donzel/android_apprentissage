package com.example.premieressai;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

public class TroimsActivity extends Activity {

	TextView montTexte = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// montTexte =(TextView)findViewById(R.id.hello);
		montTexte.setText(" nouveau test");

		EditText ed = new EditText(this);
		ed.setHint(R.string.editText);
		ed.setInputType(InputType.TYPE_TEXT_FLAG_MULTI_LINE);
		ed.setLines(5);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
