/**
 * 
 */
package polymorphism_4_2_2;

/**
 * @author user
 *
 */
public class DusanTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("�λ�TV -- ������ �Ҵ�");
	}

	@Override
	public void powerOff() {
		System.out.println("�λ�TV -- ������ ����");

	}

	@Override
	public void volumeUp() {
		System.out.println("�λ�TV -- ������ ���δ�");
	}

	@Override
	public void volumeDown() {
		System.out.println("�λ�TV -- ������ �����.");

	}

}
