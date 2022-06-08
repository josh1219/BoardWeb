package polymorphism_4_1_2;

public class SkTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("SkTV -- Àü¿øÀ» ÄÒ´Ù");
	}

	@Override
	public void powerOff() {
		System.out.println("SkTV -- Àü¿øÀ» ²ö´Ù");
	}

	@Override
	public void volumeUp() {
		System.out.println("SkTV -- º¼·ıÀ» ³ôÀÎ´Ù");
	}

	@Override
	public void volumeDown() {
		System.out.println("SkTV -- º¼·ıÀ» ³·Ãá´Ù");
	}

}
