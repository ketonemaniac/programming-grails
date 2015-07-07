package entity

class Employee {

	String name
	String title 
	int age
	String department
	
	static belongsTo = [company: Company]
	
	// from the book: GORM supports data validation with the constraints DSL.
	static constraints = {
		name unique: true, blank: false
		title inList: ['P', 'AP', 'SA']
		age min: 5, max : 100
		department matches : '.*Office'
   }
}
