import java.util.Scanner;

public class NumberToWords {
   public static String digitToWord(int digitIn) { 
      String digitWord = "";
      int numVal = digitIn % 10;

      if (numVal == 0){
         digitWord = "zero";
      }
      else if (numVal == 1){
         digitWord = "one";
      }
      else if (numVal == 2){
         digitWord = "two";
      }
      else if (numVal == 3){
         digitWord = "three";
      }
      else if (numVal == 4){
         digitWord = "four";
      }
      else if (numVal == 5){
         digitWord = "five";
      }
      else if (numVal == 6){
         digitWord = "six";
      }
      else if (numVal == 7){
         digitWord = "seven";
      }
      else if (numVal == 8){
         digitWord = "eight";
      }
      else if (numVal == 9){
         digitWord = "nine";
      }

      return digitWord;
   } 
   
   public static String tensDigitToWord(int digitIn) { 
      String digitWord = "";
      int tens = digitIn / 10;

      if (tens == 2){
         digitWord = "twenty";
      }
      else if (tens == 3){
         digitWord = "thirty";
      }
      else if (tens == 4){
         digitWord = "forty";
      }
      else if (tens == 5){
         digitWord = "fifty";
      }
      else if (tens == 6){
         digitWord = "sixty";
      }
      else if (tens == 7){
         digitWord = "seventy";
      }
      else if (tens == 8){
         digitWord = "eighty";
      }
      else if (tens == 9){
         digitWord = "ninety";
      }
      
      return digitWord;
   } 
   
   public static String twoDigitNumToWords(int numIn) { 
      
      //FINISH
      return "finish twoDigitNumToWords";
   } 
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      System.out.println("Please insert a number less than 10");
      int input = scnr.nextInt();
      
      System.out.println (tensDigitToWord(input) + " " + digitToWord(input));
   }
}
