package com.example.tutolayout;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button button = null ;
	String hist = null ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ressource);
		
		/*//Ecrire String en format HTML - Activity_ressource.xml 
		hist = getResources().getString(R.string.histoire);
		Spanned marked_up = Html.fromHtml(hist);
		button = new Button(this);
		button.setText(marked_up);
		setContentView(button);*/
		
		/*// Argument des ressources  - Activity_ressource.xml  */
		Resources res = getResources();
		// Avec fichier ressource %1 param 1 etc ....
		String chString = res.getString(R.string.hello, "Tom", 25);
		// Sans ressource
		//String ttoto = String.format("salut toi $s",  "lol");
		TextView vue = (TextView)findViewById(R.id.vue);
		vue.setText(chString);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
