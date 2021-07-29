package day11;

import java.util.Scanner;

//runtime polymorphism / dynamic binding
//which is achieved by overriding method


public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = null;
		
		System.out.println("Enter Choice");
		String key = new Scanner(System.in).next();
		
		//animal.makesSound();
		
		
		//animal.makesSound();

		switch (key) {
		case "dog": 
			animal = new Dog();
			break;
			
		case "tiger":
			animal = new Tiger();
			break;
		
		default:
			System.out.println("Wrong Selection");
		
	}
		if(animal != null) {
			animal.makesSound();
		}
	}
}
