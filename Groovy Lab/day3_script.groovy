//**********************************************************************************************************************************************************************************

/*

//  Character Pattern

println "Character with *"
fo = new File('day3_text.txt')
for (i in fo.readLines())
{
	if(i =~/ab*c/)
		println i
}

println "************************"

println "Character with +"
fo = new File('day3_text.txt')
for (i in fo.readLines())
{
	if(i =~/ab+c/)
		println i
}

println "************************"

println "Character with ?"
fo = new File('day3_text.txt')
for (i in fo.readLines())
{
	if(i =~/ab?c/)
		println i
}


println "************************"

println "Character with ."
fo = new File('day3_text.txt')
for (i in fo.readLines())
{
	if(i =~/ab.c/)
		println i
}


println "************************"

println "Using anyting with .*"
fo = new File('day3_text.txt')
for (i in fo.readLines())
{
		use .* in if loop
		println i
}


println "************************"

println "Line contains only three words"
fo = new File('day3_text.txt')
for (i in fo.readLines())
{
	if(i =~/^\w+\s\w+\s\w+$/)
		println i
}

println "************************"

// name must 2 characters
file = new File('day3_text.txt')
for ( i in file.readLines())
{
	if(i =~/[A-Za-z]{2,}$/)       // For not including non-alphabet use ^  and $
		println i
}

println "************************"

// For phone number validation
file = new File('day3_text.txt')
for ( i in file.readLines())
{
	if(i =~/^[6-9][0-9]{9}$/)      // For exact 10 digit use ^ at start and use $ at end
		println i
}

println "************************"

// Email validation
file = new File('day3_text.txt')
for (i in file.readLines())
{
	if (i =~/^[A-Za-z][A-Za-z0-9]+[@][A-Za-z]+[.][A-Za-z]{2,3}$/)
		println i
}

// pipeline
println "************************"

fo = new File('day3_text.txt')
for (i in fo.readLines())
{
	if( i=~/groovy|linux|shell)
		println i
}

// Exact word using \b

println "*********************"
fo = new File('day3_text.txt')
for (i in fo.readLines())
{
	if(i=~/\barun\b/)
		println i
}

// Start word with using \b

println "*********************"
fo = new File('day3_text.txt')
for (i in fo.readLines())
{
	if(i=~/\barun/)
		println i
}


// word ends with using \b

println "*********************"
fo = new File('day3_text.txt')
for (i in fo.readLines())
{
	if(i=~/arun\b/)
		println i
}


*/

//****************************************************************************************************************************************************************************************


// start with and end with 
// use ^arun.*arun$

// ^arun$ => line should contains only arun string
// ^[arun] => line should start with either a or r or u or n
// ^[^arun] => line should not start with a or r or u or n


//***********************************************************************************************************************************************************************************

/*


// Function without argument

def fun()
{
	println "Function calling"
}
fun()

// Function with argument

def add(arg1,arg2)
{
	println "Add Function calling"
	sum = arg1+arg2
	println sum
}
def sub(arg1,arg2)
{
	println "Sub Function calling"
	sum = arg1-arg2
	println sum
}
def mul(arg1,arg2)
{
	println "Mul Function calling"
	sum = arg1*arg2
	println sum
}
add(10,20)
sub(10,20)
mul(10,20)


// Local Varaible && Global Variable

def x =100 // can be accessed only outside if we accesed within function return ERROR
def f1()
{
	y=10		// Here y is global variable can be accessed 
}
def f2()
{
	println y
}
f1()
println y  // No error
f2()


// Function with Return statement

def fun1()
{
	println "FUN1 CALLING"
	return 10
}
println fun1()

// Example1: TO FIND THE GRADE FOR THE MARKS

def average(name,marks)
{
	println "Welcome $name"
	def total = marks.sum()
	def len = marks.size()
	def avg = total / len
	return avg
}

def find_grade(avg)
{
	if(avg>80)
		return 'A'
	else if (avg >60)
		return 'B'
	else if (avg >50)
		return 'C'
	else
		return 'F'
}

marks = [95,96,97,98,99,100]
name = 'Arun'
aver = average(name,marks)
println "Average : $aver"
grade = find_grade(aver)
println "My grade: $grade"
	


*/


