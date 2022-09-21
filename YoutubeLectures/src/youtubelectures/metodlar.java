package youtubelectures;

public class metodlar {

public static void main(String[] args) {
		
		mesajVer("Cahit");
		
		hesapla();
		
		System.out.println("Toplam: " + topla(6,3)); 
		
		System.out.println(toplananIkiSayininYuzdeOnu(20,30)); 
				
	}
	
	public static void mesajVer(String isim) {
		System.out.println("Merhaba " + isim);
		//10'larca satır olduğunu düşün
	}
	
	public static void hesapla() {
		System.out.println("Hesaplandı");
		//10'larca satır olduğunu düşün
	}
	
	public static int topla(int sayi1, int sayi2) {
		int toplam = sayi1 + sayi2;
		return toplam;
	}
	
	//toplanan iki sayinin %10'unu bul
	public static double toplananIkiSayininYuzdeOnu(int sayi1, int sayi2) {
		int toplam = topla(sayi1, sayi2);
		return toplam * 10/100;
	}
	
	public static double krediHesapla(double krediMiktari) {
		//hesaplar yapılır
		return 125000;
	}
	
}
