public class Personel extends Kisi {

    private int kidemYili;
    private String departman;
    private int mesaiSaati; // Çalışma saatleri
    final int MAX_MESAI = 8; // Maksimum mesai saati

    // Personel nesnesi oluşturulurken mesai saati de belirleniyor
    public Personel(String isim, String soyIsim, String tcNo, String eMail, int kidemYili, String departman, int mesaiSaati) {
        super(isim, soyIsim, tcNo, eMail);

        if (mesaiSaati > MAX_MESAI) {
            System.out.println("Hata: Maksimum mesai saati aşıldı. Mesai saati " + MAX_MESAI + " olarak ayarlandı.");
            this.mesaiSaati = MAX_MESAI; // Sınırı aşan saatler MAX_MESAI olarak ayarlanır
        } else {
            this.mesaiSaati = mesaiSaati;
        }

        this.kidemYili = kidemYili;
        this.departman = departman;
    }

    public int getKidemYili() {
        return kidemYili;
    }

    public void setKidemYili(int kidemYili) {
        this.kidemYili = kidemYili;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public int getMesaiSaati() {
        return mesaiSaati;
    }

    public void setMesaiSaati(int mesaiSaati) {
        if (mesaiSaati > MAX_MESAI) {
            System.out.println("Hata: Maksimum mesai saati aşıldı. Mesai saati " + MAX_MESAI + " olarak ayarlandı.");
            this.mesaiSaati = MAX_MESAI;
        } else {
            this.mesaiSaati = mesaiSaati;
        }
    }

    @Override
    public String bilgiGoster() {
        return "İsim: " + this.getIsim() + " " + this.getSoyIsim() +
               " Kıdem Yılı: " + this.getKidemYili() +
               " Departman: " + this.getDepartman() +
               " Mesai Saati: " + this.getMesaiSaati();
    }
    }