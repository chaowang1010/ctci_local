// Assume you have a method isSubstring which checks if one word is a
// substring of another. Given two strings, s1 and s2, write code to check if s2 is
// a rotation of s1 using only one call to isSubstring (e.g.,"waterbottle"is a rotation
// of "erbottlewat").

//isSubstring is tricky 

public class Question1_8{
	public static boolean isSubstring(String big, String small) {
		if (big.indexOf(small) >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isRotation(String s1, String s2){
		int length1 = s1.length();
		int length2 = s2.length();
		if(length1 == length2 && length1 > 0){
			String temp = s1 + s1;
		return isSubstring(temp, s2);
		}else
		return false;
		
	}
	public static void main(String[] args) {
		String[][] pairs = {{"", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean is_rotation = isRotation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + is_rotation);
		}
	}
}