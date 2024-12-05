public class Adres {
    private String ulke;
    private String il;
    private String ilçe;
    private int PostaKod;

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlçe() {
        return ilçe;
    }

    public void setIlçe(String ilçe) {
        this.ilçe = ilçe;
    }

    public int getPostaKod() {
        return PostaKod;
    }

    public void setPostaKod(int postaKod) {
        PostaKod = postaKod;
    }

    public String toString(){
        return getUlke() + " " + getIl() + " " + getIlçe() + " " + getPostaKod();
    }
}

