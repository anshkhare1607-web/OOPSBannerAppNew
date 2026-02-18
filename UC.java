/**
*UC5: Feature/UC5-OOPS Banner Printing using Inline Array 
*@author Developer
*version 5.0
*/

public class UC{
	public static void main(String[] args){
		String[] arr  = {
			String.join("  ","   ***   ","   ***   ","*******","******"),
			String.join("  "," **   ** "," **   ** ","**    *","**    "),
			String.join("  ","**     **","**     **","**    *","***** "),
			String.join("  ","**     **","**     **","*******"," *****"),
			String.join("  ","**     **","**     **","**     ","    **"),
			String.join("  "," **   ** "," **   ** ","**     ","**   *"),
			String.join("  ","   ***   ","   ***   ","**     ","******"),
		}
		;
	
		
		for(String str : arr){
			System.out.println(str);
		}
	}
}