package com.rizkynugraha.modul1.Pass;



public class testPass {
    int nomer1;
    int nomer2;

    // Constructor
    public testPass(int nomer1, int nomer2) {
        this.nomer1 = nomer1;
        this.nomer2 = nomer2;
    }

    // Pass by value, parameter berupa tipe data primitif
    public void calculate(int m, int n){
        m *= 10;
        n /= 2;
    }

    // Pass by Reference, parameter berupa tipe data class
    public void calculate(testPass pass){
        pass.nomer1 *= 10;
        pass.nomer2 /= 2;
    }
}
