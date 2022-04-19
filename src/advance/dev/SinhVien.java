package advance.dev;

public class SinhVien  extends ConNguoi {
	
	private float dtb;
	
	public SinhVien(String name, int old , String city) {
		super(name, old, city);
		// TODO Auto-generated constructor stub
	}
	
	public SinhVien(String name, int old , String city, float dtb ) {
		super(name, old, city);
		this.dtb = dtb;	
	}

	public float getDtb() {
		return this.dtb;
	}

	public void setDtb(float dtb) {
		this.dtb = dtb;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return 	String.format("Ten:%s - Tuoi:%d - Diachi:%s - DiemTrungBinh:%0.2f", name, old, city, dtb);
	}

	
}