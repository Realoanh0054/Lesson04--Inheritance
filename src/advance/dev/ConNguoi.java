package advance.dev;

public class ConNguoi {
	protected String name;
	protected int old;
	protected String city;
	
	public ConNguoi(String name, int old, String city) {
		this.name = name;
		this.old = old;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		this.old = old;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}