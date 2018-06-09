package exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciseOne {

	public static void main(String[] args) {
		List<Person> people=Arrays.asList(
				new Person("Charles","Dickens",60), 
				new Person("John","simons",42),
				new Person("chaitanya","krishna",55),
				new Person("mikel","velayudam",52),
				new Person("sim","tangle",35),
				new Person("jack","johns",42)
				);

		
//		sort list by lastName...java7 way
//		---------------------------------
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person arg0, Person arg1) {
				return arg0.getLastName().compareTo(arg1.getLastName());
			}
		});
		
		
		
		
//		sort List in ====java8====functional interface way
//		--------------------------------------------------
		Collections.sort(people, (p1,p2)->{
			return p1.getLastName().compareTo(p1.getLastName());
		});
		
		
		
			
		
		
//...............calling the methods.................
//		 ========print all==========
		printAll(people);
		System.out.println("-------------");
		printConditionally(people,p->true);
//       ===========================		
		
		
		
		
		System.out.println("============");
		
		printLastNameStartsWithC(people);
		
		System.out.println("============");
		
		printConditionally(people,new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("C");
			}
		});
		
		System.out.println("==================");
		
//		print conditionally ..last name starts with v
		printConditionally(people,new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("v");
			}
		});

	
//		calling print conditionally method in ===java8====way
			printConditionally(people,p-> p.getLastName().startsWith("t"));
		
	
			
			
	
	}
	

	
	
	
	
	
//	=============Methods====================
	
	
//		crate a method that print all people
//		-----------------------------------	
		private static void printAll(List<Person> people) {
			for(Person p: people) {
				System.out.println(p);
			}
		};	
		
		
//		method printLastNameStartsWithC
//		-------------------------------
		private static void printLastNameStartsWithC(List<Person> people){
			for(Person p:people) {
				if(p.getLastName().startsWith("k")) {
					System.out.println("person name that starts with C..."+p);
				}
			}
		}
		
		
//		print conditionally method....we adding a behavior .....
//		--------------------------------------------------------
		private static void printConditionally(List<Person> people, Condition condition) {
			for(Person p:people) {
				if(condition.test(p)) {
				System.out.println(p);
				}
			}
		}
	
		
		
//		==============Interface==============	
//		condition interface
		interface Condition{
			boolean test(Person p);
		}
		
		

		
}
