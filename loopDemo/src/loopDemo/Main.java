package loopDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( int i=1;i<=10;i+=2) {
			System.out.println(i);
		}
		System.out.println("for döngüsü bitti");
		//while
		
		int i=1;
		while(i<10)
		{
			System.out.println(i);
			i++;
		}
		System.out.println("while döngüsü bitti");
		
		//do-while
		
		int j=100;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10) ;
			System.out.println("do-while döngüsü bitti");
		
		
	}

}
