
public class StaticInnerDemo {
	
	static class InnerClass{
		
		static void show() {
			System.out.println("This is show()");
		}
		
		void show1() {
			System.out.println("This is show1()");
		}
	}

	static void print() {
		System.out.println("This is print()");
	}
	
	public static void main(String[] args) {
		print();
		
		StaticInnerDemo.InnerClass.show();
		
		StaticInnerDemo.InnerClass i = new StaticInnerDemo.InnerClass();
		i.show1();
	}
}
