package pilha;

public class Pilha {
	private Object[] elementos;
	private int quantidade ;
	
	
	public Pilha(int maximo) {
		elementos = new Object[maximo];
	}


	public boolean estaVazia() {
		return quantidade == 0;
	}
	

	public int tamanho() {
		return quantidade;
	}
	

	public void empilha(Object elemento) {
		if(quantidade == elementos.length)
			throw new PilhaCheiaException("nao e possivel adicionar mais");
		this.elementos[quantidade] = elemento;
		quantidade++;
	}
	

	public Object topo() {
		if(estaVazia()) {
			throw new PilhaVaziaExcepction("A pilha está vazia.");
		}
		return elementos[quantidade - 1];
	}
	

	public Object desempilha() {
		Object topo = topo();
		quantidade--;
		return topo;
	}

}
