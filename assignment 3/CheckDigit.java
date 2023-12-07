/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author: Madiha Abdul Maajid, maa525, maa525@scarletmail.rutgers.edu
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/
  public class CheckDigit {
      public static void main (String[] args) {
  
          String number = args[0];
          // System.out.println("hihihthe number we are recieving is"+ number);
          
          int num2 = 0;
          int num1 = 0;
  
          // String number = num + "";
          // System.out.println("the number "+ number + " sent is of length: "+ number.length());
          for (int i = number.length()-1; i >= 0; i--) {
              if (number.length() == 13 && i%2 == 0) {
              //   System.out.println("length of number is 13");
                 String current = number.charAt(i) + "";
                  num1 += Integer.parseInt(current);
              }
              else if (number.length() == 12 && i%2 != 0) {
                  String current = number.charAt(i) + "";
                  num1 += Integer.parseInt(current);
              }
          }
  
          for (int i = number.length()-1; i >= 0; i--) {
              if (number.length() == 13 && i%2 != 0) {
                 String current = number.charAt(i) + "";
                  num2 += Integer.parseInt(current);
              }
              else if (number.length() == 12 && i%2 == 0) {
                  String current = number.charAt(i) + "";
                  num2 += Integer.parseInt(current);
              }
          }
  
        // System.out.println("First Number: " + num1); // output for num 1 loop
        // System.out.println("Second Number: " + num2); // output for num 2 loop
  
          String string_num1 = String.valueOf(num1); // converting num 1 to string

          String str_num1_ones = "";
          if (string_num1.length()>1){
            str_num1_ones = string_num1.substring(1); // removing first number from sum
        }else{
            str_num1_ones = string_num1;
        }

          
          int num1_int = Integer.parseInt(str_num1_ones); // converting ones string to int
         // System.out.println("First Num Ones: " + num1_int); // int output
  
          String string_num2 = String.valueOf(num2); // converting num2 to string
          String str_num2_ones = "";
          if (string_num2.length()>1){
            str_num2_ones = string_num2.substring(1); // removing first number from sum
        }else{
            str_num2_ones = string_num2;
        }

          int num2_int = Integer.parseInt(str_num2_ones); // converting num 2 to int
         // System.out.println("Second Num Ones: " + num2_int);
          // + "cheking...."+ (num2_int+1) ); // int output
          
  
          int num2_times_3 = num2_int*3; // multiplying int 2 by 3
         // System.out.println("after mult by 3 " + num2_times_3);
  
  
          String num2_x3 = String.valueOf(num2_times_3); // converting new int 2 to string
         // System.out.println("after converting to string " + num2_x3);
  
          String num2_x3_ones = "";
          if (num2_x3.length()>1){
              num2_x3_ones = num2_x3.substring(1); // removing first number from new num 2 string
            //  System.out.println("after getting ones digit " + num2_x3_ones);
          }else{
              num2_x3_ones = num2_x3;
          }
          
  
          int num2_final = Integer.parseInt(num2_x3_ones); // converting new string 2 to int
  
          int final_int = num2_final+num1_int; // adding int 1 and int 2
         // System.out.println("Final Sum: "+ final_int);
  
        String almost_final_string = String.valueOf(final_int); // converting int 1 + int 2 to string
        String final_string = "";
        if (almost_final_string.length()>1){
            final_string = almost_final_string.substring(1); // removing first number from sum
        }else{
            final_string = almost_final_string;
        }

        
        int final_int1 = Integer.parseInt(final_string);
        System.out.println(final_int1);

  
       
      }
  }