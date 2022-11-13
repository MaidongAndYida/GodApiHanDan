package com.example.firstproject;

public class test {
    public static void main(String[] args) {
        System.out.println(test(0));
    }

    public static int test(int i){
        try{
            i++;
            return i;
        }finally {
            i++;
        }
    }
}
