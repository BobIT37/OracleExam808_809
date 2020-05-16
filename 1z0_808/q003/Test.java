package com.wealth.certificate.dumps_1z0_808.question003;

public class Test {
	public static void main(String[] args) {
		boolean isChecked = false;
		int arry[] = {1,3,5,7,8,9};
		int index = arry.length;
		/*while ( <code1> ) {
			if (arry[index-1] % 2 ==0) {
				isChecked = true;
			}
			<code2>
			}
			System.out.print(arry(index]+", "+isChecked));
		}*/
		
		//A
		/*while ( index > 0 ) {
			if (arry[index-1] % 2 ==0) {
				isChecked = true;
			}
		index--;
		}
		System.out.print(arry[index]+", "+isChecked);
		*/
		
		//B
		/*while ( index > 0 ) {
			if (arry[index-1] % 2 ==0) {
				isChecked = true;
			}
		--index;
		}
		System.out.print(arry[index]+", "+isChecked);*/
		
		//C
		/*while ( index > 5 ) {
			if (arry[index-1] % 2 ==0) {
				isChecked = true;
			}
		--index;
		}
		System.out.print(arry[index]+", "+isChecked);*/
		
		//D Error
		/*while ( index ) {
			if (arry[index-1] % 2 ==0) {
				isChecked = true;
			}
		--index;
		}
		System.out.print(arry[index]+", "+isChecked);*/
	}
}
