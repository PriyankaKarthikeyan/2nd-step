package com.exertwo.code;

public class MemberVariable {
    public static String[] displayProperties(String[] strArr) {

        Member memObj = new Member();
        memObj.age = 30;
        memObj.name = "Harry Potter";
        memObj.sal = (float) 2500.3;
        String str = strArr[0].concat(memObj.name).concat(",").concat(strArr[1]).concat(Float.toString(memObj.sal))
                .concat(",").concat(strArr[2]).concat(Integer.toString(memObj.age));
        return str.split(",");
    }
}