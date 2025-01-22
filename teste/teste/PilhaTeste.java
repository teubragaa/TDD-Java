package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pilha.Pilha;

import pilha.PilhaVaziaExcepction;

class PilhaTeste {
	private Pilha p;
	
	
	@BeforeEach
	public void Inicializar() {
		p = new Pilha(10);
	}
	
	@Test
	public void pilhaVazia() {
		
		assertTrue(p.estaVazia());
		assertEquals(0, p.tamanho());
	}
	
	@Test
	public void EmpilhaUmElemento() {
		p.empilha("primeiro");
		assertFalse(p.estaVazia());
		assertEquals(1, p.tamanho());
		assertEquals("primeiro", p.topo());
	}
	
	@Test
	public void EmpilharEDesempilhaUm() {
		p.empilha("primeiro");
		p.empilha("segundo");
		assertFalse(p.estaVazia());
		assertEquals(2, p.tamanho());
		assertEquals("segundo", p.topo());
		
		Object desempilhado = p.desempilha();		
		
		assertEquals(1, p.tamanho());
		assertEquals("primeiro", p.topo());
		assertEquals("segundo", desempilhado);
	}
	
	@Test
	public void RemoveDaPilhaVazia(){
		assertThrows(PilhaVaziaExcepction.class, () -> {
		    p.desempilha();
		});
	}
	
}
