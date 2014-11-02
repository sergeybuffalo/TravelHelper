/*File: MainActivity.java Sergey Cherny CSE321 Fall2012 */
package com.example.travelhelper;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	Button bye, dontworry, good, goodevening, goodmorning, hello, howareyou,
			no, excuseme, please, repeat, thanks, whatisthat, yes,
			youarewelcome, whattimeisit;
	Toast msg;
	TextView t;
	MediaPlayer mediaPlayer;
	DatabaseHandler db = new DatabaseHandler(this);

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		bye = (Button) findViewById(R.id.bye);
		dontworry = (Button) findViewById(R.id.dontworry);
		good = (Button) findViewById(R.id.good);
		goodevening = (Button) findViewById(R.id.goodevening);
		goodmorning = (Button) findViewById(R.id.goodmorning);
		hello = (Button) findViewById(R.id.hello);
		howareyou = (Button) findViewById(R.id.howareyou);
		no = (Button) findViewById(R.id.no);
		excuseme = (Button) findViewById(R.id.excuseme);
		please = (Button) findViewById(R.id.please);
		repeat = (Button) findViewById(R.id.repeat);
		thanks = (Button) findViewById(R.id.thanks);
		whatisthat = (Button) findViewById(R.id.whatisthat);
		yes = (Button) findViewById(R.id.yes);
		youarewelcome = (Button) findViewById(R.id.youarewelcome);
		whattimeisit = (Button) findViewById(R.id.whattimeisit);

		bye.setOnClickListener(this);
		dontworry.setOnClickListener(this);
		good.setOnClickListener(this);
		goodevening.setOnClickListener(this);
		goodmorning.setOnClickListener(this);
		hello.setOnClickListener(this);
		howareyou.setOnClickListener(this);
		no.setOnClickListener(this);
		excuseme.setOnClickListener(this);
		please.setOnClickListener(this);
		repeat.setOnClickListener(this);
		thanks.setOnClickListener(this);
		whatisthat.setOnClickListener(this);
		yes.setOnClickListener(this);
		youarewelcome.setOnClickListener(this);
		whattimeisit.setOnClickListener(this);

		msg = Toast.makeText(getBaseContext(), "TravelHelper Russian",
				Toast.LENGTH_LONG);
		msg.show();

		t = new TextView(this);
		t = (TextView) findViewById(R.id.text);
		t.setText("Welcome to TravelHelper Russian");

		Phrase a = new Phrase("Good Bye", "Пока", "Paka");
		Phrase b = new Phrase("Don't worry", "Не волнуйся", "Ne volnuisya");
		Phrase c = new Phrase("Good", "Хорошо", "Harasho");
		Phrase d = new Phrase("Good Evening", "Добрый вечер", "Dobriy vecher");
		Phrase e = new Phrase("Good Morning", "Доброе утро", "Dobroye utro");
		Phrase f = new Phrase("Hello", "Привет", "Privet");
		Phrase g = new Phrase("How are you?", "Как дела?", "Kak dela?");
		Phrase h = new Phrase("No", "Нет", "Net");
		Phrase i = new Phrase("Excuse me", "Извините", "Izvinyite");
		Phrase j = new Phrase("Please", "Пожалуйсто", "Pazhalusta");
		Phrase k = new Phrase("Repeat that", "Повторите", "Povtoritye");
		Phrase l = new Phrase("Thanks", "Спасибо", "Spasiba");
		Phrase m = new Phrase("What is that?", "Что ето?", "Chto eta?");
		Phrase n = new Phrase("Yes", "Да", "Da");
		Phrase o = new Phrase("You are welcome", "Не за что", "Ne za shto");
		Phrase p = new Phrase("What time is it?", "Который час?",
				"Katoriy chas?");

		db.addPhrase(a);
		db.addPhrase(b);
		db.addPhrase(c);
		db.addPhrase(d);
		db.addPhrase(e);
		db.addPhrase(f);
		db.addPhrase(g);
		db.addPhrase(h);
		db.addPhrase(i);
		db.addPhrase(j);
		db.addPhrase(k);
		db.addPhrase(l);
		db.addPhrase(m);
		db.addPhrase(n);
		db.addPhrase(o);
		db.addPhrase(p);

	}

	@Override
	public void onClick(View v) {

		if (v.getId() == R.id.bye) {

			Phrase phr = db.getPhrase2("Good Bye");
			String str = "English: " + phr.getEnglish() + " Russian: "
					+ phr.getRussian() + " Pronounce: " + phr.getPronounce();

			t.setText(str);

			mediaPlayer = MediaPlayer.create(this, R.raw.bye);
			mediaPlayer.start(); // no need to call prepare(); create() does
									// that for you

		}
		if (v.getId() == R.id.dontworry) {

			Phrase phr = db.getPhrase2("Don't worry");
			String str = "English: " + phr.getEnglish() + " Russian: "
					+ phr.getRussian() + " Pronounce: " + phr.getPronounce();

			t.setText(str);

			mediaPlayer = MediaPlayer.create(this, R.raw.dontworry);
			mediaPlayer.start();

		}
		if (v.getId() == R.id.good) {

			Phrase phr = db.getPhrase2("Good");
			String str = "English: " + phr.getEnglish() + " Russian: "
					+ phr.getRussian() + " Pronounce: " + phr.getPronounce();

			t.setText(str);

			mediaPlayer = MediaPlayer.create(this, R.raw.good);
			mediaPlayer.start();
		}
		if (v.getId() == R.id.goodevening) {

			Phrase phr = db.getPhrase2("Good Evening");
			String str = "English: " + phr.getEnglish() + " Russian: "
					+ phr.getRussian() + " Pronounce: " + phr.getPronounce();

			t.setText(str);

			mediaPlayer = MediaPlayer.create(this, R.raw.goodevening);
			mediaPlayer.start();
		}
		if (v.getId() == R.id.goodmorning) {

			Phrase phr = db.getPhrase2("Good Morning");
			String str = "English: " + phr.getEnglish() + " Russian: "
					+ phr.getRussian() + " Pronounce: " + phr.getPronounce();

			t.setText(str);

			mediaPlayer = MediaPlayer.create(this, R.raw.goodmorning);
			mediaPlayer.start();
		}
		if (v.getId() == R.id.hello) {

			Phrase phr = db.getPhrase2("Hello");
			String str = "English: " + phr.getEnglish() + " Russian: "
					+ phr.getRussian() + " Pronounce: " + phr.getPronounce();

			t.setText(str);

			mediaPlayer = MediaPlayer.create(this, R.raw.hello);
			mediaPlayer.start();
		}
		if (v.getId() == R.id.howareyou) {

			Phrase phr = db.getPhrase2("How are you?");
			String str = "English: " + phr.getEnglish() + " Russian: "
					+ phr.getRussian() + " Pronounce: " + phr.getPronounce();

			t.setText(str);

			mediaPlayer = MediaPlayer.create(this, R.raw.howareyou);
			mediaPlayer.start();
		}
		if (v.getId() == R.id.no) {

			Phrase phr = db.getPhrase2("No");
			String str = "English: " + phr.getEnglish() + " Russian: "
					+ phr.getRussian() + " Pronounce: " + phr.getPronounce();

			t.setText(str);

			mediaPlayer = MediaPlayer.create(this, R.raw.no);
			mediaPlayer.start();
		}
		if (v.getId() == R.id.excuseme) {

			Phrase phr = db.getPhrase2("Excuse me");
			String str = "English: " + phr.getEnglish() + " Russian: "
					+ phr.getRussian() + " Pronounce: " + phr.getPronounce();

			t.setText(str);

			mediaPlayer = MediaPlayer.create(this, R.raw.excuseme);
			mediaPlayer.start();
		}
		if (v.getId() == R.id.please) {

			Phrase phr = db.getPhrase2("Please");
			String str = "English: " + phr.getEnglish() + " Russian: "
					+ phr.getRussian() + " Pronounce: " + phr.getPronounce();

			t.setText(str);

			mediaPlayer = MediaPlayer.create(this, R.raw.please);
			mediaPlayer.start();
		}
		if (v.getId() == R.id.repeat) {

			Phrase phr = db.getPhrase2("Repeat that");
			String str = "English: " + phr.getEnglish() + " Russian: "
					+ phr.getRussian() + " Pronounce: " + phr.getPronounce();

			t.setText(str);

			mediaPlayer = MediaPlayer.create(this, R.raw.repeat);
			mediaPlayer.start();
		}
		if (v.getId() == R.id.thanks) {

			Phrase phr = db.getPhrase2("Thanks");
			String str = "English: " + phr.getEnglish() + " Russian: "
					+ phr.getRussian() + " Pronounce: " + phr.getPronounce();

			t.setText(str);

			mediaPlayer = MediaPlayer.create(this, R.raw.thanks);
			mediaPlayer.start();
		}
		if (v.getId() == R.id.whatisthat) {

			Phrase phr = db.getPhrase2("What is that?");
			String str = "English: " + phr.getEnglish() + " Russian: "
					+ phr.getRussian() + " Pronounce: " + phr.getPronounce();

			t.setText(str);

			mediaPlayer = MediaPlayer.create(this, R.raw.whatisthat);
			mediaPlayer.start();
		}
		if (v.getId() == R.id.yes) {

			Phrase phr = db.getPhrase2("Yes");
			String str = "English: " + phr.getEnglish() + " Russian: "
					+ phr.getRussian() + " Pronounce: " + phr.getPronounce();

			t.setText(str);

			mediaPlayer = MediaPlayer.create(this, R.raw.yes);
			mediaPlayer.start();
		}
		if (v.getId() == R.id.youarewelcome) {

			Phrase phr = db.getPhrase2("You are welcome");
			String str = "English: " + phr.getEnglish() + " Russian: "
					+ phr.getRussian() + " Pronounce: " + phr.getPronounce();

			t.setText(str);

			mediaPlayer = MediaPlayer.create(this, R.raw.youarewelcome);
			mediaPlayer.start();
		}
		if (v.getId() == R.id.whattimeisit) {

			Phrase phr = db.getPhrase2("What time is it?");
			String str = "English: " + phr.getEnglish() + " Russian: "
					+ phr.getRussian() + " Pronounce: " + phr.getPronounce();

			t.setText(str);

			mediaPlayer = MediaPlayer.create(this, R.raw.whattimeisit);
			mediaPlayer.start();
		}

	}

}
