package lambda8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ThreadList {
	  static void exercise5(List<Integer> list) {
		    
            new Thread(() -> list.forEach(n -> System.out.println(n))).start();
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Consumer<List<Integer>> consumer=ThreadList::exercise5;  
        consumer.accept(list); 

	}

}
