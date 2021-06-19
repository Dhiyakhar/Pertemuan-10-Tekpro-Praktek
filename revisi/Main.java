interface MinMax<T extends Comparable<T>> { 
	T max();
}
class MyClass<T extends Comparable<T>> implements MinMax<T> { 
	T[] vals;
MyClass(T[] o) { 
	vals = o;
}

public T max() { 		//Mencari nilai tertinggi dari array tersebut
	T v = vals[0];
for (int i = 1; i < vals.length; i++) { 
	if (vals[i].compareTo(v) > 0) {
v = vals[i];
}
}
return v;
}

}

public class Main {			//Main Program
public static void main(String args[]) { 
Integer angka[] = { 1, 2, 5, 9, 7 }; 			//deklarasi array angka bertipe integer
Character huruf[] = { 'a', 'k', 'z', 'l' };		//deklarasi array huruf bertipe char

MyClass<Integer> a = new MyClass<Integer>(angka);		//Membuat Object Class Generic angka bertipe integer bernama a
MyClass<Character> b = new MyClass<Character>(huruf); 	//Membuat Object Class Generic angka bertipe char bernama b

System.out.println(a.max()); 
System.out.println(b.max());
}
}
