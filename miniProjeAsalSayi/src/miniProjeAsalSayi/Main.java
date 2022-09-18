package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sayi=2;
		int remainder=sayi%2;
		
		//System.out.println(remainder);
		boolean isPrime=true;
		if(sayi==1) {
			System.out.println("asal değildir");
			return;
		}
		
		if(sayi<2) {
			System.out.println("geçersiz sayı");
			return;
		}
		for(int i=2; i<sayi;i++) {
			if(sayi%i==0) {
				isPrime=false;
			}	
			
		}
		
		if(isPrime) {
			System.out.println("asaldır");
		}else {
			System.out.println("asal değildir");
		}
	}

}
