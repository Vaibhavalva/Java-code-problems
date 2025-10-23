package codingtask;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=34576;
		int rev=0;
		while(num!=0)
		{
			int dig=num%10;
			rev=rev*10+dig;
			num=num/10;
		}
         System.out.println(rev);
	}

}
