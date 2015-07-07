package hellograils

import entity.Person
import javax.servlet.http.HttpServletRequest
import yoyoyo.NonDomainClass

class HelloController {

    def index() { 
		// render "hello world!"
		// makes a new prototype-scoped bean
		def person = new Person(firstName: 'Ke', lastName: 'Tone')
		println "lalala" + com.iasia.config.iasiaprotocol.iAsiaProtocolConfig.EXCHANGE_NAME_HK_STOCK
		// request attributes for the gsp page. 
		[person: person]
		
	}
	
	def hi() {
		
		// Over 30 methods are mixed into controller classes with AST transformations
		// this is one.
		HttpServletRequest req = getRequest()
		println "The context path is " + req.contextPath
		
		// this goes to utils/UnderscoreCodec.groovy
		render "HowAreYou".encodeAsUnderscore()
	}
	
	def personList() {
		def list = []
		list << new Person(firstName: 'John', lastName:'Doe', age:50)
		list << new Person(firstName: 'Jane', lastName:'Smith', age:45)
		list << new Person(firstName: 'Sam', lastName:'Robinson', age:47)
		[ list:list ]
	}
	
	def personForm() {
		Person person = new Person(age:55)
		[ person:person ]
	}
	
	def gsp() {
		
	}
	
	def anotherGsp() {
		render (view: 'gsp.gsp')
	}
	
}
