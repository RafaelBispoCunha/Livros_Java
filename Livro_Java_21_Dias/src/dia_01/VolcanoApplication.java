package dia_01;
/*
 * Algoritmo que simula um Robo de exploração
 * 
 * Pagina 12.
 * 
 * Rafael Bispo
 * 09/01/2020
 */
public class VolcanoApplication {

	public static void main(String[] args) {
		VolcanoRobot dante = new VolcanoRobot();
		dante.status = "Exploring";
		dante.speed  = 2;
		dante.temperature = 510;
		
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

	}

}
