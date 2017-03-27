package test01;
//¸´ÖÆÊý×é£¨System.arraycopy(aFromSrc,index,ToDestination,start,num)£©
import java.util.Arrays;

public class arrayCopy {
public static void main(String[] args) {
	int[] arr={1,2,3,4,5,6,7,8};
	int[] arr1=new int[4];
	System.arraycopy(arr, 1, arr1, 0, 3);
	System.out.println(Arrays.toString(arr1));
}
}
