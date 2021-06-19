class Bound<T extends A>
{
private T objRef; 

public Bound(T obj){	//Setter Objek
this.objRef = obj;
}

public void doRunTest(){ 	//Method untuk menampilkan objek menggunakan method displayClass
	this.objRef.displayClass();
}
}

class A
{
public void displayClass()	//method displayClass versi superclass A
{
System.out.println("Nilai dari method displayClass() versi superclass A");
}
}

class B extends A
{
public void displayClass()	//method displayClass versi superclass B
{
System.out.println("Nilai dari method displayClass() versi superclass B");
}
}

class C extends A
{
public void displayClass()	//method displayClass versi superclass C
{
System.out.println("Nilai dari method displayClass() versi superclass C");
}
}

public class BoundedClass		//Main Driver Program
{
public static void main(String a[])
{
Bound<C> bec = new Bound<C>(new C()); 		//C
bec.doRunTest();
Bound<B> beb = new Bound<B>(new B()); 		//B
beb.doRunTest();
Bound<A> bea = new Bound<A>(new A()); 		//A
bea.doRunTest();
	}
}