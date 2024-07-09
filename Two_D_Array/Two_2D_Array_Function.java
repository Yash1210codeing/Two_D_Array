package Two_D_Array;
public class Two_2D_Array_Function {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [][]arr=new int [3][4];
        display(arr);
	}
	public static void display(int [][]arr) {
		// i=row;
		// j=col;
		// Row Length=arr.length;
		// Col length=arr[0].length   Any Index Number start
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");				
			}
			System.out.println();
		}		
	}
}
