package Temel_Kavramlar;


import java.util.Scanner;
public class ifElseProje_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz: ");
		int sayi = scan.nextInt();
		
		if(sayi % 2 == 0) {
			System.out.println("Girilen sayı çifttir.");
		}
		else {
			System.out.println("Girilen sayı tektir.");
		}
scan.close();
	}

}
