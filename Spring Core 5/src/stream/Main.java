package stream;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
	public static <T> Predicate<T> distinctByKey(
		    Function<? super T, ?> keyExtractor) {
		  
		    Map<Object, Boolean> seen = new ConcurrentHashMap<>(); 
		    return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null; 
		}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Fruit f1=new Fruit("Jackfruit",200,100,"Green");
		Fruit f2=new Fruit("Lemon",95,75,"Yellow");
		Fruit f3=new Fruit("Orange",150,95,"Orange");
		Fruit f4=new Fruit("Strawberry",70,80,"Red");
		ArrayList<Fruit> fruit = new ArrayList<Fruit>();
		fruit.add(f1);
		fruit.add(f2);
		fruit.add(f3);
		fruit.add(f4);
		System.out.println("Calorie wise fruit names in descending order with calories less than 100:");
		fruit.stream().filter(f->f.calories < 100).sorted((Fruit fr1,Fruit fr2)->fr2.getCalories()-fr1.getCalories()).forEach((f)->System.out.println(f.name));
		System.out.println("Colour wise fruit names:");
		fruit.stream().sorted((Fruit fr1,Fruit fr2)->fr1.getColor().compareTo(fr2.getColor())).forEach((f)->System.out.println(f.name));
		System.out.println("Red Colour  fruit names sorted in order of price:");
		fruit.stream().filter(f->f.color.equalsIgnoreCase("Red")).sorted((Fruit fr1,Fruit fr2)->fr1.getPrice()-fr2.getPrice()).forEach((f)->System.out.println(f.name));
		
		
		News n1= new News(10,"Rohan","Shree","Finance");
		News n2= new News(14,"Rick","Fiza","Budget");
		News n3= new News(10,"Riya","Tina","Budget");
		News n4= new News(12,"Rohan","Isha","Sports");
		News n5= new News(13,"Rohan","Isha","Politics");
		News n6= new News(11,"Aksha","Oindrilla","Entertainment");
		ArrayList<News> news = new ArrayList<News>();
		news.add(n1);
		news.add(n2);
		news.add(n3);
		news.add(n4);
		news.add(n5);
		news.add(n6);
		long count = news.stream().filter(n->n.comment.equalsIgnoreCase("Budget")).count();
		System.out.println("The no of times budget appears in comments is: "+count );
		
		Map<String, Long> counting = news.stream().collect(
                Collectors.groupingBy(News::getCommentByUser, Collectors.counting()));
		System.out.println("The no of comments per user:");
		System.out.println(counting);
		
		Map<Integer, Long> maxVal = news.stream()
                .collect(Collectors.groupingBy(News::getNewsId, Collectors.counting()));
		Integer key = maxVal.entrySet().stream().findFirst().get().getKey();
		Long value = maxVal.entrySet().stream().findFirst().get().getValue();
		System.out.println("News Id with maximum number of comments:");
		System.out.println("News Id: " + key+ " Number of comments: "+value);
		
		Map<String, Long> maxVal2 = news.stream()
                .collect(Collectors.groupingBy(News::getCommentByUser, Collectors.counting()));
		String key2 = maxVal2.entrySet().stream().findFirst().get().getKey();
		Long value2 = maxVal2.entrySet().stream().findFirst().get().getValue();
		System.out.println("User with maximum number of comments:");
		System.out.println("User: " + key2+ " Number of comments: "+value2);
		
		
		Trader t1 = new Trader("Ramesh","Pune");
		Trader t2 = new Trader("Vikas","Pune");
		Trader t3 = new Trader("Suresh","Indore");
		Trader t4 = new Trader("Akash","Pune");
		Trader t5 = new Trader("Nilay","Delhi");
		Trader t6 = new Trader("Sanjay","Delhi");
		ArrayList<Trader> trader = new ArrayList<Trader>();
		trader.add(t1);
		trader.add(t2);
		trader.add(t3);
		trader.add(t4);
		trader.add(t5);
		trader.add(t6);
		System.out.println("Traders of Pune sorted according to name:");
		trader.stream().filter(t->t.city.equalsIgnoreCase("Pune")).sorted((Trader tr1,Trader tr2)->tr1.getName().compareTo(tr2.getName())).forEach((t)->System.out.println(t.name));
		
		System.out.println("Traders of Indore:");
		trader.stream().filter(t->t.city.equalsIgnoreCase("Indore")).forEach((t)->System.out.println(t.name));
		
		System.out.println("Unique cities are: ");
		trader.stream() .filter(distinctByKey(p -> p.getCity())) .collect(Collectors.toList()).forEach((p)->System.out.println(p.city));
		
		System.out.println("String of trader's names sorted alphabetically: ");
       List<String> filteredList= trader.stream().sorted((Trader tr1,Trader tr2)->tr1.getName().compareTo(tr2.getName())).map(t->t.name).collect(Collectors.toList());
       String names = String.join(" ", filteredList);
       System.out.println(names);
       
       
       Transaction tn1 = new Transaction(t1,2011,300000);
		Transaction tn2 = new Transaction(t2,2009,200000);
		Transaction tn3 = new Transaction(t3,2011,150000);
		Transaction tn4 = new Transaction(t5,2010,400000);
		Transaction tn5 = new Transaction(t4,2008,250000);
		Transaction tn6 = new Transaction(t6,2011,350000);
		ArrayList<Transaction> transaction = new ArrayList<Transaction>();
		transaction.add(tn1);
		transaction.add(tn2);
		transaction.add(tn3);
		transaction.add(tn4);
		transaction.add(tn5);
		transaction.add(tn6);
		System.out.println("Transanction  in 2011 sorted by value:");
		transaction.stream().filter(trn->trn.year==2011).sorted((Transaction trn1,Transaction trn2)->trn1.getValue()-trn2.getValue()).forEach((trn)->System.out.println(trn.trader.name+" "+trn.trader.city+" "+trn.year+" "+trn.value));
        
		Transaction trmax = transaction.stream().max((tran1,tran2)->tran1.value>tran2.value ?1:-1).get();
		System.out.println("Highest value of all transactions: "+trmax.value);
		
		Transaction trmin = transaction.stream().max((tran1,tran2)->tran1.value<tran2.value ?1:-1).get();
		System.out.println("Smallest value of transaction- Trader Name:"+trmin.trader.name+ " City:"+trmin.trader.city+" Year:"+trmin.year+" Amount:"+trmin.value );
	}
	
}

