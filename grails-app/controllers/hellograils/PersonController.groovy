package hellograils

import entity.Person

class PersonController {

	// the variable name is VERY IMPORTANT here... it decides whether to link this to a service or not.
	PersonService personService 
	
    def index() { 
		personService.doSomething()
		def persons = Person.list()
		[persons:persons]
	}
	
	def personForm() {
		
	}
	
	def save() {
		def person = new Person(params)		// the "params" come out from nowhere
		def person2 = person.save()
		println person2
		if(!person2) {						// null checking
			render person.errors
			return
		}
		render person ?: "Shxt!"			// the if-then-else trilogy
	}
	
	def findFamilyMembers() {
		println params.family
		// METHOD 1: Dynamic finders
		// find = findOne by default
//		List<Person> results = Person.findAllByLastName( params.family )
//		results.sort { it.firstName };
		
		// METHOD 2: There is also a new querying option that was added in Grails 2.0: where queries (detachedCriteria)
		def query = Person.where { 
			lastName == params.family
		}.order("firstName" , "desc")
		List<Person> results = query.findAll()
		
		// the more verbose way, or the only way to avoid making a duplicate findFamilyMembers.gsp out of index.gsp
		render(view: 'index', model: [persons: results])
	}
	
}
