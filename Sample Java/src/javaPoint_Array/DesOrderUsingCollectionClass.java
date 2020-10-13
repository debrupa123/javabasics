package javaPoint_Array;
import java.util.Arrays;
import java.util.Collections;
public class DesOrderUsingCollectionClass {

	public static void main(String[] args) {
		String[] veggie= {"Carrot","Lady Finger","Cabbage","Cauliflower"};
		System.out.println(Arrays.toString(veggie));
		Integer[] num= {5,9,1,7};
		System.out.println(Arrays.toString(num));
		//DescendingOrder using Collection class's reverseOrder() method
		Arrays.sort(veggie,Collections.reverseOrder());
		System.out.println(Arrays.toString(veggie));
		Arrays.sort(num,Collections.reverseOrder());
		System.out.println(Arrays.toString(num));
	}

}
