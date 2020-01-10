package dia_02;
/*
 * Uma aplicação que converte as terperaturar Fahrenheit e Celsius.
 * Pagina 31.
 * 
 * Rafael Bispo
 * 10/01/2020
 */
public class Weather {

	public static void main(String[] args) {
		float fah = 86;
		System.out.println(fah + " degrees Fahrenheit is...");
		//Para converter de Fahrenheit para Celsius
		
		//Comeca subtraindo 32
		fah = fah - 32;
		//Divide a reposta por 9
		fah = fah / 9;
		//Multiplica esse valor por 5
		fah = fah * 5;
		System.out.println(fah + " degrees Celsius\n");
		
		float cel = 33;
		System.out.println(cel + " degrees Celsius is...");
		//Para converter de Celsius para Fahrenheit
		//Começa multiplicando por 9
		cel = cel * 9;
		//Divide a reposta por 5
		cel = cel / 5 ;
		//Soma 32 a Resposta
		cel = cel + 32;
		System.out.println(cel + " degrees Fahrenheit");
				

	}

}
