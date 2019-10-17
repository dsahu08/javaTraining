package day1;

public class Assignment2 {

	public static void main(String[] args) {
		int empNumberId[]={1001,1002,1003,1004,1005};
		float customer1Feedback[]={4.1f,3.8f,4.5f,4.9f,3.9f};
		float customer2Feedback[]={1.0f,2.0f,3.0f,4.0f,5.0f};
		float customer3Feedback[]={5.5f,6.5f,4.5f,3.5f,2.5f};
		float[] averageFeedback = new float[5];
		char[] grade = new char[5];
		for(int i=0;i<5;i++)
		{
			averageFeedback[i]= (customer1Feedback[i]+customer2Feedback[i]+customer3Feedback[i])/3;
		}
		
	}

}
