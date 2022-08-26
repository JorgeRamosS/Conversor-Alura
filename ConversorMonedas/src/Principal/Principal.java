package Principal;

import javax.swing.*;

import CM.OpcionesConversion;
import CT.OpcionesDeTemp;

public class Principal {

	public static void main(String[] args) {

		OpcionesConversion conversion = new OpcionesConversion();
		OpcionesDeTemp temperatura = new OpcionesDeTemp();

		while (true) {
			String opciones = JOptionPane
					.showInputDialog(null, "Seleccione una opcion de conversion", "Menu", JOptionPane.PLAIN_MESSAGE,
							null, new Object[] { "Conversor de Moneda", "Conversor de Temperatura" }, "Elegir")
					.toString();

			switch (opciones) {
			case "Conversor de Moneda":
				String input = JOptionPane.showInputDialog(null, "Ingrese un valor");
				if (ValidarNumero(input) == true) {
					double valorRecibido = Double.parseDouble(input);
					conversion.ConvertirMonedas(valorRecibido);

					int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opcion Afirmativa");
					} else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
						System.exit(0);
					}

					break;
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;
			case "Conversor de Temperatura":
				input = JOptionPane.showInputDialog(null, "Ingrese un valor");
				if (ValidarNumero(input) == true) {
					double valorRecibido = Double.parseDouble(input);
					temperatura.ConvertirTemp(valorRecibido);
					int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opcion Afirmativa");
					} else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
						System.exit(0);
					}

					break;
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;

			}
		}

	}

	

	public static boolean ValidarNumero(String opciones) {
		try {
			double x = Double.parseDouble(opciones);
			if (x >= 0 || x < 0)
				;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
