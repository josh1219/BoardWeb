package polymorphism_4_3_1;

public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		System.out.println(" ===> ¾ÖÇÃ ½ºÇÇÄ¿ °´Ã¼ »ý¼º ");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker --- º¼·ý ¾÷");
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker --- º¼·ý ´Ù¿î");
	}

}
