package com.prowings.singlton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSinglton {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		EagerInitialization obj1 =EagerInitialization.getInstance();
//		EagerInitialization obj2 =EagerInitialization.getInstance();
//		System.out.println(obj1 == obj2);
//		
//		
//		StaticBlockInitialization o1= StaticBlockInitialization.getInstance();
//		StaticBlockInitialization o2 = StaticBlockInitialization.getInstance();
//		System.out.println(o1 == o2);
//		
//		
//		LazyInitialization ob1 = LazyInitialization.getInstance();
//		LazyInitialization ob2 = LazyInitialization.getInstance();
//		System.out.println(ob1 == ob2);
//		
//		
//		ThreadSafeUsingMethod ts1 = ThreadSafeUsingMethod.getInstance();
//		ThreadSafeUsingMethod ts2 = ThreadSafeUsingMethod.getInstance();
//		System.out.println(ts1 == ts2);
//		
//		
//		ThreadSafeUsingBlock tsb1 = ThreadSafeUsingBlock.getInstance();
//		ThreadSafeUsingBlock tsb2 = ThreadSafeUsingBlock.getInstance();
//		System.out.println(tsb1 == tsb2);
//		
//		
//		BillPughInitialization bp1 = BillPughInitialization.getInstance();
//		BillPughInitialization bp2 = BillPughInitialization.getInstance();
//		System.out.println(bp1 == bp2);
//	
//	
//		EnumSinglton e1 = EnumSinglton.getInstance();
//		EnumSinglton e2 = EnumSinglton.getInstance();
//	    System.out.println(e1 == e2);

		SerializationSinglton instance1 = SerializationSinglton.getInstance();
		FileOutputStream fos = new FileOutputStream("f.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(instance1);
		oos.close();

		FileInputStream fis = new FileInputStream("f.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializationSinglton instance2 = (SerializationSinglton) ois.readObject();
		ois.close();

		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());

	}

}
