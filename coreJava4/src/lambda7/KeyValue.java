package lambda7;

import java.util.Map;
import java.util.TreeMap;

public class KeyValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new TreeMap<>();
	    map.put("c", 3);
	    map.put("b", 2);
	    map.put("a", 1);

	    StringBuilder stringResult = new StringBuilder();
	    map.forEach((k, v) -> stringResult.append(k).append("=").append(v).append(", "));
	    System.out.println(stringResult.substring(0, stringResult.length() - 2));

	}

}
