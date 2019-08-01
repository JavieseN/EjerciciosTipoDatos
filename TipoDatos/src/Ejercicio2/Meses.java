package Ejercicio2;

public class Meses {

	public static void main(String[] args) 
	{
		String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		for (int i = 0; i < meses.length; i++) 
		{
			System.out.println("El " + (i+1) + "º mes del año es " + meses[i]);
		}
	}

}
