package entity

class Company {

	String companyCode
	static hasMany = [employees: Employee]
	
    static constraints = {
    }
}
