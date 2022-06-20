package Solution;

import java.util.ArrayList;
import java.util.List;

public class SolutionString {

	public static void main(String[] args) {
		String myString= "asfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342r";
		List enterosList = new ArrayList(); 
		char[] stringEnt = myString.toCharArray();
		String n ="";
		
		for(int i=0; i < stringEnt.length; i++) {
			if(Character.isDigit(stringEnt[i])) {
				n+=stringEnt[i];
				enterosList.add(stringEnt[i]);
			}
			
		}
		System.out.println("Numero enteros: " + n);
		System.out.println(enterosList);
		
	}

}
