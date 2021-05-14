package lamda6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<String> list = new ArrayList<>(Arrays.asList(
			        "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));
			    list.replaceAll(s -> s.toUpperCase());
			    System.out.println(list);
			  }

	}


