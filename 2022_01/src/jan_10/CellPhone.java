package jan_10;

public class CellPhone {
	String model;
	String color;
	
	void poweron() {
		System.out.println("Power On");
	}
	
	void poweroff() {
		System.out.println("Power Off");
	}
	
	void bell() {
		System.out.println("Bell Ring");
	}
	
	void sendVoice(String message) {
		System.out.println("Send Message : " + message);
	}
	
	void receiveVoice(String message) {
		System.out.println("Receive Message : " + message);
	}
	
	void hangUp() {
		System.out.println("Hang Up");
	}

}
