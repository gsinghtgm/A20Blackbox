package singh;

import org.junit.Test;

import weiser.*;

public class Test1 {
	@Test
	public void test1() {
		LKW lkw1 = new LKW("Ford", 6000, 3000, 2);
		lkw1.aufladen(5999);
		lkw1.einsteigen();
		System.out.println(lkw1.toString());
	}
}
