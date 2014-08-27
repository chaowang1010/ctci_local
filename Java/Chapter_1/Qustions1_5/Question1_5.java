// Implement a method to perform basic string compression using the counts
// of repeated characters. For example, the string aabcccccaaa would become
// a2b1c5a3. If the "compressed" string would not become smaller than the original
// string, your method should return the original string.

public class Question1_5{
	public static void compressString(String str) {
		
	}
	public static void main(String[] args) {
		String str = "abbccccccde";
		int c = countCompression(str);
		String str2 = compressAlternate(str);
		String t = compressBetter("");
		System.out.println("Compression: " + t);
		System.out.println("Old String (len = " + str.length() + "): " + str);
		System.out.println("New String (len = " + str2.length() + "): " + str2);
		System.out.println("Potential Compression: " + c);
	}
}