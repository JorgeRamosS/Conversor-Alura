package CM;

import javax.swing.JOptionPane;

public class ConvertirAPeso {
	public void ConvertirDolarAPesosArg(double valor) {
		double monedaDolar = valor * 137.15;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Argentinos");
	}
	public void ConvertirEuroAPesosArg(double valor) {
		double monedaEuro = valor * 136.64;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Argentinos");
	}
	public void ConvertirLibrasAPesosArg(double valor) {
		double monedaLibras = valor * 162.10;
		monedaLibras = (double) Math.round(monedaLibras * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibras+ " Pesos Argentinos");
	}
	public void ConvertirYenAPesosArg(double valor) {
		double monedaYen = valor * 1.00;
		monedaYen = (double) Math.round(monedaYen * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Argentinos");
	}
	public void ConvertirWonAPesosArg(double valor) {
		double monedaWon = valor * 0.10;
		monedaWon = (double) Math.round(monedaWon * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Argentinos");
	}

}