//**********************************************************************************************************************************

/*

// Module

import airthmetic as arith  // file name . always create module file in same location is better to use
// We can also give alias name for modulename here airthmetic as arith

x = System.console().readLine "Number 1:"
x = x as int
y = System.console().readLine "Number 2:"
y = y as int
result1 = new arith().sum(x,y)
result2 = new arith().sub(x,y)
result3 = new arith().mul(x,y)
println "SUM: $result1"
println "SUB: $result2"
println "MUL: $result3"

*/

/*

// import for groovy taken from net which is predefined module

import groovy.json.JsonSlurper    

def jsonText = '{"name": "Arun", "age": 22, "city": "Chennai"}'    // creating json variable
def jsonSlurper = new JsonSlurper()     						   // creating json object
def data = jsonSlurper.parseText(jsonText)						   // using that object calling the respective method																   // above method will convert json object into groovy object such as list or map
println("Name: ${data.name}")
println("Age: ${data.age}")
println("City: ${data.city}")


// TO read json file

def mydata = jsonSlurper.parse(new File('json1.json'))
println mydata
println "My name is ${mydata.name} and age is ${mydata.age}."


// To write in json file

import groovy.json.JsonOutput						// import statement to write data in json file
def myjson = [name:"XYZ", age:23,city:"CHINA"]
def json_str = JsonOutput.toJson(myjson)   			// used to convert groovy data (map) into a json object

File file = new File('json1.json')
file.write(json_str)     							// to write the json object in the json file


										//or
//def filepath = 'json1.json'
//new File(filepath).text = json_str


*/

/*

// Why string is immutable

str1 = 'groovy'
println System.identityHashCode(str1)  // to get the reference id 
str1 = str1.replace('g','k')
println System.identityHashCode(str1)

// why list is mutable
list = ['ab','cd','ef','gh']
println System.identityHashCode(list)
list[0]='xy'
println System.identityHashCode(list)

*/

/*

// Command Line Argument or positional argument

//my_arg = args
//println my_arg

// Example: Connecting_server.groovy hostname password
host_info = args
host_name = args[0]
user_name = args[1]
password  = args[2]
println "\n*********************************"
println "Host Name: $host_name"
println "Username : $user_name"
println "Password : $password"
println "*********************************"

*/

/*

// Expectional Handling

num1 =10
num2 =0
try
{
	result = num1 / num2
	println result
}
catch(ArithmeticException e)
{
	println "Denominator should not be zero"
}
catch(Exception e)
{
	println "Something Went Wrong Because ${e.message}"
}
finally
{
	println "Bye"
}
println "**************"

try
{
	file = new File("ahd.txt")
	for (i in file.readLines())
		println i
}
catch(FileNotFoundException | ArithmeticException e)
{
	println "Choose the correct file and mention crct path"
}
catch(Exception e)
{
	println "Something Went Wrong Because ${e}"
}
finally
{
	println "Bye"
}


import groovy.json.JsonOutput
try
{
	def jsondata = [
		name:'Arun',
		age:22
	]
	
	def filepath = 'hadfhaf.json'
	def jsoncontent = JsonOutput.toJson(jsondata)
	new File(filepath).text = jsoncontent
	println "Data Submitted: $filepath"
	
}
catch(FileNotFoundException | ArithmeticException e)
{
	println "Choose the correct file and mention crct path"
}
catch(Exception e)
{
	println "Something Went Wrong Because ${e}"
}
finally
{
	println "Bye"
}

*/


// OBJECT ORIENTED PROGRAMMING LANGUAGE

