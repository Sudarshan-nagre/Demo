
public class LocalInnerClassDemo {
	
	void show() {
		
		System.out.println("This is show()");
		
		class LocalClass{
			void print() {
				System.out.println("This is LocalClass print()");
			}
		}
		LocalClass lc = new LocalClass();
		lc.print();
		
		System.out.println("End of show()");
	}

	public static void main(String[] args) {
		LocalInnerClassDemo d = new LocalInnerClassDemo();
		d.show();
		
	}
}
