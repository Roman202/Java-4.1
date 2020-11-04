package com.company;

// Перевід строчних букв в прописні з допомогою побітової коньюнкціі

public class UpCase {

    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch + ";");

            // Ця команда відключає шостий біт
            ch = (char) ((int) ch & 0xffdf);
            System.out.print(ch + " ");
        }
    }
}
