package EjercicioTablero;

public class Tablero {

	public static void main(String[] args) 
	{
		int x = 5;
		int y = 4;
		
		generarTablero(x,y);
	}
	
	public static void generarTablero(int x, int y)
	{
		String[][] tablero = new String[x][y];
		for (int i = 0; i < x; i++) 
		{
			for (int j = 0; j < y; j++) 
			{
				tablero[i][j] = "A"; /*String.valueOf(i)+","+String.valueOf(j)*/;
			}
		}

		for (int i = 0; i < x; i++) 
		{
			for (int j = 0; j < y; j++) 
			{
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}
	}	
}
