package polymorphism_4_3_1;

public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		System.out.println(" ===> ���� ����Ŀ ��ü ���� ");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker --- ���� ��");
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker --- ���� �ٿ�");
	}

}
