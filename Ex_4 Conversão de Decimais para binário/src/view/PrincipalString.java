package view;

import modelo.PilhaStrings;

public class PrincipalString {

	public static void main(String[] args) {
		PilhaStrings pilhaStrings = new PilhaStrings();
		
		String pilhaDeString = "";
		pilhaStrings.push("Z.");
		pilhaStrings.push("Y, ");
		pilhaStrings.push("X, ");
		pilhaStrings.push("W, ");
		pilhaStrings.push("V, ");
	
		while(!pilhaStrings.isEmpty()) {
			try {
				pilhaDeString += pilhaStrings.pop();
			} catch (Exception e) {
				System.err.println(e);
			}
		}
		
		System.out.println(pilhaDeString);
	
	
	}

}
