package hellograils

import grails.transaction.Transactional

@Transactional
class PersonService {

    def doSomething() {
		println 'yea you reached doSomething()'
    }
}
