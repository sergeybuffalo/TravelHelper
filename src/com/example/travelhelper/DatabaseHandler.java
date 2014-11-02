/*File: DatabaseHandler.java Sergey Cherny CSE321 Fall2012 */
package com.example.travelhelper;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {

	// All Static variables
	// Database Version
	private static final int DATABASE_VERSION = 1;

	// Database Name
	private static final String DATABASE_NAME = "phraseManager";

	// Phrases table name
	private static final String TABLE_PHRASES = "phrases";

	// Phrases Table Columns names
	private static final String KEY_ID = "id";
	private static final String KEY_ENGLISH = "english";
	private static final String KEY_RUSSIAN = "russian";
	private static final String KEY_PRONOUNCE = "pronounce";

	public DatabaseHandler(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	// Creating Tables
	@Override
	public void onCreate(SQLiteDatabase db) {
		String CREATE_PhraseS_TABLE = "CREATE TABLE " + TABLE_PHRASES + "("
				+ KEY_ID + " INTEGER PRIMARY KEY," + KEY_ENGLISH + " TEXT,"
				+ KEY_RUSSIAN + " TEXT," + KEY_PRONOUNCE + " TEXT" + ")";
		db.execSQL(CREATE_PhraseS_TABLE);
	}

	// Upgrading database
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// Drop older table if existed
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_PHRASES);

		// Create tables again
		onCreate(db);
	}

	/**
	 * All CRUD(Create, Read, Update, Delete) Operations
	 */

	// Adding new Phrase
	void addPhrase(Phrase phrase) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_ENGLISH, phrase.getEnglish());
		values.put(KEY_RUSSIAN, phrase.getRussian()); // Phrase russian
		values.put(KEY_PRONOUNCE, phrase.getPronounce()); // Phrase pronounce

		// Inserting Row
		db.insert(TABLE_PHRASES, null, values);
		db.close(); // Closing database connection
	}

	

	// Getting single Phrase
	Phrase getPhrase2(String english) {
		SQLiteDatabase db = this.getReadableDatabase();

		Cursor cursor = db.query(TABLE_PHRASES, new String[] { KEY_ID,
				KEY_ENGLISH, KEY_RUSSIAN, KEY_PRONOUNCE }, KEY_ENGLISH + "=?",
				new String[] { english }, null, null, null, null);
		if (cursor != null)
			cursor.moveToFirst();

		Phrase phrase = new Phrase(Integer.parseInt(cursor.getString(0)),
				cursor.getString(1), cursor.getString(2), cursor.getString(3));
		// return Phrase
		return phrase;
	}

	

}