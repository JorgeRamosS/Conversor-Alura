package CM;

import javax.swing.JOptionPane;

public class OpcionesConversion {
	ConvertirMonedas moneda = new ConvertirMonedas();
	ConvertirAPeso peso = new ConvertirAPeso();

	public void ConvertirMonedas(double valor) {
		String opcion = (JOptionPane.showInputDialog(null, "Elige la moneda a la que deseas convertir", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] { "De Peso Arg a Dolar", "De Peso Arg a Euro",
						"De Peso Arg a Libra Esterlina", "De Peso Arg a Yen Japones", "De Peso Arg a Won Sul Coreano",
						"De Dolar a Peso Arg", "De Euro a Peso Arg", "De Libra Esterlina a Peso Arg", "De Yen Japones a Peso Arg",
						"De Won Sul Coreano a Peso Arg"},
				"Seleccion")).toString();
		switch (opcion) {
		case "De Peso Arg a Dolar":
			moneda.ConvertirPesosArgADolar(valor);
			break;

		case "De Peso Arg a Euro":
			moneda.ConvertirPesosArgAEuro(valor);
			break;

		case "De Peso Arg a Libra Esterlina":
			moneda.ConvertirPesosArgALibras(valor);
			break;

		case "De Peso Arg a Yen Japones":
			moneda.ConvertirPesosArgAYen(valor);
			break;

		case "De Peso Arg a Won Sul Coreano":
			moneda.ConvertirPesosArgAWon(valor);
			break;
			
		case "De Dolar a Peso Arg":
			peso.ConvertirDolarAPesosArg(valor);
			break;

		case "De Euro a Peso Arg":
			peso.ConvertirEuroAPesosArg(valor);
			break;

		case "De Libra Esterlina a Peso Arg":
			peso.ConvertirLibrasAPesosArg(valor);
			break;

		case "De Yen Japones a Peso Arg":
			peso.ConvertirYenAPesosArg(valor);
			break;

		case "De Won Sul Coreano a Peso Arg":
			peso.ConvertirWonAPesosArg(valor);
			break;

		}

	}
}
