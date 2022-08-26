package CT;

import javax.swing.JOptionPane;

public class ConvertirTemp {

	public void ConvertirCAF(double valor) {
		double farenheit = valor * 1.8 + 32;

		farenheit = (double) Math.round(farenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, +valor + " Grados Celsius son " + farenheit + " Grados Farenheit");
		
	}

	public void ConvertirCAK(double valor) {
		double kelvin = valor + 273.15;

		kelvin = (double) Math.round(kelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, +valor + " Grados Celsius son " + kelvin + " Grados Kelvin");
		
	}

	public void ConvertirFAC(double valor) {
		double farenheitAC = (valor - 32) / 1.8;

		farenheitAC = (double) Math.round(farenheitAC * 100d) / 100;
		JOptionPane.showMessageDialog(null, +valor + " Grados Farenheit son " + farenheitAC + " Grados Celsius");
		
	}

	public void ConvertirKAC(double valor) {
		double kelvinAC = valor - 273.15;

		kelvinAC = (double) Math.round(kelvinAC * 100d) / 100;
		JOptionPane.showMessageDialog(null, +valor + " Grados Kelvin son " + kelvinAC + " Grados Celsius");
		
	}
	
	public void ConvertirKAF(double valor) {
		double kelvinAF = (valor - 273.15) * 9/5 + 32;

		kelvinAF = (double) Math.round(kelvinAF * 100d) / 100;
		JOptionPane.showMessageDialog(null, +valor + " Grados Kelvin son " + kelvinAF + "Grados Farenheit");
		
	}

	public void ConvertirFAK(double valor) {
		double farenheitAK = (valor - 32) * 5/9 + 273.15;

		farenheitAK = (double) Math.round(farenheitAK * 100d) / 100;
		JOptionPane.showMessageDialog(null, +valor + " Grados Farenheir son " + farenheitAK + "Grados Kelvin");
		
	}

}
