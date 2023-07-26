
import java.util.*;
public class Carreras {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner (System.in);
	int autos, tiempo, vueltas ;
	float velocidad, promedio;
	
		System.out.println("*GRAN COMPETENCIA DE AUTOS*");
		System.out.println("---Registro de los autos---");
		System.out.println("Ingrese la cantidad de carros: ");
		autos =scanner.nextInt();
	
	for(int a=0;a<autos ; a++) {
		System.out.print("¿Cuantas vueltas dio el carro? "+autos);
		vueltas=scanner.nextInt();
		
		for (int i=0;i<vueltas;i++);
		System.out.println("¿A que velocidad dio la vuelta "+vueltas+ " en KM/H?");
		velocidad=scanner.nextInt();
		
		promedio=vueltas/velocidad;
		
		System.out.println("El Auto"+ autos+ " iba a "+ promedio+ " KM/H en promedio.");
		}
	}	
}
