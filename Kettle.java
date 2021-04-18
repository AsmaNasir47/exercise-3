package KettleConstructor;

import java.util.*;

public class Kettle {
	
	String brand;
	String color;
	double weight;
	double price;
	
	Scanner s = new Scanner(System.in);
	
	Kettle(){
		System.out.println("Enter brand : ");
		this.brand = s.nextLine();
		s.nextLine();
		System.out.println("Enter color : ");
		this.brand = s.nextLine();
		s.nextLine();
		System.out.println("Enter weight : ");
		this.weight = s.nextDouble();
		s.nextLine();
		System.out.println("Enter price : ");
		this.price = s.nextDouble();
	}
	
	Kettle(String b, String c, double w, double p){
		this.brand=b;
		this.color=c;
		this.weight=w;
		this.price=p;
	}
}
