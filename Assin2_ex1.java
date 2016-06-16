package assignment2;

    import java.util.*;




	public class Assin2_ex1 {

	public static void main( String [] args ) {

	// Create a set called mySet

	Set<String> mySet = new HashSet<String>();

	// Ensure that this set contains an interesting selection of fruit

	String fruit1 = "pear", fruit2 = "banana", fruit3 = "tangerine",fruit4 = "strawberry", fruit5 = "blackberry";

	mySet.add( fruit1 );

	mySet.add( fruit2 );

	mySet.add( fruit3 );

	mySet.add( fruit2 );

	mySet.add( fruit4 );

	mySet.add( fruit5 );

	// Display contents of mySet

	System.out.println( "mySet now contains:" );

	System.out.println( mySet );
	
	System.out.println("The hash instance does not guarantee the order of a set");
	
	System.out.println("****> display the cardinality of (i.e. the number of elements in) mySet;");
	
	System.out.println("The size of Hast set is : "+ mySet.size());
	
	System.out.println("****> > remove the blackberry and strawberry; display contents of mySet again to confirm success;");
	mySet.remove("strawberry");
	mySet.remove("blackberry");
	
	System.out.println("The size of Hast set is : "+ mySet.size());
	System.out.println( mySet );
	//for ( String element :mySet)
	//{
		
	//	mySet.remove(element);
	//}
	System.out.println("****> > remove the remaining fruit using a single method invocation");
	mySet.removeAll(mySet);
	
	System.out.println( "mySet now contains:" );
	System.out.println( mySet );
	
	
	System.out.println("****>> show that the set is now empty by using the isEmpty() method.");
	System.out.println( mySet );
	if (mySet.isEmpty() ==true){
		System.out.println( "Myset is empty"+mySet );
		
	}
	else
	System.out.println( "Myset is  not empty"+mySet );
	}

	}


