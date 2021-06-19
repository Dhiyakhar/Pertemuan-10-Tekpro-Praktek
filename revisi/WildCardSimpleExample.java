import java.util.ArrayList; 
import java.util.Collection; 
import java.util.HashSet; 
import java.util.LinkedList;

public class WildCardSimpleExample {
public static void printCollection(Collection<?> c) { //Method untuk menampilkan elemen masing-masing collection
	for (Object e : c) {
System.out.println(e);
}
}

public static void main(String[] args) { 
	Collection<String> collection = new ArrayList<>();	//Inisialisasi Collection ArrayList bertipe String 
	collection.add("Contoh Penggunaan ArrayList :");
	collection.add("a");
	collection.add("b");
	collection.add("c");
	printCollection(collection);
	
Collection<String> collection2 = new LinkedList<>(); 	//Inisialisasi Collection LinkedList bertipe String 
collection2.add("Contoh Penggunaan LinkedList :"); 
collection2.add("1");
collection2.add("2");
collection2.add("3");
printCollection(collection2);

Collection<String> collection3 = new HashSet<>(); 		//Inisialisasi Collection HashSet bertipe String 
collection3.add("HashSet 1");
collection3.add("HashSet 2"); 
collection3.add("MapSet 1"); 
collection3.add("TreeSet"); 
collection3.add("MapSet 2"); 
printCollection(collection3);

}
}
