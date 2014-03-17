package com.example.android_jeux;




import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button button ;
	EditText  ts  ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button) findViewById(R.id.boutton);
		button.setOnTouchListener(tlstouch);
		ts =  new EditText(this);
		ts.setHint(R.string.hello);
		ts.setText("rollala");
		button.setText(ts.getText());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private OnTouchListener tlstouch = new OnTouchListener() {

		@Override
		public boolean onTouch(View v, MotionEvent event) {
			// TODO Auto-generated method stub
			Button button = (Button)v;
			int largeur = button.getWidth();
			int hauteur = button.getHeight();
			float x = event.getX();
			float y = event.getY();
			//recuperation de 
			button.setTextSize(Math.abs(x-largeur/2 +Math.abs(y-hauteur/2)));
			
			return true;
		}
	};
}
