
interface Anonymous{
	void show();
	void print();
}

public class AnonymousDemo {
	public static void main(String[] args) {

		Anonymous an = new Anonymous() {
			
			@Override
			public void show() {
				System.out.println("This is show()");
			}

			@Override
			public void print() {
				System.out.println("This is print()");
			}
		};
		
		an.show();
		an.print();
	}
}
