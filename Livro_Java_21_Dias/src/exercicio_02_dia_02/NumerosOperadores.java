package exercicio_02_dia_02;
/*
 * Escreve um programa que apresente dois números e use os operadores / e % para exibir o resultado
 * e o resto depois de serem divididos. Use o código de escape de caractere\t para separar o resultado
 * e o resto da saída.
 * 
 * Pagina 38.
 * 
 * Rafael Bispo
 * 10/01/2020
 */
public class NumerosOperadores {

	public static void main(String[] args) {
		int numero = 20;
		numero /= 4; 
		System.out.println("Divisão Inteira:\t" + numero);
		numero %= 3;
		System.out.println("Resto da Divisão:\t" + numero);

	}

}
