public class StringFunctions {
    public void reverse_string(String input)
    {
         // conversion from String object to StringBuffer
         StringBuffer sbr = new StringBuffer(input);
         // To reverse the string
         sbr.reverse();
         System.out.println(sbr);
    }

    public void find_len(String input)
    {
        int len=input.length();
        System.out.println(len);
    }
}