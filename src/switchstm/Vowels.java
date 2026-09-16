package switchstm;

public class Vowels {
	
	public static void main(String[] args) {
		
		char ch = 'e';
		
		switch (ch) {
		case 'a' : System.out.println("a is a vowel");
		break;
		case 'e' : System.out.println("e is a vowel");
		break;
		case 'i' : System.out.println("i is a vowel");
		break;
		case 'o' : System.out.println("o is a vowel");
		break;
		case 'u' : System.out.println("u is a vowel");
		break;
		default : System.out.println(ch + " is a consonant");
		break;
		
		}
		
	}

}
