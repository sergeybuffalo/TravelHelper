/*File: Phrase.java Sergey Cherny CSE321 Fall2012 */
package com.example.travelhelper;

public class Phrase {

	// private variables
	int _id;
	String _English;
	String _Russian;
	String _pronounce;

	// Empty constructor
	public Phrase() {

	}

	// constructor
	public Phrase(int id, String english, String russian, String _pronounce) {
		this._id = id;
		this._English = english;
		this._Russian = russian;
		this._pronounce = _pronounce;
	}

	// constructor
	public Phrase(String english, String russian, String _pronounce) {
		this._English = english;
		this._Russian = russian;
		this._pronounce = _pronounce;
	}

	// getting ID
	public int getID() {
		return this._id;
	}

	// setting id
	public void setID(int id) {
		this._id = id;
	}

	// getting english
	public String getEnglish() {
		return this._English;
	}

	// setting english
	public void setEnglish(String english) {
		this._English = english;
	}

	// getting russian
	public String getRussian() {
		return this._Russian;
	}

	// setting russian
	public void setRussian(String russian) {
		this._Russian = russian;
	}

	// getting pronounce
	public String getPronounce() {
		return this._pronounce;
	}

	// setting pronounce
	public void setPronounce(String pronounce) {
		this._pronounce = pronounce;
	}
}