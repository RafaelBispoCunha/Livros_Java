package dia_01;
/*
 * Algoritmo que simula um Robo de exploração
 * 
 * Pagina 10.
 * 
 * Rafael Bispo
 * 09/01/2020
 */
public class VolcanoRobot {
	String status;
	int speed;
	float temperature;
	
	void checkTemperature() {
		if (temperature > 660) {
			status = "returning home";
			speed = 5;
		}
	}
	
	void showAttributes() {
		System.out.println("Status: " + status);
		System.out.println("Speed: " + speed);
		System.out.println("Temperature: " + temperature);
	}
}
