package polymorphism_4_2_2;

public class SonySpeaker implements Speaker {

	public SonySpeaker() {
		System.out.println(" ===> ¼Ò´Ï ½ºÇÇÄ¿ °´Ã¼ »ý¼º ");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker --- º¼·ý ¾÷");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker --- º¼·ý ´Ù¿î");
	}
	
	
}
