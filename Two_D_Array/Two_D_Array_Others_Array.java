package Two_D_Array;
public class Two_D_Array_Others_Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [][]arr=new int [3][4];
        System.out.println(arr);
        int [][]other=arr;
        System.out.println(other);
        other[1][2]=1;
        System.out.println(arr[1][2]);
	}
}
