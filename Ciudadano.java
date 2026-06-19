
public class Ciudadano {
	
	private String colorPelo;
	private String colorPiel;
	private double altura;    //  Altura expresad en Mts
	private double peso;	   //  Medidad en Kg
	
	public Ciudadano(){
		
		colorPelo 	= "";			
		colorPiel 	= new String();	
		altura = 0.0;
		peso 	= 0.0;
	}
	
	public Ciudadano(String colorPelo, String colorPiel, double altura, double peso){
						
		this.colorPelo 		= colorPelo;					
		this.colorPiel 		= colorPiel;
		this.altura 		= altura;
		this.peso 			= peso;					
		
	}
	
	public void setColorPelo(String colorPelo){ 
		
		this.colorPelo = colorPelo;
	}
	
	public void setColorPiel(String colorPiel){ 
		
		this.colorPiel = colorPiel;
	}
	
	public void setAltura(double altura){ 
		
		this.altura = altura;
	}
	
	public void setAltura(String altura){ 
		
		this.altura = Double.parseDouble(altura);
	}
	
	public void setPeso(double peso){ 
		
		this.peso = peso;
		
	}
	
	public void setPeso(String peso){ 
		
		this.peso = Double.parseDouble(peso);
	}
	
	public String getColorPelo(){ 
		
		return colorPelo;
	}
	
	public String getColorPiel(){ 
		
		return colorPiel;
		
	}
	
	public double getAltura(){ 
		
		return altura;
	}
	
	public double getPeso(){ 
		
		return peso;
	}
	
	public String toString(){  
		
		return "Color de Pelo = "+getColorPelo()+"  Color de Piel = "+getColorPiel()+
			"  Altura del Ciudadano = " + getAltura()+" Mts"+
			"  Peso del Ciudadano = " + getPeso()+" Kg";	
	}
}