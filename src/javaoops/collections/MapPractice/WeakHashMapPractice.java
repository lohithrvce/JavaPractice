package javaoops.collections.MapPractice;

import java.util.WeakHashMap;

public class WeakHashMapPractice {

	public static void main(String[] args) {
		
		
		WeakHashMap<Integer, String> whm = new WeakHashMap<Integer, String>();
		//Temp t = new Temp();
		whm.put(10, "lohith");
		
		System.out.println(whm);
		System.gc();
		System.out.println(whm);
		
	}
	
	public class Temp{
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		@Override
		protected void finalize() throws Throwable {
			// TODO Auto-generated method stub
			super.finalize();
		}
	}
}
