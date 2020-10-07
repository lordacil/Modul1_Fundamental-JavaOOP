package com.rizkynugraha.modul1.Pass;

public class Passed {

    public static void main(String[] args) {
        int nomer1,nomer2;
        testPass testPass = new testPass(50, 100);
        nomer1 = 10;
        nomer2 = 20;

        // Passed by value
        System.out.println("Nilai sebelum passed by value\t: ");
        System.out.println("nomer1 = "+ nomer1);
        System.out.println("nomer2 = "+ nomer2);


        testPass.calculate(nomer1, nomer2);
        System.out.println("Nilai sesudah passed by value\t: ");
        System.out.println("nomer1 = "+ nomer1);
        System.out.println("nomer2 = "+ nomer2);

        // Passed by reference
        System.out.println("Nilai sebelum passed by reference\t: ");
        System.out.println("nomer1 = "+ testPass.nomer1);
        System.out.println("nomer2 = "+ testPass.nomer2);

        testPass.calculate(testPass);
        System.out.println("Nilai sesudah passed by reference\t: ");
        System.out.println("nomer1 = "+ testPass.nomer1);
        System.out.println("nomer2 = "+ testPass.nomer2);
    }

}
