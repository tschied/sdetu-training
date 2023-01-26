package datastructures;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;


public class Sets {

	public static void main(String[] args) {
		// 1. Create a collection
//		HashSet<String> animals = new HashSet<String>();
//		Set<String> animals = new HashSet<String>();		// complete random order
//		Set<String> animals = new LinkedHashSet<String>();	// keeps the order in which elements are added
		Set<String> animals = new TreeSet<String>();	// makes alphabetical order
		
		// 2. add elements
		animals.add("dog");
		animals.add("pig");
		animals.add("hog");
		animals.add("cat");
		animals.add("snake");
		
		System.out.println(animals.size() + " animals: " + animals);
		
		animals.add("cat");
		animals.add("snake");
		animals.add("goose");

		System.out.println(animals.size() + " animals: " + animals);

		
		// create new set for comparison
		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("chicken");
		farmAnimals.add("cow");
		farmAnimals.add("pig");
		farmAnimals.add("horse");
		farmAnimals.add("dog");
		
		
		// what is the INTERSECTION between these two sets
		
		// 1. copy existing set into a new set
		Set<String> intersectionSet = new HashSet<String>(animals);
		System.out.println(intersectionSet);
		intersectionSet.retainAll(farmAnimals);
		System.out.println("The intersection set is: " + intersectionSet);

		// what is the UNION between these two sets		
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("The union set is: " + unionSet);
		
		
		// what is the difference, animals that are not shared (in one set, but not the other)
		Set<String> diffSet = new HashSet<String>(unionSet);
		diffSet.removeAll(intersectionSet);
		System.out.println("The difference set is: " + diffSet);
		
		// animals, but NOT farm animals
		Set<String> diffSet2 = new HashSet<String>(animals);
		diffSet2.removeAll(intersectionSet);
		System.out.println("The 2nd difference set is: " + diffSet2);
	}

}
