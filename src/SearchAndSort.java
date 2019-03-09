import java.util.ArrayList;
import java.util.Scanner;
public class SearchAndSort {
	
	/**
	 * Program execution starts here.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What algorithm would you like to execute?");
		String algorithm = in.nextLine(); //bubble, selection, insertion, merge, linear, binary, quit
		System.out.println("What type of data?");
		String type = in.nextLine(); //integer, strings
		System.out.println("How is it stored?");
		String store = in.nextLine(); //array, list
		System.out.println("Enter the data:");
		String data = in.nextLine(); //data seperated by commas
		int arrlength = data.length()/2 +1;
		int length = data.length();
		boolean valid = true;
		if(type.equals("integer")) {			 //if type integer
			for(int x = 0; x<length; x++) { 			//check input is valid
				if(!(data.charAt(x) >=0 && data.charAt(x)<= 9)
						|| (data.charAt(x) != ',')){
					valid = false;
				}
			}
			if(valid == true) { 	//if valid...
				if(store.equals("array")) {
					
				}
				else if(store)
				switch (store){				
				case "array": 				//make an array
					int[] arr = new int [arrlength];
					int i = 0;
					for(int y = 0; y<arrlength; y=y++) {
						arr[i] = data.charAt(y);
					}
					break;
					
				case "list": 				//make an list
					ArrayList<Integer> list = new ArrayList<Integer>();
					for(int y = 0; y<arrlength; y=y+2) {							
						list.add((int)data.charAt(y));
					}
					break;
				}
			}
		}
		if(type.equals("strings")) {
			String term = "";
			switch (store){				
				case "array": 				//make an array
					int count = 0;
					for(int x = 1;x<length-1;x++) {
						if(data.charAt(x)==',' && data.charAt(x-1)!=',') {
							count++;
						}
					}
					String[] arr = new String[count];
					int i = 0;
					for(int x = 0; x<length; x++) {
						if(x != 0) {
							if(data.charAt(x)==',' && data.charAt(x-1)!=',') {
								arr[i] = term;
								term = "";
								i++;
							}
						}
						else {
							term += data.charAt(x);
						}
					}
					break;
				
				case "list": 				//make an list
					ArrayList<String> list = new ArrayList<String>();
					
					break;
			}
		}
	}
}