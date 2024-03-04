
public class OuterClass {
	
	String name;
	
	public OuterClass(String name) {
		this.name = name;
	}
	
	//member class
	class InnerClass{
		
		void show() {
			System.out.println("This is show() of InnerClass : "+name);
		}
	}

	void print() {
		System.out.println("This is OuterClass print()");
	}
	
	public static void main(String[] args) {
		OuterClass oc = new OuterClass("Sudarshan");
		oc.print();
		
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.show();
		
		OuterClass oc1 = new OuterClass("Shiv");
		oc1.print();
		
		OuterClass.InnerClass ic1 = oc1.new InnerClass();
		ic1.show();

	}

}
