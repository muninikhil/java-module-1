public class string {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String b="HELLO, WORLD!";
        System.out.println("The upper case version is: " + str.toUpperCase());
        System.out.println("The lower case version is: " + str.toLowerCase());
        System.out.println("The length of the string is: " + str.length());
        System.out.println("The character at index 7 is: " + str.charAt(7));
        if(str.equalsIgnoreCase(b)){
            System.out.println("The two strings are equal (ignoring case).");
        }
        else{
            System.out.println("The two strings are not equal.");
    }
}   
}
