package polymorphism_2_3_1;

public class TVUser {

	public static void main(String[] args) {
		/*
		SamsungTV tv = new SamsungTV(); 		
			// ������ ���� , (�����ڰ� ���� ���α׷� �ڵ峻���� ��ü�� ����)
		
		tv.powerOn(); // �޼ҵ� ȣ�� :  ������ Ų��.
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		*/
		
		
		// ������� �䱸�� ���ؼ� Samsung TV���� LGTV�� ����
			// ��ü ����, �޼ҵ��̸� ��� ���� 
		
		LgTV tv = new LgTV();
		tv.turnOn(); // �޼ҵ� ȣ�� : ������ Ų��.
		tv.turnOff();
		tv.soundUp();
		tv.soundDown();
		
		
		
	}
	
}
