// Write a method to replace all spaces in a string with'%20'. You may assume that
// the string has sufficient space at the end of the string to hold the additional
// characters, and that you are given the "true" length of the string. (Note: if implementing
// in Java, please use a character array so that you can perform this operation
// in place.)
// EXAMPLE
// Input: "Mr John Smith
// Output: "Mr%20Dohn%20Smith"

public class Question1_4{
	public static void  replaceSpace(char[] str, int length){
		int count = 0, end = length;
		for(int i=0;i<length;i++){
			if(str[i]==' ')
			count++; 
		}
		end = length + 2*count;
		str[end] = '\0';
		for(i=length-1;i>=0;i--){
			if(str[i]==' '){
				str[end-1] = '0';
				str[end-2] = '2';
				str[end-3] = '%';
				end = end - 3;
			}else{
			str[end-1] = str[i];
			end--;	
			}	
		}

	}
	public static void main(String[] args) {
		String str = "abc d e f";
		char[] arr = new char[str.length() + 3 * 2 + 1];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		replaceSpaces(arr, str.length());	
		System.out.println("\"" + AssortedMethods.charArrayToString(arr) + "\"");
	}
	
}