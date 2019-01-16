package app;

public class Bean {
	int a;
	boolean check;
	String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public boolean isCheck() {
		return check;
	}
	@Override
	public String toString() {
		return "Bean [a=" + a + ", check=" + check + ", name=" + name + "]";
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
}
