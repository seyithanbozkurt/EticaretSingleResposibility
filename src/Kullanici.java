public class Kullanici {
    private String ad;
    private String mail;
    private Adres adres;

    public String getAd(){
        return ad;
    }

    public void setAd(String ad){
        this.ad=ad;
    }

    public String getMail(){
        return mail;
    }

    public void setMail(String mail){
        this.mail=mail;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public String adresGuncelle(Adres adres){
        return adres.getUlke()+ " " + adres.getIl()+ " " + adres.getIlçe() + " " + adres.getIlçe() + " " + adres.getPostaKod();
    }

    public void girisYap(String ad, String mail){
        System.out.println("Giris Yapıldı.");
    }

    public String toString(){
        return getAd() + " " + getMail();
    }
}
