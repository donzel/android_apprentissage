package com.example.premieressai;

import android.os.Bundle;
import android.app.Activity;
import android.text.InputType;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private TextView textView;
	private TextView textViewResultat;
	private String hello;
	private Button bcalcul = null;
	private Button breset = null;
	private CheckBox checkBox = null;
	private RadioButton radioMetre = null;
	private RadioButton radioCtm = null;
	private RadioGroup radiogrp = null;
	private EditText taille = null;
	private EditText poid = null;
	private boolean iscentimetre = true;
	private String resultatRecup = null;
	private String defaut = "En attente";

	public String getResultatRecup() {
		return resultatRecup;
	}

	public void setResultatRecup(String resultatRecup) {
		this.resultatRecup = resultatRecup;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		init();
		/*
		 * TextView coucou = new TextView(this); coucou.setText("hello toi !!");
		 * setContentView(coucou);
		 */

		/*
		 * Button b = new Button(this); b.setText("butt"); setContentView(b);
		 */

		// Listener

		/*
		 * b.setOnClickListener(new OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { // TODO Auto-generated method
		 * stub
		 * 
		 * } }); b.setOnTouchListener(new OnTouchListener() {
		 * 
		 * @Override public boolean onTouch(View v, MotionEvent event) { // TODO
		 * Auto-generated method stub return false; } });
		 */

	}

	private void init() {
		// TODO Auto-generated method stub
		bcalcul = (Button) findViewById(R.id.calcul);
		bcalcul.setOnClickListener(onClickCal);
		// bcalcul.setOnTouchListener(this.tlsCalcul);

		breset = (Button) findViewById(R.id.reset);
		breset.setOnClickListener(onClickReset);

		// Text field
		this.poid = (EditText) findViewById(R.id.poids);
		this.taille = (EditText) findViewById(R.id.taille);

		// radio Button
		this.radiogrp = (RadioGroup) findViewById(R.id.radiogroupe);
		this.radioCtm = (RadioButton) findViewById(R.id.radio1);
		this.radioMetre = (RadioButton) findViewById(R.id.radio2);

		this.textViewResultat = (TextView) findViewById(R.id.result);

	}

	private void checkBox() {
		int r = this.radiogrp.getCheckedRadioButtonId();
		if (r == this.radioCtm.getId()) {
			this.iscentimetre = true;
		} else if (r == this.radioMetre.getId()) {
			this.iscentimetre = false;
		}
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public String calculNow() {
		String result = "0";

		String poidsRecup = this.poid.getText().toString();
		String tailleRecup = this.taille.getText().toString();
		this.checkBox();
		float resultf = 0;
		if (poidsRecup.equals("")) {

		}
		float poiddouble = 0;
		try {
			poiddouble = Float.parseFloat(poidsRecup);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			Toast.makeText(this, "le poid est incorrect aucun resul",
					Toast.LENGTH_SHORT).show();
			e.printStackTrace();
		}
		float tailleFloat = 0;
		try {
			tailleFloat = Float.parseFloat(tailleRecup);
		} catch (NumberFormatException e) {
			Toast.makeText(this, "la taille est incorrect acun fichier",
					Toast.LENGTH_SHORT).show();
			// TODO Auto-generated catch block

			e.printStackTrace();
		}

		if (poiddouble <= 0) {
			Toast.makeText(this, "le poid est incorrect", Toast.LENGTH_SHORT)
					.show();
		} else if (tailleFloat <= 0) {
			Toast.makeText(this, "la taille est incorrect", Toast.LENGTH_SHORT)
					.show();
		} else {

			if (this.iscentimetre) {
				tailleFloat = tailleFloat / 100;
			}

			// resultf = poiddouble * poiddouble ;
			/*
			 * resultf = (float) Math.pow(poiddouble, 2); resultf = resultf /
			 * tailleFloat ;
			 */
			tailleFloat = (float) Math.pow(tailleFloat, 2);
			resultf = poiddouble / tailleFloat;

		}
		if (resultf <= 0) {
			Toast.makeText(this, "Erreur resultat", Toast.LENGTH_SHORT).show();
		} else {
			result = String.valueOf(resultf);
		}

		return result;
	}

	// init listener
	/*
	 * private OnTouchListener tlsCalcul = new OnTouchListener() {
	 * 
	 * @Override public boolean onTouch(View vd, MotionEvent event) {
	 * 
	 * 
	 * // TODO Auto-generated method stub return false; } };
	 */

	private OnClickListener onClickCal = new OnClickListener() {

		@Override
		public void onClick(View v) {
			setResultatRecup(calculNow());
			textViewResultat.setText(getResultatRecup());
			// TODO Auto-generated method stub

		}
	};
	private OnClickListener onClickReset = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub

			poid.getText().clear();
			taille.getText().clear();
			textViewResultat.setText(defaut);
		}
	};

}
