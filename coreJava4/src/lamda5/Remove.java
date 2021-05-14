package lamda5;

import java.util.Arrays;
import java.util.List;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> list = Arrays.asList(
			        "joy", "brave", "care", "duty", "fear", "elegance");

			  
			    StringBuilder firstLetters = new StringBuilder();
			    list.forEach(s -> firstLetters.append(s.substring(0, 1)) );
			    System.out.println(firstLetters);
			  }

	}


