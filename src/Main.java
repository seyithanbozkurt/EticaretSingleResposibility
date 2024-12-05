//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Kullanici kullanici = new Kullanici();
        kullanici.setAd("gül");
        kullanici.setMail("gül57@gmail.com");
        System.out.println("   ");
        Adres adres= new Adres();
        adres.setUlke("Türkiye");
        adres.setIl("İstanbul");
        adres.setIlçe("Bağcılar");
        adres.setPostaKod(680800);

        System.out.println(kullanici.toString() + adres.toString());
/*
        kullanici.adresGuncelle(adres);

        System.out.println(kullanici.toString());

        adres.setPostaKod(806000);
        kullanici.adresGuncelle(adres);

        System.out.println(kullanici.toString());
*/
    }
}