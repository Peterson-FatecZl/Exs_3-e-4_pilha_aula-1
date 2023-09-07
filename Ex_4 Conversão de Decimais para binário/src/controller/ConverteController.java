package controller;
import model.Pilhaint;

public class ConverteController {

	int valor;
	ConverteController proximo;

	public String decToBin(int decimal) throws Exception {

		StringBuilder binario = new StringBuilder();
		Pilhaint pilhaint = new Pilhaint();

		while (decimal >= 2) {
			int resto = decimal % 2;
			decimal /= 2;
			pilhaint.push(resto);
		}
		pilhaint.push(decimal);

		while (!pilhaint.isEmpty()) {
			binario.append(pilhaint.pop());
		}
		String bin = binario.toString();

		return bin;
	}

}