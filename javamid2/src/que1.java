

public class que1 {
    public static void main(String[] args) {

        //Stores the reverse of given string
        String reversedStr = "";

        //Iterate through the string from last and add each character to variable reversedStr
        for (int i = args.length - 1; i >= 0; i--) {
            reversedStr = reversedStr + args[i];
        }


        //Displays the reverse of given string
        System.out.println("Reverse of given string: " + reversedStr);
    }
}
