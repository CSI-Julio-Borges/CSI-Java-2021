package csi.borges.inheritance;

import javax.swing.ImageIcon;

public class Dog {
	String hair;
	int size;
	boolean wild = false;
	boolean gender= true; 
	private ImageIcon icon;

	
	
//	constructors

	
	public Dog(String hair, int size, boolean wild, boolean gender, String icon) {
		super();
		this.hair = hair;
		this.size = size;
		this.wild = wild;
		this.gender = gender;
		this.icon = new ImageIcon(getClass().getResource(icon));;
	}
	

	
	public Dog() {

	}
	
	
//	functions
	
	public void piss() { 
		if(gender==true) {
			System.out.println("raise leg");
		}
		System.out.println("Tsssss");
		
	}


	public Shit eat(Food f) {
		return f.digest();
	}

	public void die() {
	}
	public Noise bark() {
		return new Noise();
	}

	void wagTail() {
	}
	
	public void Die() {}

	public void mate(Dog D) {
	}
	
	
	
//	classes

	public class Shit {
		int smelly;
		int mushy; 
		int heavy; 
		
		
		public Shit() {
			Food f;
			return;
		}
		
	}

	public class Food {

		public Shit digest() {
			// TODO Auto-generated method stub
			return null;
	}
		

		public Food() {
			
		}
		
	}

	public class Noise{
		public Noise bark() {
			return new Noise();
		}
		
		
		
	}
}