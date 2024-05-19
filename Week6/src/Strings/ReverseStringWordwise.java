package Strings;

public class ReverseStringWordwise {
	public static String reversestring(String input)
	{
		String output="";
		int i=0, startchar=0,endchar=0;
		while(i<input.length())
		{
			if(input.charAt(i)==' ')
			{
				endchar=i;
				String wordtoappend=input.substring(startchar, endchar);
				if (!output.isEmpty()) {
                    output = wordtoappend + " " + output;
                } else {
                    output = wordtoappend;
                }
                startchar = i + 1;
			}
			if (i == input.length() - 1) {
                endchar = i + 1;
                String wordtoappend = input.substring(startchar, endchar);
                if (!output.isEmpty()) {
                    output = wordtoappend + " " + output;
                } else {
                    output = wordtoappend;
                }
            }
			i++;
		}
		return output;
	}

	public static void main(String[] args) {
		String input="Hallo ich bin Tweety";
		String output=reversestring(input);
		System.out.println(output);

	}

}
