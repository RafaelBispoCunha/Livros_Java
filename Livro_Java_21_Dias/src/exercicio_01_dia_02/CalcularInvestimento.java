package exercicio_01_dia_02;
/*
 * Crie um programa que calcule quanto seria um investimento de $14.000 se seu valor aumentasse em 40%
 * durante o primeiro ano, perdesse $1.500 no segundo ano e aumentasse 12% no terceiro ano.
 * Pagina 38.
 * 
 * Rafael Bispo
 * 10/01/2020
 */
public class CalcularInvestimento {

	public static void main(String[] args) {
		float investimento = 14000;
		System.out.println("Meu Investimento: " + investimento);
		investimento = (investimento * .4F) + investimento;
		System.out.println("\nMeu Investimento apos o 1° ano: " + investimento);
		investimento = investimento - 1500;
		System.out.println("\nMeu Investimento apos o 2° ano: " + investimento);
		investimento = (investimento * .12F) + investimento;
		System.out.println("\nMeu Investimento apos o 3° ano: " + investimento);
		

	}

}
