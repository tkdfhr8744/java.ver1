package app;

public class test implements testinterface{
	public static int GetInt() {
		return 1;
	}

	@Override
	public void SetString(String a) {
		System.out.println(a);
	}
}
