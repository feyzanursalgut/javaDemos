package recapDemo1;

public class recapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi1=20;
		int sayi2=25;
		int sayi3=2;

		System.out.println(sayi1+sayi2+sayi3);

		if(sayi1 > sayi2 && sayi1>sayi3){
			System.out.println("En büyük sayı :"+sayi1);
		}
		else if(sayi2> sayi1 && sayi2 > sayi3){
			System.out.println("En büyük sayı :"+sayi2);
		}
		else
			System.out.println("En büyük sayı :"+sayi3);
		
	}

}
