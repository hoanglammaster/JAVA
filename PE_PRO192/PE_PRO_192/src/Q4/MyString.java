/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4;

import java.util.regex.Pattern;

/**
 *
 * @author hoang
 */
public class MyString implements IString{

    @Override
    public int f1(String str) {
        int sum = 0;
        for(int i = 0; i< str.length(); i++){
            char isChar = str.charAt(i);
            if(true ==Pattern.matches("\\d", String.valueOf(isChar))){
                sum+=Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return sum;
    }

    @Override
    public String f2(String str) {
        /*•	f2: return the string s, which is obtained by reading all characters in str, 
        if a character is a digit between 0 and 8 then increase it by 1 
        (others characters are unchanged). E.g., if  str=”a01b2c8d9” then s = ”a12b3c9d9*/
        for(int i = 0; i< str.length(); i++){
            char isChar = str.charAt(i);
            if(true == Pattern.matches("[0-8]",String.valueOf(isChar))){
                int isNum = Integer.parseInt(String.valueOf(isChar));
                isNum ++;
                str = str.substring(0, i) + String.valueOf(isNum) + str.substring(i+1);
            }
        }
        return str;
    }
    
}
