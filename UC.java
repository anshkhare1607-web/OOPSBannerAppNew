/**
*UC7: Feature/UC7-OOPS Banner Printing using Inner Classes and Static Classes 
*@author Developer
*version 7.0
*/


class UC{
	public static void main(String[] args){
		BannerApp.CharacterPatternMap charmap = new BannerApp.CharacterPatternMap();
		String[] getO = charmap.oPattern();
		String[] getP = charmap.pPattern();
		String[] getS  =charmap.sPattern();
		for(int i=0;i<getO.length;i++){
			System.out.println(getO[i]+" "+getO[i]+" "+getP[i]+" "+getS[i]);
		}
	}
}
class BannerApp{
	static class CharacterPatternMap{
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
		
	}
}


