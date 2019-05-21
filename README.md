# oca-javase8-exercises
Repositório para códigos feitos durante estudo para certificação Oracle OCA Java SE 8

* Instance Initializer Blocks
	
	If there aren’t the same number of open ({) and close (}) braces, the code doesn’t compile.
	
* Order of Initialization

	When writing code that initializes fields in multiples places, you have to keep track of the order of initialization.
		* Fields and instance initializer blocks are run in the order which they appear in the file.
		* The constructor runs after all fields and instance initializer blocks have run.
