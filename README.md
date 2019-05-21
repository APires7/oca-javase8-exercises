# oca-javase8-exercises
Repositório para códigos feitos durante estudo para certificação Oracle OCA Java SE 8

* Instance Initializer Blocks
	
	If there aren’t the same number of open ({) and close (}) braces, the code doesn’t compile.
	
* Order of Initialization

	When writing code that initializes fields in multiples places, you have to keep track of the order of initialization.
		* Fields and instance initializer blocks are run in the order which they appear in the file.
		* The constructor runs after all fields and instance initializer blocks have run.

* Primitive Types
	
	Java has eight built-in data types, referred to as the Java primitive types. These eight data types represent the building blocks for Java objects,
	because all Java objects are just a complex collection of these primitive data types.
		* boolean 		| true or false
		* byte		| 8-bit integral value
		* short		| 16-bit integral value
		* int		| 32-bit integral value
		* long		| 64-bit integral value
		* float		| 32-bit floating-point value
		* double		| 64-bit floating-point value
		* char		| 16-bit Unicode value
		
		** What's the largest int?
			You do not have to know this for the exam, but the maximum number an int can hold is 2,147,483,647. 
			How do we know this? One way is to have Java tell us:
			System.out.println(Integer.MAX_VALUE);
			The other way is with math. An int is 32 bits. 232 is 4,294,967,296. Divide that by 2 and you get 2,147,483,648.
			Then subtract 1 as we did with bytes and you get 2,147,483,647. It’s	easier to just ask Java to print the value, isn’t it?
