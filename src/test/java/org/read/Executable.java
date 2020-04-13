package org.read;

public class Executable extends Baseclass{

	public static void main(String[] args) {
		launch("https://www.facebook.com/");
		url();
		Login l = new Login();
		fill(l.getUser(),"greens@gmail.com");
		fill(l.getPass(),"123456");
		klik(l.getBtn().get(0));
		kill();
		
		
	}

}
