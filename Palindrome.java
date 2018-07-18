package com.exertwo.code;


public class Palindrome {


        public int checkPalindrome(int number) {
            int palindrome = number; // copied number into variable
            int reverse = 0;

            while (palindrome != 0)

            {
                int remainder = palindrome % 10;
                reverse = reverse * 10 + remainder;
                palindrome = palindrome / 10;
            }
            return reverse;


            // if original and reverse of number is equal means
            // number is palindrome in Java

        }
        public int powerOfFour(int fnumber)
        {

            if(fnumber == 0)
                return 0;
            while(fnumber != 1)
            {
                if(fnumber % 4 != 0)
                    return 0;
                fnumber = fnumber / 4;
            }
            return 1;
        }
    public static boolean isEven(int number)
    {
     if(number%2==0)
         return true;
     else
         return false;
     }
    public long printLongFactorials(long input,long factorial) {

        while (true) {
            System.out.printf("The factorial of %1$d is is %2$d.\n", input, factorial);
            if (Long.MAX_VALUE / factorial < (input + 1)) {
                System.out.printf("The factorial of %d is out of range.\n", (input + 1));
                break;
            }
            input++;
            factorial *= input;
        }
        return factorial;
    }
    public int printIntFactorials(int i, int fn)
    {
        while (true)
        {
            System.out.printf("The factorial of %1$d is is %2$d.\n", i, fn);
            if (Integer.MAX_VALUE / fn < (i+1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i+1));
                break;
            }
            i++;
            fn *= i;

        }
        return fn;
    }


    }

