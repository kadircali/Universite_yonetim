
public class OgretimGorevlisi extends Kisi{

	
	
	private int verdigiDersSayisi;
	private String unvan;
	private String brans ;
	 final int MAX_DERS_SAYISI =3;
	
	public OgretimGorevlisi(String isim, String soyIsim, String tcNo, String eMail,int verdigiDersSayisi,String unvan,String brans) {
		super(isim, soyIsim, tcNo, eMail);
		if (verdigiDersSayisi > MAX_DERS_SAYISI) {
            System.out.println("Hata: Maksimum ders sayısına ulaşıldı. Ders sayısı " + MAX_DERS_SAYISI);
            this.verdigiDersSayisi = MAX_DERS_SAYISI;
        } else {
            this.verdigiDersSayisi = verdigiDersSayisi;
        }

        this.unvan = unvan;
        this.brans = brans;
	}
	
	
	
	
	
	
	
	
	
	public int getVerdigiDersSayisi() {
		return verdigiDersSayisi;
	}









	public void setVerdigiDersSayisi(int verdigiDersSayisi) {
		this.verdigiDersSayisi = verdigiDersSayisi;
	}









	public String getUnvan() {
		return unvan;
	}









	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}









	public String getBrans() {
		return brans;
	}









	public void setBrans(String brans) {
		this.brans = brans;
	}









	@Override
	public String bilgiGoster() {
		return "isim :"+this.getIsim()+" "+this.getSoyIsim()+" verdiği ders sayısı: "+this.getVerdigiDersSayisi()+" unvanı:"+this.getUnvan()+" branşı:"+this.getBrans();
	}

}
