package com.rizkynugraha.modul1.Manusia;

public class demoManusia {

    public static void main(String[] args) {
        // Array of object
        Manusia arrayManusia[] = new Manusia[3];

        // Constructor pertama
        Manusia manusia1 = new Manusia();
        manusia1.setNama("Seraph");
        manusia1.setUmur(20);

        // Constructor kedua
        Manusia manusia2 = new Manusia("Poseidon");

        // Constructor ketiga
        Manusia manusia3 = new Manusia("Athena",18);

        arrayManusia[0] = manusia1;
        arrayManusia[1] = manusia2;
        arrayManusia[2] = manusia3;

        for (Manusia x: arrayManusia)
        {
            System.out.println("Hero");
            System.out.println("Nama\t: " + x.getNama());
            System.out.println("Umur\t: " + x.getUmur());
            System.out.println();
        }

    }

}
