package polymorphism_4_1_2;

public class SamsungTV implements TV {
	
	private SonySpeaker speaker; // ��ü ���� ����

	public SamsungTV () { 	// �⺻ ������
		
		System.out.println(" ===> SamsungTV ��ü ���� ");
	}
	
	public void initMethod() { 			// ��ü ���� ���Ŀ� ���� ���� ȣ�� �Ǵ� �޼ҵ�
		System.out.println(" initMethod ȣ�� : ��ü �ʱ�ȭ �Ϸ�");
	}
	
	public void destroyMethod() {		// ��ü ������ ȣ�� �Ǵ� �޼ҵ�
		System.out.println(" destroyMethod ȣ�� : ��ü ������ ȣ��Ǵ� �޼ҵ� ");
	}
	
	
	@Override
	public void powerOn() {
		System.out.println("�ＺTV -- ������ �Ҵ�");

	}

	@Override
	public void powerOff() {
		System.out.println("�ＺTV -- ������ ����");

	}
	
	// ������ ����, ���α׷� ������ ��ü�� ������ ���, ���ο� ����� ����Ŀ�� ��ü�Ҷ� �ڵ带 �����ؾ� �Ѵ�.

	@Override
	public void volumeUp() { 		
		speaker = new SonySpeaker();	// SonySpeaker ��ü ����
		speaker.volumeUp();				// SonySpeaker ��ü ȣ��

	}

	@Override
	public void volumeDown() {
		speaker = new SonySpeaker();
		speaker.volumeDown();
		
	}


}
