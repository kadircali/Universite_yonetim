public class Ogrenci extends Kisi {

    private int sinif;
    private int ogrenciNo;
    final int MAX_OGRENCI_SAYISI =3;
    private static int count = 0;  // Statik sayaç

    public Ogrenci(String isim, String soyIsim, String tcNo, String eMail, int sinif, int no) {
        super(isim, soyIsim, tcNo, eMail);

        if (count >= MAX_OGRENCI_SAYISI) {
            throw new RuntimeException("Maximum öğrenci sayısına ulaşıldı. Yeni öğrenci oluşturulamaz.");
        }

        this.sinif = sinif;
        this.ogrenciNo = no;
        count++;  
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String bilgiGoster() {
        return "İsim: " + this.getIsim() + " " + this.getSoyIsim() + " Numara: " + this.getOgrenciNo() + " Sınıf: " + this.getSinif();
    }
}