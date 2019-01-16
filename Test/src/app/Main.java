package app;

public class Main extends test{
	public static int GetInt() {
		return 2;
	}
	public static int GetInt(int a) {
		return a;
	}
	
	public static void main(String[] args) {
		
		Bean b= new Bean();
		b.setName("goodee");
		b.setA(6);
		b.setCheck(true);
		
		System.out.println(b.getName());
		System.out.println(b.getA());
		System.out.println(b.isCheck());
		
		System.out.println(b.toString());
		System.out.println(GetInt(4));
		test t = new test();
		t.SetString("하이요");
	}
}
