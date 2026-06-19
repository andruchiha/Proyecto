import java.io.*;

public class PruebaCiudadano {
	
	public static void main (String[] args) throws IOException{
		
		BufferedReader tec =
			new BufferedReader(new InputStreamReader(System.in));
		String colorPelo;
		String colorPiel;
		double altura;    //  Velocidad expresad en Mts
		double peso;	   //  Medidad en Kg
		Ciudadano c1, c2; 	
		
		System.out.print("Dame el Color del Pelo  ? ");
		colorPelo = tec.readLine();					
		System.out.print("Dame el Tono de Piel  ? ");
		colorPiel = tec.readLine();
		System.out.print("Dame Altura del Ciudadano en Mts ? ");
		altura = Double.parseDouble(tec.readLine());
		System.out.print("Dame Peso del Ciudadano en KG ? ");
		peso = Double.parseDouble(tec.readLine());
		c1	= new Ciudadano(colorPelo,colorPiel,altura,peso);
		c2 = new Ciudadano();
		
		System.out.println("Ciudadano 1 = "+c1.toString());
		System.out.println("Ciudadano 2 = "+c2.toString());
		c2.setColorPelo("Vinotinto");
		c2.setColorPiel("Moreno");	
		c2.setAltura(1.75);
		c2.setPeso(60);	
		System.out.println("Ciudadano 2 = "+c2.toString());
		c2.setPeso("65");
		c2.setAltura("1.72");
		System.out.println("Ciudadano 2 = "+c2.toString());
	}
}
