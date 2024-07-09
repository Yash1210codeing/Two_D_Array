package Two_D_Array;
import java.util.*;
public class Users_Input_2D_Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]arr=new int [r][c];
        for(int i=0;i<arr.length;i++) {  //i=row
        	for(int j=0;j<arr[0].length;j++) {  //j=col
        		arr[i][j]=sc.nextInt();
        }
	}
        display(arr);        
	}
	public static void display(int [][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
