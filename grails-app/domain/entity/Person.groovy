package entity

class Person {

	String firstName
	String lastName
	int age
	
	// custom validator
    static constraints = {
		age min: 16
		lastName validator : { val -> val.length() >= 4 }
    }
}
