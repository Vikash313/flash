package practice;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insert the latitude of coordinate 1: ");
		double lat1 = input.nextDouble();
		System.out.println("Insert the longitude of coordinate 1: ");
		double long1 = input.nextDouble();
		System.out.println("Insert the latitude of coordinate 2: ");
		double lat2 = input.nextDouble();
		System.out.println("Insert the longitude of coordinate 1: ");
		double long2 = input.nextDouble();
		
		lat1 = Math.toRadians(lat1);
		long1 = Math.toRadians(long1);
		lat2 = Math.toRadians(lat2);
		long2 = Math.toRadians(long2);
		
		double earthRadius = 6371.01;
		
		double d = earthRadius*Math.acos((Math.sin(lat1)*Math.sin(lat2)) + (Math.cos(lat1)*Math.cos(lat2)*
				Math.cos(long1 - long2)));
		
		System.out.println("The distance between two point is: "+d);
          
	}

}
