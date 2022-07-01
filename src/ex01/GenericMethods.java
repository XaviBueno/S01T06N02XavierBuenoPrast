package ex01;

public class GenericMethods<T> {
	
	
	public static <T> void   llistaObjectes(T obj1, T obj2, int obj3) {
			
		System.out.println(obj1.toString()); 
		System.out.println(obj2.toString());
		System.out.println(obj3);
	}
}


