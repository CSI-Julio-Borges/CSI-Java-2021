package csi.borges.inheritance;

import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;

import csi.borges.inheritance.Boxer.Food;

public class Dog {
	String hair;
	int size;
	boolean smelly;
	boolean wild = false;
	boolean gender = true;
	ImageIcon icon;
	Point location;
	// int weight;

//	constructors

	public Dog(String hair, int size, boolean smelly, boolean wild, boolean gender, String icon) {
		super();
		this.hair = hair;
		this.smelly = smelly;
		this.size = size;
		this.wild = wild;
		this.gender = gender;
		this.icon = new ImageIcon(new ImageIcon(getClass().getResource(icon)).getImage().getScaledInstance(100, 100,
				java.awt.Image.SCALE_SMOOTH));
	}

	public Dog() {

	}

//	functions

	public void piss() {
		if (gender == true) {
			System.out.println("raise leg");
		}
		System.out.println("Tsssss");

	}

	public void chocolate() {

	}

	public void die() {

	}

	public void grow() {
	}

	void wagTail() {
	}

	public void mate(Dog D) {
	}

	public void digest() {

		return;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}
//	classes

	public class Shit {
		boolean smelly;
		// int weight;
		int size;
		String shape;
		private Food f;
		private ImageIcon icon;

		public Shit() {
			return;
		}

		public Shit(boolean smelly, int size, String shape) {
			super();
			this.smelly = true;
			// this.weight = weight;
			this.size = 30;
			this.shape = "short";
			this.icon = new ImageIcon(new ImageIcon(getClass().getResource("shit.png")).getImage().getScaledInstance(50,
					50, java.awt.Image.SCALE_SMOOTH));

		}

//		public Shit eat(Food f) {
//			if (f.ischocolate) {
//				Dog die;
//				return new Shit();
//			}
//
//		}

		public Noise bark(Noise n) {

			return new Noise(n.decibels, n.recurring);
		}
	}

	public class Noise {
		int decibels;
		boolean recurring;

		public Noise() {

		}

		public Noise(int decibels, boolean recurring) {
			super();
			this.decibels = decibels;
			this.recurring = recurring;
		}

		public class Food {
			private String chocolate;

			public Food(String flavor, String color, boolean humanFood, String chocolate) {
				super();
				this.flavor = flavor;
				this.color = color;
				this.humanFood = humanFood;
				this.chocolate = chocolate;
				this.icon = new ImageIcon(new ImageIcon(getClass().getResource("chocolate.png")).getImage()
						.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
			}

			String flavor;
			String color;
			boolean humanFood;
			private ImageIcon icon;

			public Food() {

			}

		}

		public Noise bark() {

			return new Noise();
		}

		public class chocolate extends Food {

		}

	}
}
