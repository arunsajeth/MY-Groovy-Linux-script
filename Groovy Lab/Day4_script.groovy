/*

											// 	OBJECT ORIENTED PROGRAMMING
											// ===========================

// Example1
class Employee
{
	def emp_id=101         // static variable outside method inside the class it should be def
	def emp_name='ABC'
	def salary=1000			// static variable
		
	def display() 
	{
		def dept = 'Trainee'
		def result = emp_id+" "+emp_name+" "+salary+" "+dept
		return result
	}
	
	def display1()
	{
		try{
			return dept    // 
		}catch(Exception e){
			return "Def declared in the method cannot be accessed"
		}
	}
}
Employee emp = new Employee()
println emp.display()
println emp.display1()
println emp.emp_id        // class level variable can be accessed 
//println emp.dept          // variable inside the method cannot be accessed


// Example2:

class x{
	def a
	final pi =3.14
	
	def x(a)						// parameterized constructor we can use def or not 
	{
		println "Constructor is called"
		this.a = a
		println "A value is $a"
	}
	
	def m1()
	{
		this.a=100     // instance variable
		println "Using this $a"
		def b = 200		// local variable
		println "Using def $b"
		//c =300			// Always use def keyword
		//println "Normal $c"
	}
}
x1 = new x(9090)		
x1.m1()
//x1.pi =3.147		// final value cannot re initialized
println "final pi value is ${x1.pi}"

// Example3: Banking

class Banking
{
	final bank_name = 'SBI'
	def cus_accno
	def cus_name
	def cus_balance
	
	def Banking(cus_accno,cus_name,cus_balance)
	{
		this.cus_accno = cus_accno
		this.cus_name = cus_name
		this.cus_balance = cus_balance
	}
	
	def withdraw(amount)
	{
		if(amount>this.cus_balance)
			return "Low Balance"
		else
		{
			this.cus_balance = this.cus_balance - amount
			return "Amount debited"
		}
		
	}
	
	def deposit(amount)
	{
		this.cus_balance = amount + this.cus_balance
		return "Amount credited"
	}
	
	def balenq()
	{
		return "Balance: ${this.cus_balance}"
	}
	
	def customerdetails()
	{
		return "Bank name: ${bank_name} \nAccountno: ${this.cus_accno}\nName: ${this.cus_name}\nBalance: ${this.cus_balance}"
	}
	
	
}
bank1 = new Banking(10001,'Arun',1000)
println "Executing customerdetails method"
println bank1.customerdetails()
println "***********************"
println "Withdraw method"
println bank1.withdraw(2000)
println "***********************"
println "Deposit method"
println bank1.deposit(3000)
println "***********************"
println "Checking Balance"
println bank1.balenq()
println "***********************"
println "Withdraw method"
println bank1.withdraw(2000)
println "***********************"



// Combining java file and groovy file

import Hello

def demoinstance = new Hello()
demoinstance.message()


// THERE IS A VERSION PROBLEM WITH JAVA AND JVM

*/

