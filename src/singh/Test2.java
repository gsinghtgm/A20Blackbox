package singh;
import org.junit.Test;

import weiser.*;
public class Test2 {
	@Test
	public void test2() {
		LKW lkw1 = new LKW("Fiat", 5000, 2000, 1);
		lkw1.einsteigen();
		lkw1.aussteigen();
		System.out.println(lkw1.toString());
	}
}
