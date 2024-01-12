/*
//                                                     WHILE LOOP
// 														EXAMPLE1


					i=1
					while(true)
					{
						pin = System.console().readLine "Enter the pin:"
						if(i >=3)
						{
						println "Account is locked"
							break
						}
						if(pin  == '1234')
						{
							println "Login Successfull"
							break
						}
						i++
						println "Password wrong"
						continue
					}
				
*/


/*

//															FOR LOOP
//															EXAMPLE1
			
					println "General LOOP"
					for (i=1;i<11;i++)
					{
						println i
					}

//															FOR IN LOOP
//															  EXAMPLE1


					println "FOR IN LOOP"
					for (i in 1..10)
					{
						println i
					}

					println "FOR IN LOOP for array"
					for ( i in [10,10,20,30])      // these array can be used with in the for loop
					{
						println i
					}

					my_list = [0,10,20,30,40]
					for ( i in my_list)
					{
						println i
					}

					for (i in 1..10)
					{
						if(i==5 || i==7)
							continue
						println i
					}

					for (i in 1..10)
					{
						if(i==5 || i==7)
							break
						println i
					}

					for (i in 1..50)
					{
						if( i%5==0 && i%3==0 )
							println "FIZZBUZZ"
						else if ( i%3==0 )
							println "FIZZ"
						else if ( i%5 ==0 )
							println "BUZZ"
						else
							println i
					}


*/


/*

//															SWITCH CASE
															  EXAMPLE1

					n =  System.console().readLine "Number:"
					switch(n)
					{
						case "1":
								println "Given number is one"
								break
						case "2":
								println "Given number is two"
								break
						case "3":
								println "Given number is three"
								break
						case "4":
								println "Given number is four"
								break
						default: 
								println "Invalid Number"
					}

					switch(n)
					{
						case "1".."5":
								println "Given number is $n"
								break
						default: 
								println "Invalid Number"
					}

					n = n as int
					switch(n)
					{
						case 1..2:
								println "Integer value is 1 or 2"
								break
						case 3..4:
								println "Integer value is 3 or 4"
								break
						case 5..6:
								println "Integer value is 5 or 6"
								break
						default: 
								println "Invalid Number"
					}

*/


/*

//														SWITCH CASE USING REGEX

						n = System.console().readLine "Character:"
						switch(n)
						{
							case ~ /[A-Za-z]/:
										println "Alphabet"
										break
							case ~ /[0-9]/:
										println "Number"
										break
							case ~ /[^0-9A-Za-z]/:
										println "Special Character"
										break
							default:
										println "Invalid Character"
						}

						n = System.console().readLine "Character:"
						switch(n)
						{
							case ~ /[A-Za-z]+/:
										println "Alphabet"
										break
							case ~ /[0-9]+/:
										println "Number"
										break
							case ~ /[^0-9A-Za-z]+/:
										println "Special Character"
										break
							default:
										println "Invalid Character"
						}

*/

/*

//														ARRAY   (there is no dimensional array)

						my_list = [10,20,30,'abc','cdg',80]
						my_list[3]='linux'

						// To entire list
						println my_list

						// Using index value of the array
						println my_list[0]
						println my_list[-1]

						// Using range operator
						println my_list[1..3]

						// To Access multiple 
						println my_list[0,2]

						// to find the length of the array
						println my_list.size()
						
						//using range operator changing multiple values
						my_list[0..2] = [100,200,300]

						println my_list
						
						//  2D array
						my_list = [10,20,30,'abc','cdg',80, [100,200,300]]
						println my_list[-1][-1]
									
					
*/


