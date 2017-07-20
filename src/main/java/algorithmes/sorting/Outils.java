/* Outils.java */
package algorithmes.sorting;

import java.io.*;

class Outils {
	public static int lire_int(String phrase) { 		
	// Lecture au clavier d'une variable de type Int
		int Var1=0;
		try {
			System.out.print(phrase);
			Reader reader=new InputStreamReader(System.in);
			BufferedReader Keyboard=new BufferedReader(reader);
			String Var=Keyboard.readLine();
			Var1=Integer.parseInt(Var);
			}
		catch(Exception exc) {
		}
		return Var1;
	}
	
	public static String lire_String(String phrase) {  
	// Lecture au clavier d'une variable de type String
		String Var="";
		try {
			System.out.print(phrase);
			Reader reader=new InputStreamReader(System.in);
			BufferedReader Keyboard=new BufferedReader(reader);
			Var=Keyboard.readLine();
			
			}
		catch(Exception exc) {
			}
		return Var;
	}
	
	public static float lire_float(String phrase) { 	
	// Lecture au clavier d'une variable de type float
		float Var1=0;
		try {
			System.out.print(phrase);
			Reader reader=new InputStreamReader(System.in);
			BufferedReader Keyboard=new BufferedReader(reader);
			String Var=Keyboard.readLine();
			Var1=Float.parseFloat(Var);
			}
		catch(Exception exc) {
		}
		return Var1;
	}
	
	public static double lire_double(String phrase) { 	
	// Lecture au clavier d'une variable de type double
		double Var1=0;
		try {
			System.out.print(phrase);
			Reader reader=new InputStreamReader(System.in);
			BufferedReader Keyboard=new BufferedReader(reader);
			String Var=Keyboard.readLine();
			Var1=Double.parseDouble(Var);
			}
		catch(Exception exc) {
		}
		return Var1;
	}
	
	public static char lire_char(String phrase) { 	
	// Lecture au clavier d'une variable de type char
		char Var1=' ';
		try {
			System.out.print(phrase);
			Reader reader=new InputStreamReader(System.in);
			BufferedReader Keyboard=new BufferedReader(reader);
			String Var=Keyboard.readLine();
			Var1=Var.charAt(0);
			}
		catch(Exception exc) {
		}
		return Var1;
	}
	
	public static void lire_vide(String phrase) { 	
	// Lecture vide (=attente d'une entrée quelconque)
		try {
			System.out.print(phrase);
			Reader reader=new InputStreamReader(System.in);
			BufferedReader Keyboard=new BufferedReader(reader);
			String Var=Keyboard.readLine();
			}
		catch(Exception exc) {
		}
	}		
	
}