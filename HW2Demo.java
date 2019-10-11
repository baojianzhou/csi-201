import java.util.Scanner;
/**
 * Auto Generated Java Class.
 */
public class HW2Demo {
  
  public static void main(String []args){
    String secretWord = "test"; // the secret word
    Scanner input = new Scanner(System.in); // input object
    String inputStr; // your input String
    do{
    inputStr = input.nextLine(); // get user input
    if(findStr(inputStr,secretWord)){
      System.out.println("find "+secretWord+" in "+inputStr);
    }
    }while(!findStr(inputStr,"stop")); //while
  }
  
  public static boolean findStr(String inputStr, String key){
    boolean flag = false; // to check if key in inputStr
    if(inputStr.length() < key.length()){
     return flag;
    }
    // TODO: consider the whitespace!
    for(int i=0;i<inputStr.length()-key.length()+1;i++){
      boolean innerFlag = true;
      for(int j =0;j< key.length();j++){
        if(key.charAt(j) != inputStr.charAt(i+j)){
          innerFlag = false;
        }
      }
      if(innerFlag){
        flag = innerFlag;
        break;
      }
    }//outer for
    return flag;
  }
}
