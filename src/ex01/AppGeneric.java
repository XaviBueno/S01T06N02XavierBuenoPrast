package ex01;

public class AppGeneric {

	public static void main(String[] args) {
		
		Persona persona1=new Persona("Josep","Garcia", 30);
		GenericMethods.llistaObjectes(persona1,"Hola",3);
		Persona persona2=new Persona("Ana","Martinez", 17);
		GenericMethods.llistaObjectes("Casa", persona2,10);
	}
	
}
