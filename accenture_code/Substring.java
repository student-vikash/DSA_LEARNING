package accenture_code;

public class Substring
{
    // method to find isSubstring or not
    public static boolean isSubstring(String mainString,String subString)
    {
        if(subString.isEmpty())
            return true;

        return mainString.indexOf(subString) != -1;
    }
    public static void main(String[] args) {
        String mainString = "Hello, World!";
        String subString = "World";

        if (isSubstring(mainString, subString)) {
            System.out.println("\"" + subString + "\" is a substring of \"" + mainString + "\".");
        } else {
            System.out.println("\"" + subString + "\" is not a substring of \"" + mainString + "\".");
        }
    }
}
