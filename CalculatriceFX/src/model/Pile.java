package model;

import java.util.Stack;

public class Pile extends Stack<Double>{
	
	public Pile() {
		super();
	}
	
	@Override
	public String toString() {
		String text = "";
		for(Double x : this) {
			text += x.toString() + "\n";
		}
		return text;
	}

}
