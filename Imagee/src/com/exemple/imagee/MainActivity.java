package com.exemple.imagee;



import com.example.imagee.R;
import com.example.imagee.R.attr;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button button = null ;
	String hist = null ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activitymain);
		//Button b = (Button) findViewById(R.id.second);
		//¨Parti Annimation
		//ON cree un utilitaire de configuration pour cette animation
		Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
