package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char harf='a';
		switch(harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'ı':
		case 'o':
		case 'u':
			System.out.println("girilen harf kalın seslidir");
			break;
		default:
			System.out.println("girilen harf ince seslidir.");
		}
	}

}
