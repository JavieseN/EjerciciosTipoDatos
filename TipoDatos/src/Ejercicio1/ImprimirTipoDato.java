package Ejercicio1;

public class ImprimirTipoDato {

	public static void main(String[] args) 
	{
		TipoDatos dato1 = new TipoDatos();
		TipoDatos dato2 = new TipoDatos("Javier","Sirvent Navarro",17,6,1998,"Petrer",21,true,false,'H');
		//System.out.println(dato1);
		TipoDatos[] datos = new TipoDatos[2];
		datos[0] = dato1;
		datos[1] = dato2;
		imprimirTodos(datos);
	}
	
	public static void imprimirTodos(TipoDatos[] datos)
	{
		TipoDatos d1 = datos[0];
		TipoDatos d2 = datos[1];
		
		System.out.println(d1.toString());
		System.out.println(d2.toString());
	}
}
// Hola me llamo {Nombre} {Apellidos} y tengo {Edad} años.
//Nací el {fecha de nacimiento} y vivo en {Ciudad}