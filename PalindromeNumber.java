package codingtask;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=123;
		int rev=0;
		int original=num;
		while(num!=0)
		{
			int dig=num%10;
			rev=rev*10+dig;
			num=num/10;

	}
     if(original==rev)
     System.out.println("Palindrome");
     else
     System.out.println("Not Palindrome"); 
    	 
    		
    	 
     }
}
