package com.company;

public class LowCase {
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);

            // Ця команда включає шостий біт при допомозі числа 32
            ch = (char) ((int) ch | 0x20);
            System.out.print(ch + " ");
        }
    }
}
