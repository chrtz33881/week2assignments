package week2ConditionsAndLoops;

public class BooleanOperatorsAndConditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Week 2 Boolean Operators
		
		//-Boolean Expressions
		//-Less than:   <
		//-Greater than:   >
		//-Less than or equal to:   <=
		//-Greater than or equal to:   >=
		//-Equal (type matters):   ==
		
		System.out.println(2 == 2);
		
		// greater than > / less than <
		System.out.println(2 > 5);
		System.out.println(3 <= 5);
		// less than < or equal = to expression
		System.out.println(5 <= 5);
		
		// && = and 
		// || = or
		System.out.println(2 == 2 && 1 < 5);
		//both comparisons must be true here to = True
		System.out.println(2 == 2 && 1 == 5);
		
		
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(false || false);
		
		// Legally Old Enough To Drive Example:
		int ageRequiredToDrive = 16;
		int currentAge = 14;
		
		boolean canPersonDrive = (currentAge >= ageRequiredToDrive);
		System.out.println(canPersonDrive);
		
		//Week 2 Conditionals
		//"if" & "else" Conditional Statement
		String name = "Chris";
		
		if (name == "Chris") {
			System.out.println("Hello, Chris!");
		} else { 
			System.out.println("You are not Chris, " + name + "!");
		}
		
		int age = 14;
		
		if (age >= 16) {
			System.out.println("You can get your license!");
		} else {
			// example 1 - standard message
			System.out.println("You're not old enough for your license.");
			
			//example 2 - math function included 
			System.out.println("Please wait " + (16 - age) + " year(s) to get your licnse.");
		}
		
		//"else if" conditional statement = logical decision path that has many paths.
		double costOfMilk = 2;
		
		if (costOfMilk <= 2) {
			System.out.println("You can buy 2 gallons of milk.");
		} else if (costOfMilk <= 4) {
			System.out.println("You can buy 1 gallon of milk.");
			//if nothing is true and your done with the path, end it with 'else' = "if none of this is true, then.."
		} else {
			System.out.println("Not buying milk today.");
		}

		
		//switch statement
		char grade = 'C';
		
		switch (grade) {
			case 'A':
				System.out.println("90%");
				break;
			case 'B':
				System.out.println("80%");
				break;
			case 'C':
				System.out.println("70%");
				break;
			default:
				System.out.println("0%");
		}
		
		//multiple conditions 
		if (5 == 5) {
		}	if (4 == 3) {
		}		else {
			System.out.println("5 is 5 and 4 is 4.");
			System.out.println("5 is 5");
			}
		
		
		if (5 == 5 && 4 == 4) {
			System.out.println("Yes");
		}
	}

}
