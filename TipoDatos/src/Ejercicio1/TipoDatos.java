package Ejercicio1;

public class TipoDatos 
{
	private String nombre = "Pepito";
	private String apellidos = "Lillo Perez";
	private int diaNacimiento = 14;
	private int mesNacimiento = 9;
	private int anyNacimiento = 1996;
	private String ciudad = "Alicante";
	private int edad = 23;
	private boolean estudiar = true;
	private boolean trabajar = false;
	private char hm = 'H';
	
	
	
	public TipoDatos() {
		super();
	}
	public TipoDatos(String nombre, String apellidos, int diaNacimiento, int mesNacimiento, int anyNacimiento,
			String ciudad, int edad, boolean estudiar, boolean trabajar, char hm) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.diaNacimiento = diaNacimiento;
		this.mesNacimiento = mesNacimiento;
		this.anyNacimiento = anyNacimiento;
		this.ciudad = ciudad;
		this.edad = edad;
		this.estudiar = estudiar;
		this.trabajar = trabajar;
		this.hm = hm;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getDiaNacimiento() {
		return diaNacimiento;
	}
	public void setDiaNacimiento(int diaNacimiento) {
		this.diaNacimiento = diaNacimiento;
	}
	public int getMesNacimiento() {
		return mesNacimiento;
	}
	public void setMesNacimiento(int mesNacimiento) {
		this.mesNacimiento = mesNacimiento;
	}
	public int getAnyNacimiento() {
		return anyNacimiento;
	}
	public void setAnyNacimiento(int anyNacimiento) {
		this.anyNacimiento = anyNacimiento;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isEstudiar() {
		return estudiar;
	}
	public void setEstudiar(boolean estudiar) {
		this.estudiar = estudiar;
	}
	public boolean isTrabajar() {
		return trabajar;
	}
	public void setTrabajar(boolean trabajar) {
		this.trabajar = trabajar;
	}
	public char getHm() {
		return hm;
	}
	public void setHm(char hm) {
		this.hm = hm;
	}
	@Override
	public String toString() {
		return "Hola me llamo " + getNombre() + " " + getApellidos() + " y tengo " + getEdad() + " años.\n" + "Nací el " + getDiaNacimiento() + "/" + getMesNacimiento() + "/" + getAnyNacimiento() + " y vivo en " + getCiudad() + ".";
	}
	
	
	
}