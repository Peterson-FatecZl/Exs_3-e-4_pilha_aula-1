package modelo;

public class PilhaStrings {

	NoString top;
	
	public PilhaStrings() {
		top = null;
	}
	
	public boolean isEmpty() {
		if(top == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push(String text) {
		NoString newValue = new NoString();
		newValue.dado = text;
		newValue.proximo = top;
		top = newValue;
		
	}
	
	public String pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Pilha Vazia");
		}else {
			String value = top.dado;
			top = top.proximo;
			return value; 
		}
	}
	
	public String top() throws Exception {
		if(isEmpty()) {
			throw new Exception("Pilha Vazia");
		}else {
			String value = top.dado;
			return value;
		}
	}
	
	public int size() {
		int cont = 0;
		if(!isEmpty()) {
			NoString aux = top;
			while(aux != null) {
				cont ++;
				aux = aux.proximo;
			}
		}
		return cont;
	}
	
}
