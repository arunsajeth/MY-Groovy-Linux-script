// Java code

/*
class HelloWorld {
	public static void main(String[] a)
	{
		System.out.println("HelloWorld");
	}
}

*/

//----------------------------------------------------------------------------------------------------------------------------------

/*

// In Groovy code
==================

*/

 

/*  print statement in groovy
=============================

println "Hello world"
println "Welcome"
print "Hi"
print "Bye"

/*


 

/*   run time error

print abc

*/

//--------------------------------------------------------------------------------------------------------------------------

/*

Declaring a variable
====================

// no need declare datatype for a variable

a = 10
println a

b=10.5
println b

c = 'groovy'
println c

d = "python"
println d


print " The value of a is "+a

*/


//------------------------------------------------------------------------------------------------------------------------------------

/* String Interpolation
	==================


a=10
println "Value of a is: $a"   // it works
println 'Value of a is: $a'	  // it will not works 

*/


//-----------------------------------------------------------------------------------------------------------------------------------



/*

// to get datatype of variable use getClass() method 

a =10
println a.getClass()

b='a'
print b.getClass()

*/

//-----------------------------------------------------------------


/*
		String
	   ========

println 'I don't accept'       // error ambiquity problem

println " I don"t accept"      //  error ambiquity problem

println " I don't accept"

println ' I don"t accept'

println ' I don\'t accept'

println " I dot \" I have \" accept"

*/


/*   
					Accessing single character
					==========================

str1 = "Hello"
println str1[0]
println str1[-1]


*/


/* 
					Slicing in string
					==================

str1 = "I have apple"
println str1[0..5]    // in groovy we use .. instead : in python for range

// If we index higher than the string length it will say index out of bound


*/


/* 
				To get String length
				=====================
				
str1 = "I have apple"
len = str1.length()
println " Total length of string is: $len"

*/

/*

				Built in method of string
				==========================

str1 = "I have apple"

str2 = " to eat"

println str1.toLowerCase()

println str1.toUpperCase()

println str1.reverse()

println str1.indexOf('h')

println str1.replace('a','A')

println str1.length()

println str1.substring(0,4)

println str1.split(" ")

println str1.toList()

println str1.split().join(" ")

*/

/* 
						Nesting method
						==============


file = "22Dec2023 192.161.1.10 80 192.161.1.11 88 web.cgi"

arr= file.split()[1..4].join(" ")

println arr


*/


/*
					TO take input from keyboard
					===========================

name = System.console().readLine "Enter a name:"
println "Name is $name"


num1 = System.console().readLine "Enter the number 1:"
num2 = System.console().readLine "Enter the number 2:"

sum1 = num1 + num2
println "Sum: $sum1"

*/

/* 
					Typecasting
					============
					
* We can use toInteger() or as int to typecast from string to integer


n1 = num1.toInteger()
println n1.getClass()

n2 = num2 as int
s2 = n1+n2
println "Sum is: $s2"

// or

n1 =10
n2 = 20
println " sum is: ${n1 + n2}"


*/


/* 
Operators
============
============


				1.Airtmetic Operators
				===================

n1 =10
n2 = 20

n1 = n1 as int
n2 = n2 as int
println " sum is: ${n1 + n2}"
println " sub is: ${n1 - n2}"
println " mul is: ${n1 * n2}"
println " div is: ${n1 / n2}"
println " mod is: ${n1 % n2}"
println " exp is: ${n1 ** n2}"


//    Using BODMAS

x =10
y=3
z=4
sum1 = x+y*z

println "Sum1 is: $sum1"

sum2 = (x+y)*z
println "Sum2 is: $sum2"

*/


/*

							2. Relational Operators
						============================
						
n1 =10
n2 = 30

n1 =10
n2 = 30

println n1>n2
println n1<n2
println n1==n2
println n1!=n2


n1='abcd'
n2='bc'
println n1>n2
println n1<n2
println n1==n2
println n1!=n2


// in the above code first letter is compare it will comparing letter by letter by ascii key for string

					


*/

/*     
								String Repeatation
								=====================

x= 'a'
println x*3


*/


/* 
									String Concatenation
									====================
									
x = 'abc'
y='de'
z = x+y
println z

*/


/*
=======================================================================================
=====================================================================================
*/

										/*  COnditional Statements*/


/* 

simple if:
==========

n1 = System.console().readLine " Numbser is:"
n1 = n1 as int
if(n1>0)
{
	println "is positive"
}


*/





/*    
If esle Statements 
===================

n1 = System.console().readLine " Numbser is:"
n1 = n1 as int
if(n1>0)
{
	println "positive"
}
else
{
	println "negative"
}


// Example 1

n1 = System.console().readLine " Number is:"
n1 = n1 as int

if(n1%2 ==0 )
{
		println " EVEN "
}
else
{
		println " ODD "
}


//Example 2
n1 = System.console().readLine " Number is:"
n1 = n1 as int

if(n1>99  && n1<1000)
{
		println " Yes "
}
else
{
		println " No "
}



 */
 

/* 
										Ladder if
										==========

n1 = System.console().readLine " Numbser is:"
n1 = n1 as int
if(n1>0)
{
	println "positive"
}
else if(n1 ==0)
{
println "Zero"
}
else
{
	println "negative"
}

*/

/*

println "\n\n\n\n\t\t\t\tFood Menu\n\t\t\t\t**** ****\n1. Veg Menu\n2. Non-Veg Menu\n3. Jain Menu\n\n"

option = System.console().readLine "Enter the choice:"
option = option as int
if(option == 1)
{
	println "\n1. Veg briyani\n2. Sambar rice\n3. Curd rice\n4. Simply wasted"
}
else if(option ==2)
{
	println "\n1. Chicken briyani\n2. Mutton Biryani\n3. Egg Biryani"
}
else
{
	println "\n1. Idly\n2. Dosa\n3. Chapathi\n4. Simply wasted"
}



num1 = System.console().readLine "Enter the number 1 value:"
num2 = System.console().readLine "Enter the number 2 value:"

num1 = num1 as int 
num2 = num2 as int

println "\n\t\t\t\tAirthmetic Operations\n1. Add\n2. Sub\n3. Mul\n4. Div\n5. Mod\n6.Exp\n"

choice = System.console().readLine "Enter your choice:"
choice = choice as int

if(choice == 1)
{
	println "Add of $num1 and $num2 is: ${num1+num2}"
}
else if(choice ==2)
{
	println "Sub of $num1 and $num2 is: ${num1-num2}"
}
else if(choice ==3)
{
	println "Mul of $num1 and $num2 is: ${num1*num2}"
}
else if(choice ==4)
{
	println "Div of $num1 and $num2 is: ${num1/num2}"
}
else if(choice ==5)
{
	println "Mod of $num1 and $num2 is: ${num1%num2}"
}
else if(choice ==6)
{
	println "Exp of $num1 and $num2 is: ${num1**num2}"
}
else
{
	println "Invalid Number\nTata Bye"
}


num = 10

while(num>0)
{
	println num
	--num
}

num = 1

while(num<=10)
{
	println num
	++num
}


num1 =1 
while(num1<=10)
{
	if(num1==5)
	{
		num1++
		continue
	}
	println num1
	num1++
}


while(true)
{
	num1 = System.console().readLine "Enter the number"
	num1 = num1 as int
	if(num1<1)
	{
		continue
	}
	else if(num1 ==0)
	{
		break
	}
	else
	{
		result = num1 **2
		println result
	}
}


*/



