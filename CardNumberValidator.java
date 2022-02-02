// Card-Number-Validator
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CardNumberValidator {
	
	public static String cardNumberValidator(String cardNumberString)
	{

		System.out.println(cardNumberString);
		String[] stringArray = cardNumberString.split("");
		
		List<Integer> l1= new ArrayList<Integer>();
		
		for(int i=0; i<stringArray.length;i++)
		{
			if (i%2 == 0 || i == 0)
			{
				int n = Integer.parseInt(stringArray[i])*2;
				
				if(n>9)
				{
					String[] doubleArray = Integer.toString(n).split("");
					
					int sum = Arrays.stream(doubleArray).mapToInt(num -> Integer.parseInt(num)).sum();
					
					l1.add(sum);
				}
				else
				{
					l1.add(n);
				}
			}
			else
			{
				l1.add(Integer.parseInt(stringArray[i]));
			}
		}
		int total = l1.stream().mapToInt(num -> (num)).sum();
		
		System.out.println(total);
		
		return total%10 == 0? "Card is valid.":"Card is not valid!";
			
	}

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(cardNumberValidator("3141592653589793"));

	}

}
