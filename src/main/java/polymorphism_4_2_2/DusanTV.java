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
		System.out.println("두산TV -- 전원을 켠다");
	}

	@Override
	public void powerOff() {
		System.out.println("두산TV -- 전원을 끈다");

	}

	@Override
	public void volumeUp() {
		System.out.println("두산TV -- 볼륨을 높인다");
	}

	@Override
	public void volumeDown() {
		System.out.println("두산TV -- 볼륨을 낮춘다.");

	}

}
