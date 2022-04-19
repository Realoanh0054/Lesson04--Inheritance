package advance;

public class GiaoVien extends ConNguoi {
	
	private float hsl;
	
	public GiaoVien(String name, int old, String city) {
		super(name, old, city);
		// TODO Auto-generated constructor stub
  	}
	
	public GiaoVien(String name, int old, String city,float hsl) {
		super(name, old, city);
		this.hsl = hsl;	
		// TODO Auto-generated constructor stub
	}

	public float getHsl() {
		return this.hsl;
	}

	public void setHsl(float hsl) {
		this.hsl = hsl;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return 	String.format("Ten:%s - Tuoi:%d - Diachi:%s - HSL:%0.2f", name, old, city, hsl);
	}

	
}