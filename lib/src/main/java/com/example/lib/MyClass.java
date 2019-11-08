package com.example.lib;

public class MyClass {
    public  static  void main(String[] argv) {
        java.util.Scanner scanner= new
                java.util.Scanner(System.in);

        System.out.println("input Hour1 :");
        int hu1=scanner.nextInt();

        System.out.println("input Minute1 :");
        int min1=scanner.nextInt();

        System.out.println("input Second1 :");
        int sec1=scanner.nextInt();

        System.out.println("input Hour2 :");
        int hu2=scanner.nextInt();

        System.out.println("input Minute2 :");
        int min2=scanner.nextInt();

        System.out.println("input Second2 :");
        int sec2=scanner.nextInt();

        int alltime1=(hu1*3600)+(min1*60)+sec1;
        int alltime2=(hu2*3600)+(min2*60)+sec2;

        System.out.println("Ans:"+Math.abs(alltime1-alltime2));   //取絕對值
    }
}
