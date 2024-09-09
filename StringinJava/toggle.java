package StringinJava;
import java.util.*;
import java.util.Scanner;
public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        System.out.println(s);

        //Qus:Given a String,the task is to toggle all the characters of the string i.e to convert Upper case to Lower case and vice versa.

        for(int i=0;i<s.length();i++){
            boolean flag = true;//capital
            char ch = s.charAt(i);//A
            if(ch==' ')continue;
            int ascii = (int)ch;//65
            if(ascii>=97)flag = false;//small

            if(flag==true){
                ascii+=32;//Because A ascii value is 65,and a ascii value is 97,so the diff of (A-a) is 97-65=32.
                char dh = (char)ascii;//a
                s.setCharAt(i,dh);

            }else{
                ascii-=32;
                char dh = (char)ascii;
                s.setCharAt(i,dh);
            }


        }
        System.out.println(s);

    }
}
