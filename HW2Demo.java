import java.util.Scanner;

/**
 * This HW2Demo code shows you how to check a keyword in a string.
 * This should NOT be treated as the solution of HW2.
 * There are at least two issues need to handle in this code. 
 * Please See TODO in the code.
 *
 * @author Baojian Zhou
 * @email bzhou6@albany.edu
 */
public class HW2Demo {

    public static void main(String[] args) {
        String secretWord = "test"; // the secret word, hard coded!
        Scanner input = new Scanner(System.in); // input object
        String inputStr; // your input String
        do {
            System.out.print("Give me your phrase: ");
            inputStr = input.nextLine(); // get user input
            // TODO: before call findStr() method, you need to make sure
            // inputStr and secretWord are all upper case or all lower case.
            if (findStr(inputStr, secretWord)) {
                System.out.println("find \"" + secretWord +
                        "\" in \"" + inputStr + "\"");
            }
        } while (!findStr(inputStr, "stop")); //while
    }

    public static boolean findStr(String inputStr, String key) {
        
        // TODO: you need to handle the whitespace!
        // For example, if inputStr="this is atest", and key is "test".
        // This method cannot handle it correctly! fix it!
        boolean flag = false; // to check if key in inputStr
        if (inputStr.length() < key.length()) {
            return false;
        }
        for (int i = 0; i < inputStr.length() - key.length() + 1; i++) {
            boolean innerFlag = true;
            for (int j = 0; j < key.length(); j++) {
                if (key.charAt(j) != inputStr.charAt(i + j)) {
                    innerFlag = false;
                }
            }
            if (innerFlag) {
                // TODO you may handle the whitespace here!
                // if the head, inputStr[i-1], of key found in inputStr is ' '
                // and if the tail of key found in inputStr is also ' '
                // then you can return true.
                // For example, if i == 0 and length of inputStr = key.length()
                // what if i!=0, check whether inputStr.charAt(i-1) is ' '
                // and check whether inputStr.charAt(i+key.length()) is ' '
                flag = true;
                break;
            }
        }//outer for
        return flag;
    }
}
