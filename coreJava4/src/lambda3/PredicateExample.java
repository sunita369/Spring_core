package lambda3;
import java.util.function.Predicate;
import java.util.*;
public class PredicateExample {
	String name, role;
	PredicateExample(String a, String b) {
        name = a;
        role = b;
    }
    String getRole() { return role; }
    String getName() { return name; }    
    public String toString() {
       return "User Name : " + name + ", Role :" + role;
    }
  
    public static void main(String args[])
    {      
        List<PredicateExample> users = new ArrayList<PredicateExample>();
        users.add(new PredicateExample("John", "admin"));
        users.add(new PredicateExample("Peter", "member"));
        List admins = process(users, (PredicateExample u) -> u.getRole().equals("admin"));
        System.out.println(admins);
    }
  
    public static List<PredicateExample> process(List<PredicateExample> users, 
                            Predicate<PredicateExample> predicat)
    {
        List<PredicateExample> result = new ArrayList<PredicateExample>();
        for (PredicateExample user: users)        
            if (predicat.test(user))            
                result.add(user);
        return result;
    }

}