/*

//																	LIST METHODS


						my_list = [10,20,30,'abc','cdg',80, 100,200,10,300]

						// to find the type of variable
						println my_list.class

						println "Length:"
						println my_list.size()   // length of array

						println "Count of 10:"
						println my_list.count(10)  // count the element 10

						println "Removing the element"
						println my_list.remove(7)  // remove the element based on index
						println my_list

						println "Removing using pop"
						println my_list.pop()	// remove the first element 
						println my_list

						println "Asc order"
						println my_list.sort()	// print in ascending order

						println "Des order"
						println my_list.reverse()	 // print in descending order

						println "Adding the value to list"
						my_list.add(60)			// to add element in the list
						println my_list

						println "Contains 100:"
						println my_list.contains(100)	// check the element is present

						println "Pushing 90"
						my_list.push(90)	// add the element at 1st index
						println my_list

						println "Droping"
						println my_list.drop(3)		// drop first three element print all the other values
						println my_list

*/

/*						

//										HASH MAP


						my_map = [101:'ABC',102:'XYZ',103:'MNO']
						println my_map
						println my_map[101]
						my_map[101]='ravi'
						println my_map

						my_map = [101:['ABC','DEV','US'],102:'XYZ',103:'MNO']	
						println my_map
						println my_map[101]
						println my_map[101][1]
						println my_map[101][1]='AWS'
						println my_map

						my_car = [1:['Audi','Black','2022','2.5C'],2:['Volvo','Red','2018','40L'],3:['Ferrari','White','2020','15C']]
						println my_car
						println my_car[1]		// printing with key value
						println my_car[1][0]
						my_car[1][1]='Blue'
						println my_car

						for (car in my_car)		// printing the one by one
						{
							println car
						}

*/

/*
									// Hash Map Methods
						
						my_car = [1:['Audi','Black','2022','2.5C'],2:['Volvo','Red','2018','40L'],3:['Ferrari','White','2020','15C']]

						println "Keys: ${my_car.keySet()}"   // getting all the keys
						println "Values: ${my_car.values()}"  // getting all the values
						println	"Length: ${my_car.size()}"   // finding the size
						println "Contains method: ${my_car.containsKey(1)}"

						for (i in my_car.keySet())
						{
							println "Key $i => ${my_car.get(i)}"
						}

						my_car = [1:['Audi','Black','2022','2.5C'],2:['Volvo','Red','2018','40L'],3:['Ferrari','White','2020','15C']]
						k = my_car.keySet().toList()
						k.add(4)
						println k

*/

/*

											//File Handling
											// IN Current Directory

						myfile = new File('Text.txt')
						//println myfile			-- It print the file name
						k = myfile.getText()
						println k

											// In other directory
						my_file = new File("C:\\Users\\arunsajeth.e\\Desktop\\Testing\\demo.txt")
						m = my_file.getText()
						println m

												//or

						my_file1 = new File("C:/Users/arunsajeth.e/Desktop/Testing/demo.txt")
						if(my_file1.exist())
						{
							println "FIle Exist"
							m1 = my_file1.getText()
							println m1
						}
						esle
						{
							println "FIle does not exist"
						}

												// FOr multiple lines

						fo = new File('Text.txt')
						k = fo.readLines()     -- used to entire file if it has mulitple lines
						println k
						// For printing only 2 to 4 line
						for (i in k[2..4])
						{
							println i
						}						

									//or
						// line if contains groovy it will print
						fo = new File('Text.txt')
						for (i in fo.readLines())
						{
							if(i =~/Groovy/)	// use regex binding instead contains method  
								println i
						}

						// Line start with groovy it will print
						fo = new File('Text.txt')
						for (i in fo.readLines())
						{
							if(i =~/^Groovy/)	// use regex binding line starting with groovy  
								println i
						}
						
						// Line end with groovy it will print
						fo = new File('Text.txt')
						for (i in fo.readLines())
						{
							if(i =~/Groovy$/)	// use regex binding line ending with groovy
								println i
						}

*/
						// Line start and end  with groovy itself will print
						fo = new File('Text.txt')
						for (i in fo.readLines())
						{
							if(i =~/^Groovy$/)	// use regex binding the line contains only groovy no other word 
								println i
						}