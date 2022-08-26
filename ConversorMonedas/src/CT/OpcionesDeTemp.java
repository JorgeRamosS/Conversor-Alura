package CT;

import javax.swing.JOptionPane;

public class OpcionesDeTemp {

	ConvertirTemp temperatura = new ConvertirTemp();

	public void ConvertirTemp(double valor) {
		String opcion = (JOptionPane.showInputDialog(null, "Elige una opcion a convertir", "Temperatura",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Grados Celsius a Farenheit", "Grados Celsius a Kelvin", "Grados Farenheit a Celsius",
						"Grados Kelvin a Celsius", "Grados Kelvin a Farenheit", "Grados Farenheit a Kelvin" },
				"Seleccion")).toString();

		switch (opcion) {
		case "Grados Celsius a Farenheit":
			temperatura.ConvertirCAF(valor);
			break;
		case "Grados Celsius a Kelvin":
			temperatura.ConvertirCAK(valor);
			break;
		case "Grados Farenheit a Celsius":
			temperatura.ConvertirFAC(valor);
			break;
		case "Grados Kelvin a Celsius":
			temperatura.ConvertirKAC(valor);
			break;
		case "Grados Kelvin a Farenheit":
			temperatura.ConvertirKAF(valor);
			break;
		case "Grados Farenheit a Kelvin":
			temperatura.ConvertirFAK(valor);
			break;
		}
	}
}
