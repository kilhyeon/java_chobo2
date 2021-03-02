package java_chobo2.ch14;

@FunctionalInterface
interface MyFunction {
//	void myMethod();
	void run();
}

public class LambdaEx03 {

//	public static void main(String[] args) {
//		MyFunction f = () -> System.out.println("MyMethod");
//		aMethod(f);
//		
//		aMethod(() -> System.out.println("MyTwoMethod()"));
//	}
//	
//	public static void aMethod(MyFunction f) {
//		f.myMethod();
//	}

	static void execute(MyFunction f) {
		f.run();
	}

	static MyFunction getMyFunction() {
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}

	public static void main(String[] args) {
		MyFunction f1 = () -> System.out.println("f1.run()");

		MyFunction f2 = new MyFunction() {
			@Override
			public void run() {
				System.out.println("f2.run()");

			}
		};
		
		MyFunction f3 = getMyFunction();
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute( () -> System.out.println("run()"));
	}

}
