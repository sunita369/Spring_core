package lambda4;
import java.util.ArrayList;
import java.util.Arrays;

public class OddLength {

	public static void main(String[] args)throws CloneNotSupportedException  {
		// TODO Auto-generated method stub
		
	    {
	        ArrayList<String> list = new ArrayList<>(Arrays.asList("hello","joy","echo","beauty"));
	 
	        list.removeIf( s -> s.length()%2 != 0 );
	         
	        System.out.println(list);

	}
	}
}


