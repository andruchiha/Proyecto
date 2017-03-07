import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class PaisesAmerica extends JApplet implements ActionListener {

    JButton	bn1, bn2, bn3, bn4,bn5, bn6, bn7, bn8,bn9, bn10;
	JPanel	A;
	JLabel DescripcionPaises,B,b;
	Icon icn1, icn2, icn3, icn4,icn5, icn6, icn7, icn8,icn9, icn10;
    Icon ibn1, ibn2, ibn3, ibn4,ibn5, ibn6, ibn7, ibn8,ibn9, ibn10;

	public PaisesAmerica(){
			DescripcionPaises  = 	new JLabel ("                      Paises America");
		b  = 	new JLabel ("                                         ");
		B  = 	new JLabel ("                           ");

		A	= new JPanel(new GridLayout(2,5,10,10));
		icn1	= new ImageIcon("argentina.gif");
		icn2	= new ImageIcon("bolivia.gif");
		icn3	= new ImageIcon("brasil.gif");
		icn4	= new ImageIcon("chile.gif");
		icn5	= new ImageIcon("colombia.gif");
		icn6	= new ImageIcon("ecuador.gif");
		icn7	= new ImageIcon("paraguay.gif");
		icn8	= new ImageIcon("peru.gif");
		icn9	= new ImageIcon("uruguay.gif");
		icn10   = new ImageIcon("venezuela.gif");

	    ibn1	= new ImageIcon("argentina.gif");
		ibn2	= new ImageIcon("bolivia.gif");
		ibn3	= new ImageIcon("brasil.gif");
		ibn4	= new ImageIcon("chile.gif");
		ibn5	= new ImageIcon("colombia.gif");
		ibn6	= new ImageIcon("ecuador.gif");
		ibn7	= new ImageIcon("paraguay.gif");
		ibn8	= new ImageIcon("peru.gif");
		ibn9    = new ImageIcon("uruguay.gif");
		ibn10   = new ImageIcon("venezuela.gif");



		bn1	= new JButton(icn1);
		bn2	= new JButton(icn2);
		bn3	= new JButton(icn3);
		bn4	= new JButton(icn4);
		bn5	= new JButton(icn5);
		bn6	= new JButton(icn6);
		bn7	= new JButton(icn7);
		bn8	= new JButton(icn8);
		bn9	= new JButton(icn9);
		bn10= new JButton(icn10);
		
		bn1.setBackground(Color.BLACK);
		bn2.setBackground(Color.WHITE);
		bn3.setBackground(Color.BLACK);
		bn4.setBackground(Color.WHITE);
		bn5.setBackground(Color.BLACK);
		bn6.setBackground(Color.WHITE);
		bn7.setBackground(Color.BLACK);
		bn8.setBackground(Color.WHITE);
		bn9.setBackground(Color.BLACK);
		bn10.setBackground(Color.WHITE);
		
		
        
		A.add(bn1);
		A.add(bn2);
		A.add(bn3);
		A.add(bn4);
		A.add(bn5);
		A.add(bn6);
		A.add(bn7);
		A.add(bn8);
		A.add(bn9);
		A.add(bn10);



		add(A);

		bn1.addActionListener(this);
		bn2.addActionListener(this);
		bn3.addActionListener(this);
		bn4.addActionListener(this);
		bn5.addActionListener(this);
		bn6.addActionListener(this);
		bn7.addActionListener(this);
		bn8.addActionListener(this);
		bn9.addActionListener(this);
		bn10.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae){

		String msg = "";

		if(ae.getSource() == bn1){
			 play ( getDocumentBase(), "argentina.wav");
			msg = "argentina \nArgentina, oficialmente Rep�blica Argentina.\nSu territorio est� dividido en 23 provincias y una ciudad aut�noma, Buenos Aires, capital de la naci�n y sede del gobierno federal, \nTotal Superficie:  2.780.4006 km� \nPoblaci�n total:  40.117.096 \nPresidente:  Cristina Fern�ndez de Kirchner";
					int valor = JOptionPane.showOptionDialog(null,msg,"argentina",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, ibn1, new Object[] { "Himno", "Cancelar" },null);
		do{
play ( getDocumentBase(), "argentina.wav");
valor = JOptionPane.showOptionDialog(null,msg,"argentina",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, ibn1, new Object[] { "Himno", "Cancelar" },null);
}while(valor==0);
}
		
		
		if(ae.getSource() == bn2){
			 play ( getDocumentBase(), "bolivia.wav");
			msg = "bolivia \nBolivia, oficialmente Estado Plurinacional de Bolivia, \nes un pa�s sin litoral mar�timo situado en el centro-oeste de Am�rica del Sur que cuenta con una poblaci�n de cerca de 10,5 millones de habitantes \nTotal Superficie:  1.098.581 km� \nPoblacion total:  10.426.160 \nPresidente:  Evo Morales Ayma";
					int valor = JOptionPane.showOptionDialog(null,msg,"bolivia",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, ibn2, new Object[] { "Himno", "Cancelar" },null);
do{
play ( getDocumentBase(), "bolivia.wav");
valor = JOptionPane.showOptionDialog(null,msg,"bolivia",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, ibn2, new Object[] { "Himno", "Cancelar" },null);
}while(valor==0);
}
		
		if(ae.getSource() == bn3){

	  play ( getDocumentBase(), "brasil.wav");

         	msg = "brasil \nBrasil, oficialmente Rep�blica Federativa do Brasil y poblaci�n, con m�s de 192 millones de habitantes. \nEs el mayor pa�s de Am�rica del Sur y el quinto mayor del mundo en �rea territorial \nTotal Superficie:  8.514.877 km� \nPoblacion Total:  192.376.496  \nPresidente:  Dilma Rousseff";
					int valor = JOptionPane.showOptionDialog(null,msg,"brasil",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, ibn3, new Object[] { "Himno", "Cancelar" },null);
do{
play ( getDocumentBase(), "brasil.wav");
valor = JOptionPane.showOptionDialog(null,msg,"brasil",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, ibn3, new Object[] { "Himno", "Cancelar" },null);
}while(valor==0);
}

		
		if(ae.getSource() == bn4){
			 play ( getDocumentBase(), "chile.wav");
			msg = "chile \nChile es un pa�s de Am�rica, ubicado en el extremo sudoeste de Am�rica del Sur. Su nombre oficial es Rep�blica de Chile \nTotal Superficie:  756.102,4 km�  \nPoblacion Total:  17.402.630   \nPresidente:  Sebasti�n Pi�era Echenique";
					int valor = JOptionPane.showOptionDialog(null,msg,"chile",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, ibn4, new Object[] { "Himno", "Cancelar" },null);
do{
play ( getDocumentBase(), "chile.wav");
valor = JOptionPane.showOptionDialog(null,msg,"chile",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, ibn4, new Object[] { "Himno", "Cancelar" },null);
}while(valor==0);
}
		
		if(ae.getSource() == bn5){

       play ( getDocumentBase(), "colombia.wav");
         	msg = "colombia \nColombia es un pa�s de Am�rica ubicado en la zona noroccidental de Am�rica del Sur, organizado constitucionalmente como una rep�blica unitaria descentralizada.\nTotal Superficie:  1.141.748 km� \nPoblacion Total:  46.581.823  \nPresidente:  Juan Manuel Santos Calder�n";
					int valor = JOptionPane.showOptionDialog(null,msg,"colombia",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, ibn5, new Object[] { "Himno", "Cancelar" },null);
do{
play ( getDocumentBase(), "colombia.wav");
valor = JOptionPane.showOptionDialog(null,msg,"colombia",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, ibn5, new Object[] { "Himno", "Cancelar" },null);
}while(valor==0);
}

		
           	if(ae.getSource() == bn6){

	  play ( getDocumentBase(), "ecuador.wav");

         	msg = "ecuador \nEcuador es un pa�s situado en la parte noroeste de Am�rica del Sur. \nDividido pol�tico-administrativamente en 7 regiones, 24 provincias, 226 cantones y 1.500 parroquias. \nTotal Superficie:  283.561 \nPoblacion Total:  14.483.499 \nPresidente:  Rafael Correa Delgado";
					int valor = JOptionPane.showOptionDialog(null,msg,"ecuador",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, ibn6, new Object[] { "Himno", "Cancelar" },null);
do{
play ( getDocumentBase(), "ecuador.wav");
valor = JOptionPane.showOptionDialog(null,msg,"ecuador",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, ibn6, new Object[] { "Himno", "Cancelar" },null);
}while(valor==0);
}

		
			if(ae.getSource() == bn7){

	  play ( getDocumentBase(), "paraguay.wav");

         	msg = "paraguay \nParaguay es un estado aconfesional, democr�tico y unitario, organizado en diecisiete gobernaciones o departamentos y una capital. \nTotal Superficie:  406.752 km�  \nPoblacion Total:  6.340.000  \nPresidente:  Federico Franco";
					int valor = JOptionPane.showOptionDialog(null,msg,"paraguay",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, ibn7, new Object[] { "Himno", "Cancelar" },null);
do{
play ( getDocumentBase(), "paraguay.wav");
valor = JOptionPane.showOptionDialog(null,msg,"paraguay",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, ibn7, new Object[] { "Himno", "Cancelar" },null);
}while(valor==0);
}

		
			if(ae.getSource() == bn8){

	  play ( getDocumentBase(), "peru.wav");

         	msg = "peru \nEl Per� (en quechua y en aimara: Piruw) �oficialmente, Rep�blica del Per� \n El Per� es uno de los pa�ses de mayor diversidad biol�gica en el mundo y de mayores recursos minerales. \nTotal Superficie:  1.285.216,20 km�  \nPoblacion Total:  30.165.000  \nPresidente: Ollanta Humala Tasso";
					int valor = JOptionPane.showOptionDialog(null,msg,"peru",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, ibn8, new Object[] { "Himno", "Cancelar" },null);
do{
play ( getDocumentBase(), "peru.wav");
valor = JOptionPane.showOptionDialog(null,msg,"peru",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, ibn8, new Object[] { "Himno", "Cancelar" },null);
}while(valor==0);
}

		
			if(ae.getSource() == bn9){

	  play ( getDocumentBase(), "uruguay.wav");

         	msg = "uruguay \nUruguay, oficialmente Rep�blica Oriental del Uruguay, es un pa�s de Am�rica del Sur, situado en la parte oriental del Cono Sur americano. \nTotal Superficie: 176.215 km�\nPoblacion Total: 3.251.526  \nPresidente:  Jos� Mujica";
					int valor = JOptionPane.showOptionDialog(null,msg,"uruguay",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, ibn9, new Object[] { "Himno", "Cancelar" },null);
do{
play ( getDocumentBase(), "uruguay.wav");
valor = JOptionPane.showOptionDialog(null,msg,"uruguay",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, ibn9, new Object[] { "Himno", "Cancelar" },null);
}while(valor==0);
}

		
			if(ae.getSource() == bn10){

	  play ( getDocumentBase(), "venezuela.wav");

         	msg = "venezuela \nVenezuela, oficialmente denominada Rep�blica Bolivariana de Venezuela, es un pa�s de Am�rica, \nsituado en la parte septentrional de Am�rica del Sur, constituido por una parte continental y por un gran n�mero de islas peque�as e islotes en el mar Caribe.  \nTotal Superficie:  916.445 km� \n Poblacion Total:  28.834.000  \nPresidente:  Hugo Ch�vez Fr�as";
					int valor = JOptionPane.showOptionDialog(null,msg,"venezuela",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, ibn10, new Object[] { "Himno", "Cancelar" },null);
do{
play ( getDocumentBase(), "venezuela.wav");
valor = JOptionPane.showOptionDialog(null,msg,"venezuela",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, ibn10, new Object[] { "Himno", "Cancelar" },null);
}while(valor==0);
}

		
	}

}