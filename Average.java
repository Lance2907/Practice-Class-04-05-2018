import java.util.Scanner;
public class Average {
public static void main (String[]args){
Scanner scan=new Scanner (System.in);
int [] numbers= {17,18,45,72,28};
       // calculate sum or all array elements
int sum=0;
for (int i=0; i< numbers.length; i++ )
	sum =sum + numbers[i];
	 // calculate average value
		
	double average = sum / numbers.length;
			System.out.println("Average value of the array elements is " + average);	
}
}
