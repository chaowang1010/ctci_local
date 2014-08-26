//package Question1_3;

// Given two strings, write a method to decide if one is a permutation of the other.

public class Question1_3_1{	
	
	public static boolean isPermutation(String s, String t) {
		if (s.length() != t.length())
			return false;
		int[] count = new int[256];
		int n_unique = 0;
		int n_match = 0;
		char[] s_array = s.toCharArray();
		char[] t_array = t.toCharArray();
		//for (char c : s_array) { // count number of each char in s.
		for (int i = 0; i < s.length(); i++) {	
			if (count[s_array[i]] == 0)
				++n_unique;
			++count[s_array[i]];
		}
		for (int i = 0; i < t.length(); i++) {
			int c = (int) t.charAt(i);
			if (count[c] == 0) { // Found more of char c in t than in s.
				return false;
			}
			count[c]--;
			if (count[c] == 0) {
				n_match++;
				if (n_match == n_unique) {
					// itÕs a match if t has been processed completely
					return true;
					//return i == t.length() - 1;
				}
			}
		}
		return false;
	}	
	
	public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = isPermutation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
			System.out.println(isPermutation(word1, word2));
		}
	}
}
