package operators;

public class O001_Unary {

		public static void main(String[] args) {
			
			
			// ++pre,--pre,post++,post--
			
			int a = 10; //8
			int b = a-- + --a + a++ - a--;
			        
			      
			System.out.println(a); //8    
			System.out.println(b); //17 9    17
			 
		}
}
