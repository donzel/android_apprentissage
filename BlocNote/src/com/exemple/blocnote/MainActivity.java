package com.exemple.blocnote;

import com.example.blocnote.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {

	Button red = null ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		red = (Button) findViewById(R.id.surligne);
		//	red.setText("hello");
	}

}
