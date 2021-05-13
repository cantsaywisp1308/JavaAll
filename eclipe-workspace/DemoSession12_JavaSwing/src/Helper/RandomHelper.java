package Helper;

import java.util.UUID;

public class RandomHelper {
	
	public static String randomUUID() {
		String result = UUID.randomUUID().toString();
		return result.replace("-", "");
	}

}
