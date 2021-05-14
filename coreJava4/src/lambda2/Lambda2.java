package lambda2;
import java.util.ArrayList;  
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;   
class Product{    
    float price; 
    String status;
    public Product(float price,String status) {  
        super();   
        this.price = price; 
        this.status = status;
    }  
}
public class Lambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Product> list=new ArrayList<Product>();  
	        list.add(new Product(17000f,"Accepted"));
	        list.add(new Product(8000f,"Completed"));
	        list.add(new Product(17000f,"Placed"));
	        list.add(new Product(12000f,"Completed"));
	        Predicate<Product> pc = p -> p.price > 10000;
	        Predicate<Product> st = p -> p.status == "Accepted";
	        Predicate<Product> st1 = p -> p.status == "Completed";
	        
	        Stream<Product> filtered_data = list.stream().filter((pc.and(st)).or(pc.and(st1)));  
	          
	        // using lambda to iterate through collection  
	        filtered_data.forEach(  
	                product -> System.out.println("Order of amount: "+product.price+": "+product.status)  
	        );  
	        

	}

}
