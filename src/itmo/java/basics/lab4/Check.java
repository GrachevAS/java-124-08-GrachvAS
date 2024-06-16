package itmo.java.basics.lab4;

import java.util.Arrays;

public class Check {
    public static boolean checkSum(int operand1, int operand2, int operand3) {
        if (operand1 + operand2 == operand3) return true;
        else return false;
    }

    public static boolean checkBigger(int operand1, int operand2, int operand3) {
        if ((operand2 > operand1) && (operand3 > operand2)) return true;
        else return false;
    }
    public static boolean checkArray(int[] array, int chekNum){
        if ((array!=null)||(array.length>=2)) {
            if ((array[0]==chekNum)||(array[array.length-1]==chekNum)) return true;
            else return false;
        }
        else return false;
    }
    public static boolean chackArrayContain (int[] array, int chekNum1, int chekNum2){
        boolean flag = false;
        if (array!=null) {
            for (int i=1; i<array.length; i++)
                if ((array[i]==chekNum1)||(array[i]==chekNum2)) flag=true;
        }
        if (flag) return true;
        else return false;
    }
    public static boolean chackArraySort (int[] array){
        int bigger = array[0];
        if (array!=null){
            for (int i=1; i<array.length; i++){
                if (array[i]>=bigger) {
                    bigger = array[i];
                    if (i == array.length - 1) return true;
                }
                else return false;
            }
        }
        return false;
    }
    public static int FirstUnique (int[] array){
        for (int i = 0; i < array.length; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length && flag; j++)
                flag = (i == j || array[i] != array[j]);
             if (flag) return array[i];
        }
       return -1;
    }
}