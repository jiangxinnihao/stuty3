import java.lang.reflect.Field;


public class Test {
	public static void main(String[] args) {
		try {
			Reflat rel = new Reflat();
			rel.setA(10);
			rel.setB(20);
			Field field = Reflat.class.getDeclaredField("a");
			field.setAccessible(true);
		int tt=	field.getInt(rel);
		System.out.println(tt);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static class   Reflat{
		private int a;
		private int b;
		public void setA(int a){
			this.a = a;
		
		}
		public void setB(int b){
			this.b = b;
		}
		public void Reflat(){}
	}
}
