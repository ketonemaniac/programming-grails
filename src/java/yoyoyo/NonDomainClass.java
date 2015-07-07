package yoyoyo;

/**
 * This will be skipped by the grails parser
 * This is NOT a spring bean.
 * @author keithtung
 *
 */
public class NonDomainClass {

	class A {
		public void callMe() {
			System.out.println("called A");
		}
	}

	class B extends A {
		public void callMe() {
			System.out.println("called B");
		}
	}

	
	public void run() {
		A a = new B();		
		a.callMe();
	}
	
	public static void main(String [] asdf) {
		System.out.println("hello world!");
		new NonDomainClass().run();

		
	}
		
		
		
}
