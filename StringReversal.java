public class StringReversal {
    public static String reverseString(String str) {
       
        if (str.isEmpty() || str.length() == 1) {
            return str;
        } else {
            char firstChar = str.charAt(0);
            String restOfString = str.substring(1);
            return reverseString(restOfString) + firstChar;
        }
    }

    public static void main(String[] args) {
        String input = "Anjali Franky";
        String reverse = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reverse);
}
}