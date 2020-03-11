package application;

import java.util.ArrayList;


public class Cards {
	private ArrayList<String> cards = new ArrayList<String>();

	public Cards(){
		//randomize these between red, blue, yellow, green
		cards.add("red");
		cards.add("blue");
		cards.add("yellow");
		cards.add("green");
		cards.add("green");
		cards.add("blue");
	}
	public String get(int index){
		return(cards.get(index));
	}
	public void add(){
		//randomize this
		cards.add("red");
	}
}
