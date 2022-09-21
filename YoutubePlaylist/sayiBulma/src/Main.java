public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 5;
        boolean sayiVarMi = false;

        for (int sayi : sayilar){
            if(sayi == aranacak) {
                sayiVarMi = true;
                break;
            }
        }

        if(sayiVarMi){
            System.out.println("Sayı bulundu");
        }else{
            System.out.println("Sayı bulunamadı");
        }

    }
}