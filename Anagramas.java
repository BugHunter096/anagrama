package ejercicio;

import java.util.Arrays;
import java.util.Scanner;


/*
 * Programa que comprueba si las palabras itroducidas por el usuario son anagramas o no.
 * 
 * Un anagrama es una palabra o frase que se forma reordenando todas las letras de otra palabra o frase, 
 * usando todas las letras exactamente una vez.
 * En otras palabras: si puedes tomar las letras de una palabra y 
 * reorganizarlas para formar otra palabra válida, esas dos palabras son anagramas.
 */

public class Anagramas {
		
		public static boolean sonAnagramas(String texto1, String texto2) {
			
			String texto01 = texto1.toLowerCase().replaceAll("\\s", "");
			String texto02 = texto2.toLowerCase().replaceAll("\\s", "");
			
			
			//-----Comprobamos que las palabras no son iguales y que tienen la misma longitud
			if(texto01.equals(texto02)){
				System.out.println("Palabras son iguales");
				return false;
				}
			
			if(texto01.length() != texto02.length()) {
				System.out.println("Las palabras tienen diferente longitud");
				return false;
			}
			
			//----Convertimos las palabras en arrays--------
			char[] texto1Array = texto01.toCharArray();
			char[] texto2Array = texto02.toCharArray();

			//Ordenamos alfabeticamente los caracteres con .sort().
			Arrays.sort(texto1Array);
			Arrays.sort(texto2Array);
			
			//comprobamos si los caracteres son iguales.
			return Arrays.equals(texto1Array, texto2Array);
			
			
		}
		
		public static void main(String[] args) {
			
			
			//Pedimos al usuario las palabras a comprobar.
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Dime la primera palabra: ");
			String texto1 = sc.nextLine();
			System.out.println();
			System.out.print("Dime la segunda palabra: ");
			String texto2 = sc.nextLine();
			
			if (sonAnagramas(texto1, texto2)) {
				System.out.println("Las palabras son anagramas");
			}else {
				System.out.println("Las palabras no son anagramas");
			}
			
		}

	}




