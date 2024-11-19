package app;

import exceptions.ComprimentoSequenciaInvalidoException;
import exceptions.ComprimentosSequenciasDiferentesException;
import exceptions.ElementoInexistenteException;

public class Fibonacci {

	public static final float PHI = 1.618f; 
	
	private int[] sequencia;
	private final int n; 
	

	/**
	 * Construtor de uma Sequencia de Fibonacci de um determinado tamanho
	 * @param tam tamanho da Sequencia de Fibonacci
	 */
	public Fibonacci(int tam) {
		if (tam <=2 ) {
			throw new ComprimentoSequenciaInvalidoException(tam); 
		}
		
		n = tam;
		this.sequencia = new int[n];
		sequencia[0] = 1;
		sequencia[1] = 1;
		for (int i=2; i<sequencia.length; i++) {
			sequencia[i] = sequencia[i-1] + sequencia[i-2];
		}
	}

	/**
	 * Retorna a sequencia de Fibonacci
	 * @return vetor com a sequencia de Fibonacci
	 */
	public int[] getSequencia() {
		return sequencia;
	}

	
	/**
	 * Compara um determinado vetor com a Sequencia de Fibonacci. 
	 * Caso os elementos correspondentes do vetor e da sequencia sejam iguais, 
	 * o valor no vetor de resposta é igual a 0, caso contrário, assume o valor 1.
	 * @param vet vetor que vai ser comparado à Sequencia de Fibonacci
	 * @return vetor de resposta, formado por 1s e 0s.
	 */
	public int[] comparar(int[] vet) {
		if (sequencia.length != vet.length) {
			throw new ComprimentosSequenciasDiferentesException(sequencia.length, vet.length);
		}
		
		int resposta[] = new int[n];
		for (int i=0; i<n; i++) {
			resposta[i] = (sequencia[i] == vet[i] ? 0 : 1);
		}
		
		return resposta;
	}


	/**
	 * Realiza a divisao entre os termos i e j, sendo j>i
	 * @param i i-esimo termo da Sequencia de Fibonacci
	 * @param j j-esimo termo da Sequencia de Fibonacci
	 * @return quociente entre os termos. 
	 */
	public float divisaoElementos(int i, int j) {
		if (i<=0 || j<=0 || i>n || j > n) {
			throw new ElementoInexistenteException(); 
		}
		
		return ((float)sequencia[i-1] / (float)sequencia[j-1]);
	}
	
	

}

