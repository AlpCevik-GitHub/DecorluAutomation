package com.Decorlu.pages;

public class PracticeForAntthing {


    public static void main(String[] args) {

        String str = " Yoksulluk Arazi Divan Yoksulluk Koltukpembe 1  = ₺879,90 ";

        char[] charArray = str.toCharArray();

        String result = "";

        for (int i = 0; i < charArray.length; i++) {

            if (!Character.isDigit(charArray[i])){
                result += charArray[i];
            } else {
                break;
            }


        }

        result = result.trim();

        System.out.println(result);
    }

}
