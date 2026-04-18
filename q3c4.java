package prg3c;


	import java.util.Random;

	public class q3c4 {
	public static String generateRandomString(int length) {
	String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	String result = "";
	Random rand = new Random();

	for(int i = 0; i < length; i++) {
	result += chars.charAt(rand.nextInt(chars.length()));
	}
	return result;
	}

	public static void main(String[] args) {
	System.out.println("Random String: " + generateRandomString(8));
	}
	}

