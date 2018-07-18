package com.exertwo.code;
import java.io.*;
import java.io.FileReader;
import java.io.BufferedReader;

public class UpperCase {

        public  static String changeToUpper(String path) {
            try {
                FileReader file = new FileReader(path);
                BufferedReader br = new BufferedReader(file);
                for (String line; (line = br.readLine()) != null;) {

                    String Upper = line.toUpperCase();
                    return Upper;
                }
                file.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        public static String Length(String path) {
            try {
                File f = new File(path);
                double len = f.length();
                String leng = Double.toString(len);

                return leng;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

    }

