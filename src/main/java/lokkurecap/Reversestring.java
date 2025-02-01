package lokkurecap;

public class Reversestring {
	    public static void main(String[] args) {
	      
	        String s = "Geeks"; 
	        String r = "";
	        char ch;

	        for (int i = 0; i < s.length(); i++) {
	              
	              // extracts each character
	            ch = s.charAt(i);
	          
	              // adds each character in
	            // front of the existing string
	            r = ch + r; 
	        }
	      
	        System.out.println(r);
	    }
	}


