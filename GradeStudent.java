package com.exertwo.code;

public class GradeStudent {
    public static String[] findAvgMinMax(int numOfStuds,int[] grades) {
    float avg,total=0;
    for(int i=0;i<numOfStuds;i++) {
        total+=grades[i];
    }
    avg=(float)total/numOfStuds;
    int min=grades[0];
    for(int i=0;i<numOfStuds-1;i++) {
        if(grades[i]<grades[i+1])
            min=grades[i];
    }
    int max=grades[0];
    for(int i=0;i<numOfStuds-1;i++) {
        if(grades[i]>grades[i+1])
            max=grades[i];
    }
    String str="";
    str=str.concat(Float.toString(avg)).concat(",").concat(Integer.toString(min)).concat(",").concat(Integer.toString(max));
    return str.split(",");
}
}
