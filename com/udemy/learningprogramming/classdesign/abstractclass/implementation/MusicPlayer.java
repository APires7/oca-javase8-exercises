package com.udemy.learningprogramming.classdesign.abstractclass.implementation;

public abstract class MusicPlayer {

//	abstract String version; // does not compile

//	public abstract String version() {
//		return "";
//	}

	public String returnVersion() {
		return "1.0";
	}

	public abstract void play();

	public abstract void pause();

	public abstract void stop();

	public void changeVolume() {
		// Implementation here
	}

//	public static abstract void play(); // static and abstract together, does not compile
//	public abstract void play() {} // does not compile

}
