package StringinJava;
import java.util.Scanner;
import java.util.*;

public class StringBasictoAdv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//
//        System.out.println(s);

        //String p = "Vikas";
       // System.out.println(p.charAt(0));
        //System.out.println(p.indexOf('s'));

        // CompareTo()-> it's use to compare to string such as string str or gtr
        //if str == gtr -> ans would be 0
        //if str (lexographically)> gtr-> ans would be >0 or positive
        //if str (lexographically)< gtr-> ans would be <0 or negative

//        String q = "Pathak";
//        System.out.println(p.compareTo(q));

        //String s = "Maths";
        //System.out.println(s.contains("W"));
       // System.out.println(s.startsWith("Math"));
        //System.out.println(s.endsWith("ah"));

//        String T = "Wallah";
//        String Ans = s.concat(T);
//        System.out.println(Ans);

        //String s = "abc";
        //s+="xyz";
        //s+=10;
        //s+='r';
        //Or

        //System.out.println(s);
        //System.out.println("abc"+"xyz"+10+'r');
        //System.out.println("abc"+"xyz"+10+20);
        //System.out.println("abc"+(10+20));
        //System.out.println(10+20+"abc");

        //Substring(i,j)or Substring(i)

        //String s = "Vikas";
        //System.out.println(s.substring(1,4));
        //System.out.println(s.substring(0));

//        String s = "physics";
//        for(int j=2;j<4;j++){
//            System.out.print(s.substring(j));
//        }

        //Print all the substrings of String "abcd";

//        String str = "abcd";
//        for(int i=0;i<=3;i++){
//            for(int j=i+1;j<=4;j++){
//                System.out.print(str.substring(i,j)+" ");
//
//            }
//        }

        //Str.equals()

//        String s = "hello";
//        String t = "hello";
//        String u = new String("hello");
//        //System.out.println(s.equals(u));
//        System.out.println(s.equals(t));

        //String builder()

//        StringBuilder s = new StringBuilder("hello");
//        //s.append("world");
//        System.out.println(s);
//        s.setCharAt(0,'m');
//        System.out.println(s);
//        s.append("world");
//        System.out.println(s);//melloworld
//
//        //Insert(idx,ch) or deleteCharAt(ch)
//
//        s.insert(2,'y');
//        System.out.println(s);//meylloworld
//        s.deleteCharAt(0);
//        System.out.println(s);

        //Reverse() and delete(i,j)

        StringBuilder sb = new StringBuilder("Physics");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0,2);//0 to 1 char delete from sb string
        System.out.println(sb);


    }
}
