package view;

import controller.ConverteController;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		ConverteController converteController = new ConverteController();

		int number = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Insira o valor decimal Desejado (Limitado a 1000,00)", "Entrada de Valor", -1));
		String binario = null;
		

		try {
			binario = converteController.decToBin(number);

		} catch (Exception e) {
			System.err.println(e);

		}
		System.out.println(binario);

	}

}

