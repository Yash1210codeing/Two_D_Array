package Two_D_Array;
public class Two_D_Array_Set_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [][]arr=new int[3][4];
        System.out.println(arr);	
        System.out.println(arr[1]);
        System.out.println(arr[0]);
        System.out.println(arr[1][2]);        
        int [][]other=arr;
        Display(arr);
	}
	public static void Display(int[][]brr) {
		// int r=brr.length;
		// int c=brr[0].length;
		for(int i=0;i<brr.length;i++) {
			for(int j=0;j<brr[0].length;j++) {
				System.out.print(brr[i][j]+" ");
			}
			System.out.println();
		}
	}
 }
