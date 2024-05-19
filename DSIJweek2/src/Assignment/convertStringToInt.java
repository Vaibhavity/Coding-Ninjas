package Assignment;

public class convertStringToInt {
	private static int convertStringToInt(String input, int len)
	{	
		if (len == 0) {
            return 0;
        }
        char c = input.charAt(len - 1);
        int digit = Character.getNumericValue(c);
        return digit * (int) Math.pow(10, input.length() - len) + convertStringToInt(input, len - 1);
	}
	public static int convertStringToInt(String input)
	{
		int len=input.length();
		return convertStringToInt(input,len);
	}
	

	public static void main(String[] args) {
		String input="00001232";
		System.out.print(convertStringToInt(input));
		

	}

}
