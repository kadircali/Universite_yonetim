
public abstract class Kisi {
	private String isim ;
	private String soyIsim ;
	private String tcNo;
	private String eMail ;
	public static int kisiSayisi = 0 ;
	
	
	
	//constructor
	public Kisi(String isim, String soyIsim, String tcNo, String eMail) {
		super();
		this.isim = isim;
		this.soyIsim = soyIsim;
		this.tcNo = tcNo;
		this.eMail = eMail;
		kisiSayisi++;
	}
	
	
	
	//getter setter
	public String getIsim() {
		return isim;
	}




	public void setIsim(String isim) {
		this.isim = isim;
	}




	public String getSoyIsim() {
		return soyIsim;
	}




	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}




	public String getTcNo() {
		return tcNo;
	}




	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}




	public String geteMail() {
		return eMail;
	}




	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


	//methods
	public abstract String bilgiGoster() ;

	
	
	

}
