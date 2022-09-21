package youtubelectures;

//Bir fonksiyon yaz - bool döndürsün - sayiBul
//İki parametre alsın. P1:dizi P2:3
//30 sayısı dizide yoktur
//3 sayısı dizide vardır

public class workshop1 {
	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,3,4,5,6,7,8,9,10};
		int aranacakSayi = 5;
		boolean sayiVarMi = false;
		
		sayiVarMi = sayiBul(sayilar, aranacakSayi);	
		mesajVer(sayiVarMi, aranacakSayi);
			
		
	}
	
	public static void mesajVer(boolean sayiVarMi, int bulunacakSayi) {
		if(sayiVarMi) {
			System.out.println(bulunacakSayi + " sayısı dizide vardır.");
		}else {
			System.out.println(bulunacakSayi + " sayısı dizide yoktur.");
		}
	}
	
	public static boolean sayiBul(int[] dizi, int bulunacakSayi) {
		for(int sayi : dizi) {
			if(sayi == bulunacakSayi) {
				return true;
			}
		}
		return false;
	}
}
