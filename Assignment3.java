package day1;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] empInfo = {{1001,4,5},{1002,4,5}};
		for(int outerLoop=0;outerLoop<2;outerLoop++)
		{
			for(int innerLoop=0;innerLoop<3;innerLoop++){
				System.out.println(empInfo[outerLoop][innerLoop]);
			}			
		}
	}
}
