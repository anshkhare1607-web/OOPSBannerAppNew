/**
*UC8: Feature/UC8-OOPS Banner Printing using HashMaps 
*@author Developer
*version 8.0
*/


import java.util.HashMap;

public class UC{
	public static HashMap<Character,String[]> createCharacterMap(){ //Method for creating a HashMap with all patterns of letters O,P,S.
		HashMap<Character, String[]> map = new HashMap<>();
		
		map.put('O', new String[]{ //Storing 'O' pattern as a value for key 'O'.
			"   ***   ",
		    " **   ** ",
			"**     **",
			"**     **",
			"**     **",
			" **   ** ",
			"   ***   "
		});
		
		map.put('P', new String[] { //Storing 'P' pattern as a value for key 'P'.
			"*******",
			"**    *",
			"**    *",
			"*******",
			"**     ",
			"**     ",
			"**     "
		});
		
		map.put('S', new String[] { //Storing 'P' pattern as a value for key 'P'.
			"******",
			"**   *",
			"***** ",
			" *****",
			"    **",
			"*    *",
			"******"
		});
		
		return map;
		
	}
	
	//Method for printing OOPS Banner. Storing the patterns line by line in  a stringbuilder and then printing it
	public static void displayBanner(String message, HashMap<Character, String[]> map){
		for(int i=0;i<7;i++){
			StringBuilder sb = new StringBuilder();
			for(char c:message.toCharArray()){
				//System.out.print(map.get(c)[i] + " ");
				String[] pattern = map.get(c);
				sb.append(pattern[i]).append(" ");
			}
			System.out.println(sb);
		}
	}
	
	public static void main(String[] args){
		HashMap<Character, String[]> map = createCharacterMap();
		String message = "OOPS";
		displayBanner(message, map);
	}
		
}

