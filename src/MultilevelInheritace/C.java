package MultilevelInheritace;
//test 1 and test 2
public class C extends B {
	public void test3() {
		System.out.println('g');
	}
	public static void main(String[] args) {
		C c1 = new C();
		
		c1.test1();
		c1.test2();
		
		c1.test3();
		c1.test4();
		
		
	}

}
