 class LastOccurrence
 {
public static void main(String[] args)
 {
        String myStr = "JAHNAVI";
        char searchChar = 'I';
        int lastIndex = myStr.lastIndexOf(searchChar);
        System.out.println("String: " + myStr);
        System.out.println("The last index of character '" + searchChar + "' in the string: " + lastIndex);
    }
}