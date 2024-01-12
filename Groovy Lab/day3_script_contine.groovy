// 													Object Oriented Programming

class Employee
{
	def emp_id=101         // static variable outside method inside the class it should be def
	def emp_name='ABC'
	def salary=1000
		
	def display() 
	{
		def dept = 'Trainee'
		def result = emp_id+" "+emp_name+" "+salary+" "+dept
		return result
	}
	
}

Employee emp = new Employee()
println emp.display()
