
public class JavaEx07 {
	public static void main(String[] args) {
		/*
		 *
		 **
		 ***
		 ****
		 *****
		 ****
		 ***
		 **
		 */
//		방법 1
		for(int i = 0; i <5; i++) {
			for(int j = 0; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i <4; i++) {
			for(int j = 0; j < 4 - i; j++){
				System.out.print("*");

			}
			System.out.println();
		}
//		방법2
		int n = 0;
		for(int j = 0; j < 9; j++) {
			if( j < 5) n++;
			else	   n--;
			for(int  i = 0; i < n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 **
		 *****
		 ***
		 **
		 *****
		 ****
		 */
		System.out.println();
		int array[] = {2, 5, 3, 1, 6, 5};
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}










