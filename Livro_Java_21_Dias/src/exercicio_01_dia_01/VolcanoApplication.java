package exercicio_01_dia_01;
/*
* No método main() da classe VolcanoRobot, crie um segundo robô VolcanoRobot, chamado Virgil,
* configure suas variáveis de instância e apresente-as.
* 
* Pagina 20.
* 
* Rafael Bispo
* 09/01/2020
*/
public class VolcanoApplication {

	public static void main(String[] args) {
		VolcanoRobot dante = new VolcanoRobot();
		VolcanoRobot virgil = new VolcanoRobot();
		dante.status = "Exploring";
		dante.speed  = 2;
		dante.temperature = 510;
		virgil.status = "Exploring";
		virgil.speed = 2;
		virgil.temperature = 400;
				
		System.out.println("D A N T E ");
		System.out.println("");
		dante.showAttributes();
		System.out.println("Increasing speed to 3.");
		dante.speed = 3;
		dante.showAttributes();
		System.out.println("Changing temperature to 670.");
		dante.temperature = 670;
		dante.showAttributes();
		System.out.println("Checking the temperature.");
		dante.checkTemperature();
		dante.showAttributes();
		
		System.out.println("\nV I R G I L ");
		System.out.println("");
		virgil.showAttributes();
		
		System.out.println("Changing temperature to 500.");
		virgil.temperature = 500;
		System.out.println("Checking the temperature.");
		virgil.checkTemperature();
		System.out.println("Increasing speed to 3.");
		virgil.speed = 3;
		virgil.showAttributes();
		
		System.out.println("Changing temperature to 700.");
		virgil.temperature = 700;
		System.out.println("Checking the temperature.");
		virgil.checkTemperature();
		virgil.showAttributes();
		System.out.println("Increasing speed to 5.");
		virgil.speed = 5;
		virgil.showAttributes();
		
	}

}
