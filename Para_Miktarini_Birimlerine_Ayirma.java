import java.util.Scanner;

//girilen para mikatarinda ne kadar" 1lira,50krs,25krs.10krs,5krs ve 1krs oldugunu gos123teren uygulama.
public class Para_Miktarini_Birimlerine_Ayirma {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Para Miktari >");
        double miktar = scn.nextDouble();

        int kalanmiktar = (int) (miktar * 100);
        int birlira = kalanmiktar / 100;
        System.out.println(birlira + " tane bir lira.");

        kalanmiktar %= 100;
        int ellikrs = kalanmiktar / 50;
        System.out.println(ellikrs + " tane elli krs.");

        kalanmiktar %= 25;
        int yirmibeskrs = kalanmiktar / 25;
        System.out.println(yirmibeskrs + " tane yirmi bes krs.");

        kalanmiktar %= 10;
        int onkrs = kalanmiktar / 10;
        System.out.println(onkrs + " tane on krs.");

        kalanmiktar %= 5;
        int beskrs = kalanmiktar / 5;
        System.out.println(beskrs + " tane bes krs.");

        int birkrs = kalanmiktar;
        System.out.println(birkrs + " tane bir krs.");
    }
}
