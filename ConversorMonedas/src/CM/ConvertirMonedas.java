package CM;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	public void ConvertirPesosArgADolar(double valor) {
		double monedaDolar = valor / 137.15;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares Oficiales");
	}
	public void ConvertirPesosArgAEuro(double valor) {
		double monedaEuro = valor / 136.64;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
	}
	public void ConvertirPesosArgALibras(double valor) {
		double monedaLibras = valor / 162.10;
		monedaLibras = (double) Math.round(monedaLibras * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibras+ " Libras Esterlinas");
	}
	public void ConvertirPesosArgAYen(double valor) {
		double monedaYen = valor / 1.00;
		monedaYen = (double) Math.round(monedaYen * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Yenes");
	}
	public void ConvertirPesosArgAWon(double valor) {
		double monedaWon = valor / 0.10;
		monedaWon = (double) Math.round(monedaWon * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Won Sul");
	}
}
