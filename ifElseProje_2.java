package Temel_Kavramlar;


import java.util.Scanner;
public class ifElseProje_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int not1, not2, ort;
		System.out.println("Birinci sınav notunuzu giriniz: ");
		not1 = scan.nextInt();
		
		System.out.println("İkinci sınav notunuzu giriniz: ");
		not2 = scan.nextInt();
		
		ort = (not1 + not2)/ 2;
		
		if(ort > 50) {
			System.out.println("Dersten geçtiniz.");
		}
		else {
			System.out.println("Dersten kaldınız.");
		}
scan.close();
	}

}
