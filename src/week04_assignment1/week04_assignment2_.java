package week04_assignment1;

import java.util.ArrayList;

public class week04_assignment2_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> names =  new ArrayList <> ();
		names.add("Sam");
		names.add("Tommy");
		names.add("Tim");
		names.add("Sally");
		names.add("Buck");
		names.add("Bob");
		
		int length = names.size();
		int sum = 0;
		String combine = "";
		
		for (int i = 0; i<length; i++) {
			sum = sum+names.get(i).length();
			combine = combine+names.get(i)+ " ";
		}

	float avg = (float)sum/length;
	System.out.println(avg);
	System.out.println(combine); 
	System.out.println(names.get(length-1));
	System.out.println(names.get(0));
	
	
	
	ArrayList <Integer> nameLengths = new ArrayList <> ();
	int nameLength = 0;
	
	for (int i=0; i<length; i++) {
		nameLength = names.get(i).length(); 
		nameLengths.add(nameLength);
		
	}
		System.out.println(nameLengths); 

		
		sum = 0;
		for (int i=0; i<length; i++) {
			sum = sum+nameLengths.get(i); 
			
		}
		System.out.println(sum);

		
	
		combination("basketball", 7);
		myName("Justin", "Williams");
		ArrayList <Integer> listOfNumbers = new ArrayList <> ();
		listOfNumbers.add(199);
		boolean result = additionList(listOfNumbers);
		System.out.println(result);
		
	}
	
	public static void combination (String words, int numbers) {
		
		String concat = "";
		for (int i=0; i<numbers; i++) {
			concat = concat+words; 
			
			
		}
		System.out.println(concat); 
		
		
	}
		
	public static void myName (String firstName, String lastName) {
		
		System.out.println(firstName + " " + lastName); 
		
		
	}

	public static boolean additionList (ArrayList <Integer> numbers ) {
		int sum = 0;
		int length = numbers.size();
		for (int i = 0; i<length; i++) {
			sum = sum+numbers.get(i);
		}
		
		
		if (sum > 100) {
			//System.out.println(true); 
			return true;
		} else
		{
			//System.out.println(false);
			return false;
		}
	}
	
}