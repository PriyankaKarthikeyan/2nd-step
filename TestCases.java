package com.exertwo.test;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.exertwo.code.Palindrome;
import com.exertwo.code.Member;
import com.exertwo.code.MemberVariable;
import com.exertwo.code.GradeStudent;
import com.exertwo.code.UpperCase;
import com.exertwo.code.ListFolders;
import com.exertwo.code.WordCounting;


import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class TestCases {

    private static Palindrome pal;
    private static MemberVariable memob ;
    private static GradeStudent grade;
    private static UpperCase uCase;
    private static ListFolders list;
    private static WordCounting wcnt;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        pal = new Palindrome();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
    pal =null;
    }
    @SuppressWarnings("deprecation")
    @Test
    public void testCheckPalindrome() {
        assertEquals("testCheckPalindrome(),check number is palindrome or not "
                , 101, pal.checkPalindrome(101));

    }
    @Test
    public void testCheckPalindromeFailure() {
        assertNotEquals("testCheckPalindrome(),check number is palindrome or not "
                , 123, pal.checkPalindrome(101));
    }

        @Test
    public void testPowerOfFour() {
        assertEquals("testPowerOfFour(),check number is power of four or not "
                , 1, pal.powerOfFour(16));

    }

    @Test
    public void testPowerOfFourFailure() {
        assertNotEquals("testPowerOfFour(),check number is power of four or not "
                , 0, pal.powerOfFour(16));

    }
    @Test
    public void testIsEven() {
        assertEquals("testIsEven(),check number is even number or not "
                , true, pal.isEven(16));

    }
    @Test
    public void testIsEvenFailure() {
        assertNotEquals("testIsEven(),check number is even number or not "
                , false ,pal.isEven(16));

    }

    @Test
    public void testMemberVariables() {
        assertArrayEquals(new String[]{"Members name:Harry Potter","member salary:2500.3","member age:30"},memob.displayProperties(new String[]{"Members name:","member salary:","member age:"}));
    }

    @Test
    public void testMemberVariablesFailure() {
        assertNotEquals(new String[]{"Members name:Harry Potter","member salary:2500.3","member age:30"},memob.displayProperties(new String[]{"Members name:","member salary:","member age:"}));
    }

    @Test
    public void testGradeStudent() {
        String[] expect={"81.5","65","98"};
        int[] array={86,65,98,77};
        String[] actual=grade.findAvgMinMax(4,array);
        assertArrayEquals(expect,actual);

    }

    @Test
    public void testGradeStudentFailure() {
        String[] expect={"81.5","65","98"};
        int[] array={86,65,98,77};
        String[] actual=grade.findAvgMinMax(4,array);
        assertNotEquals(expect,actual);

    }
    @Test
    public void testFileUpperLength() {
        String expect = "WELCOME TO JAVA";
        assertEquals(expect, uCase.changeToUpper("/home/priyanka/dhoni/kp.txt"));
        assertEquals("16.0", uCase.Length("/home/priyanka/dhoni/kp.txt"));

    }
    @Test
    public void testFactorial() {


        assertEquals("to generate factorial upto 12", 479001600, pal.printIntFactorials(1, 1));
        assertEquals("to gnerate factorial upto 20", 2432902008176640000L, pal.printLongFactorials(1, 1));
    }
    @Test
    public void testFileFilter() {
        File folder = new File("/home/priyanka/test");
        assertEquals("test2test1",list.listFilesForFolder(folder));

    }

    @SuppressWarnings("static-access")
    @Test
    public void testMain() throws FileNotFoundException {
        assertEquals("{sleep=1, a=2, like=1, have=1, i=3, man=1, to=1, am=1, ,=2, .=1, home=1}",wcnt.main(null));
    }

}

