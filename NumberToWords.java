import java.util.Scanner;

public class NumberToWords {
   //turn numbers 0-9 into words
   public static String digitToWord(int digitIn) {
        String digitWord = "";

        String[] ones = {"zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine"};
        digitWord = ones[digitIn];

        return digitWord;
    }

   //turn numbers 10-19 into words
   public static String teensDigitToWord(int digitIn) { 
      String digitWord = "";

        String[] tens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen"};

        int i = digitIn % 10;
        digitWord = tens[i];
      
      return digitWord;
   } 

   //turn numbers 20,30,40,50,60,70,80,90 into words
   public static String DoubleDigitToWord(int digitIn) {
        String digitWord = "";

        String[] multiple = {"", "", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"};

        int i = digitIn / 10;
        digitWord = multiple[i];

        return digitWord;
    }

   //combine ones digit and tens digit to make one string
   public static String twoDigitNumToWords(int numIn) {
        String digitWord = "";

        if (numIn < 10){
            digitWord = digitToWord(numIn);
        }
        else if (numIn < 20){
            digitWord = teensDigitToWord(numIn);
        }
        else if (((numIn % 10) == 0) && (numIn < 100)) {
            digitWord = DoubleDigitToWord(numIn);
        }
        else if (numIn < 100){
            digitWord = (DoubleDigitToWord(numIn)) + " " + (digitToWord(numIn % 10));
        }
        else{
            digitWord = "Unexpected Number";
        }

        return digitWord;
    }

   //recursion method, continue until number 100 or above is attempted
   public static void numberInput (Scanner scnr){
        int value = scnr.nextInt();
        if (value < 100){
            System.out.println (twoDigitNumToWords(value));
            System.out.println("Please insert a number less than 100");
            numberInput(scnr);
        }
        else{
            System.out.println("Unexpected Number");
        }
    }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      System.out.println("Please insert a number less than 10");
      
      numberInput(scnr);
      scnr.close();
   }
}
