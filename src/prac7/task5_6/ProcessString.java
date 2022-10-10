package prac7.task5_6;

public class ProcessString implements StringRef
{
    @Override
    public int getCount(String str) {
        return str.length();
    }

    @Override
    public String refString(String str) {
        StringBuilder temp_str = new StringBuilder();
        temp_str.append(str.charAt(0));
        for(int i = 1; i < str.length(); i++)
        {
            temp_str.append(" " + str.charAt(i));
        }
        return temp_str.toString();
    }

    @Override
    public String reverse(String str) {
        StringBuilder st = new StringBuilder(str);
        return st.reverse().toString();
       /* for(int i = 0; i < (str.length()/2); i++)
        *{
         *   char temp = st.charAt(i);
           * st.setCharAt(i, st.charAt(str.length() - i- 1));
          *  st.setCharAt(str.length()-i-1, temp);
        *}
        *return null;
        */
    }
}
