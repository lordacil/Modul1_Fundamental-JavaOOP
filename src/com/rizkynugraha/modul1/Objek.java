package com.rizkynugraha.modul1;

public class Objek {
    public static void main(String[] args) {
        // Deklarasi object tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Rizky");
        mahasiswaTanpa.setNim(19104014);

        // Output
        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("Nim\t: " + mahasiswaTanpa.getNim());

        // Deklarasi object dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Skuy",280101);

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("Nim\t: " + mahasiswa.getNim());
    }
}
