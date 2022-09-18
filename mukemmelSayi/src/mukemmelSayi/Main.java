package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=28;
		int toplam=0;
		//bölenleri toplamı sayıya eşit olacak
		
		for(int i=1; i<number; i++) {
			if(number%i == 0) {
				toplam+=i;
			}
			
		}
		if(toplam==number) {
			System.out.println(number+" mükemmel sayıdır");
		}
		else {
			System.out.println(number+" mükemmel sayı değildir");
		}
	}

}
