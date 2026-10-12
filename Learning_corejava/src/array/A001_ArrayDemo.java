package array;

public class A001_ArrayDemo {
	public static void main(String[] args) {
		
		//declaration
		//int[] a = new int[7];
		
		//initialization
//		a[0] = 20;
//		a[1] = 40;
//		a[2] = 50;
//		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		
		
		int a[] = {10,20,30,40,50,60};
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		System.out.println("***************");
		
		String sub[] = {"java","python","node","php"};
		for (int i = 0; i < sub.length; i++) {
			System.out.println(sub[i]);
		}
		
		
	}
}
