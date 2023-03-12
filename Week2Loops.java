package week2ConditionsAndLoops;

public class Week2Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Boolean Expressions/ Loops are conditional until condition is met - it repeats
		
		//while Loop Example:

		int cupsOfFlour = 0;

		while (cupsOfFlour < 5) {

		  System.out.println("Scooping a cup of flour into the bowl");

		  cupsOfFlour += 1;

		  System.out.println("There are " + cupsOfFlour + " cups of flour in the bowl."); 

		}
		
//		The above solution is a much cleaner way to do the exact same thing as the 16 lines in our first example and it solves both problems. 1) it does not contain duplicate code; it is DRY. And 2) we can change the condition to 6, 7, 4, or 10000000 by simply switching the number in the Boolean expression. 
//
//		The way this works is that the Boolean expression 'cupsOfFlour < 5' will evaluate and if it evaluates to true the code inside the body (between the opening and closing curly brace) will execute. After it executes, the Boolean expression will then evaluate again. If it is true, the body will again execute. Each execution is known as an iteration. The loop will continue to iterate until the Boolean expression evaluates to false. This is why the line 'cupsOfFlour += 1;' is so important; because without it, cupsOfFlour will remain 0 and the Boolean expression will never be false, thus resulting in an infinite loop (a loop that never ends).
		
		//for Loop Example:

		for (int cupsOfWater = 1; cupsOfWater <= 5; cupsOfWater++) {

			System.out.println("Scooping a cup of Water into the bowl.");

			System.out.println("There are " + cupsOfWater + " cups of Water."); 

		}
		
//		Notice this loop is two lines shorter and does the exact same thing. A for Loop has three sections inside its parentheses separated by two semicolons. 
//
//	    The first section is where we can declare any variables to be used in the loop. In this situation, we set our cupsOfFlour variable (the most common variable here in a for loop is i - read on for an example). 
//	    The second section is where we put our Boolean expression, in this case cupsOfFlour <= 5 that determines whether or not the loop performs an iteration. 
//	    The final section is the post-iteration, it is what happens after the loop completes an iteration. In this case, we use cupsOfFlour++ here, which is essentially the same thing as cupsOfFlour += 1
		
//As stated above, i is the most common variable name in a for Loop. Here is an example that prints from 0 to 9:

			//for Loop Example #2:

			for (int i = 0; i < 10; i++) {

			  System.out.println(i);

			}

//We can also use loops and conditionals together, they don't have to be separate. We can have loops inside of if statements, or vice versa. Here is an example of an if statement inside of a loop that prints out every number from 0 to 99 divisible by 3.
			
			
			//for Loop Example #3:

				for (int i = 0; i < 100; i++) {

				  if (i % 3 == 0) {

				    System.out.println(i);

				  }

				}



//Another type of loop is called a do while loop. This loop functions much like a while loop, except that a while loop has the possibility of never running if its Boolean expression evaluates to false the first time, and a do while loop will always execute at least once since the expression is at the end. Let's take a look at an example.
				
				//do while  Loop Example:

					int i = 10;

					do {

					  i++;

					  System.out.println(i);

					} while (i < 3);
					

//As we can see here, i is already greater than 3, but this loop will still iterate once and then exit.
					
					for (int a = 0; a < 100; a++)	{
						System.out.println(a);
					}
					
					System.out.println("Loop Finished.");
					
					
					int b = 10; 
					
					do {
						
						System.out.println("Hello, World!");
						
					} while (b < 10);
					
					
		
		//for loop declaration
		//for (variable; condition; change)
		//	  statement
		
		//for (int i = 0; i < 10; i++)	{
			//System.out.println("Scoop cup of flour");
			//System.out.println(i);
		//}
		
		//for (int i = 1; i <= 10; i++)	{
		//	System.out.println(i);
		//}
		
		//for (int i = 0; i < 100; i += 2)	{
			//if (i % 2 == 0)	{
			//System.out.println(i);
		//}
		//}		
		
		//a condition that keeps running until the formula reads 'true'
		// when equal it wont run
		int x = 0;
		while (x < 10)	{
			System.out.println(x);
			x++;
		}
		
		//if no value comes from condition due to 'true' state then
		//this is where 'do' condition comes in
		do {
			System.out.println(x);
			x++;
		} while (x < 2);
		



	}

}
