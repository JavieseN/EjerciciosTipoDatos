import java.util.Calendar;

public class Aplicacion {
	
	public static void main(String[] args) 
	{
		Clase clase = new Clase();
		Calendar calendar = Calendar.getInstance();
		System.out.println(clase.sayHello() + " " + args[0] + ", " + calendar.getTime());
	}
}
