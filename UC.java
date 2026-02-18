
/**
*UC6: Feature/UC6-OOPS Banner Printing using methods 
*@author Developer
*version 6.0
*/

public class UC{
	
	public static String[] oPattern(){ //TO print the O letter
		return new String[] {
			"   ***   ",
			" **   ** ",
			"**     **",
			"**     **",
			"**     **",
			" **   ** ",
			"   ***   "
		};
	}
	
	public static String[] sPattern(){ //TO print the S letter
		return new String[] {
			"******",
			"**    ",
			"***** ",
			" *****",
			"    **",
			"**   *",
			"******"
		};
	}
	
	public static String[] pPattern(){ // To print the P letter
		return new String[] {
			"*******",
			"**    *",
			"**    *",
			"*******",
			"**     ",
			"**     ",
			"**     "
		};
	}
	public static void main(String[] args){
	
		String[] getO = oPattern();
		String[] getP = pPattern();
		String[] getS = sPattern();
		for(int i=0;i<getO.length;i++){
			System.out.println(getO[i]+" "+getO[i]+" "+getP[i]+" "+getS[i]);
		}
	}
}