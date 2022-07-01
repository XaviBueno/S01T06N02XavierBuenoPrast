package ex02;

public class GenericMethods<T> {
	
	
	
	

	@SafeVarargs
	public static <T> void   llistaObjectes(T...obj) {
		Object  myObject;
		for(int i=0;i<obj.length;i++) {
			myObject=obj[i];
			System.out.println(myObject.toString()); 
		}
	
	}
}


