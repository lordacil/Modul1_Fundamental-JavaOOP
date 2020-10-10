package com.rizkynugraha.latihan_modul1;

import java.util.Scanner;

public class demoPendaftaranMahasiswa {

    public static void main(String[] args) {
        // Pemanggilan Class yang berisi Constructor dan Getter Setter
        PendaftaranMahasiswa Mahasiswa = new PendaftaranMahasiswa();

        System.out.println("--------------------------");
        System.out.println("Pendaftaran Mahasiswa Baru");
        System.out.println("--------------------------\n");
        System.out.println("Masukkan Biodata dibawah ini: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Nama: ");
        String name = input.nextLine();

        System.out.print("Umur: ");
        int umur = input.nextInt();
        Boolean exit = false;
        input.nextLine();
        do {
            System.out.println("Jenis Kelamin: ");
            System.out.println("1. Laki-Laki");
            System.out.println("2. Perempuan");
            System.out.print("Input: ");
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    Mahasiswa.setJenisKelamin("Laki-Laki");
                    exit = true;
                    break;
                case 2:
                    Mahasiswa.setJenisKelamin("Perempuan");
                    exit = true;
                    break;
                default:
                    System.out.println("Tidak ada dalam pilihan!");
            }
//            if (choice == 1){
//                Mahasiswa.setJenisKelamin("Laki-Laki");
//            }else if(choice == 2){
//                Mahasiswa.setJenisKelamin("Perempuan");
//            }else {
//                System.out.println("Tidak ada dalam pilihan!");
//                exit = true;
//            }
        }while (!exit);

        input.nextLine();

        System.out.print("Tempat Lahir: ");
        String tempat = input.nextLine();

        System.out.print("Tanggal Lahir (dd-mm-yyyy): ");
        String tanggal = input.nextLine();
        String TTL = tempat+", "+tanggal;

        System.out.print("Asal Sekolah: ");
        String sekolah = input.nextLine();


        System.out.print("Alamat: ");
        String alamat = input.nextLine();

        System.out.print("No Telepon (+62): ");
        String nomor = input.nextLine();

        if(Mahasiswa.getJenisKelamin() == null){
            System.out.print("Jenis Kelamin anda belum diisi/NULL, isi sekarang? (Y/N)");
            String option = input.nextLine();
            if(option.toUpperCase().equals("Y")){
                System.out.println("Jenis Kelamin: ");
                System.out.println("1. Laki-Laki");
                System.out.println("2. Perempuan");
                System.out.print("Input: ");
                int answer = input.nextInt();
                if (answer == 1){
                    Mahasiswa.setJenisKelamin("Laki-Laki");
                }else if(answer == 2){
                    Mahasiswa.setJenisKelamin("Perempuan");
                }else {
                    System.out.println("Tidak ada dalam pilihan!");
                }
                input.nextLine();
            }else{
                System.out.println("\n=================================");
                System.out.println("Jenis kelamin anda masih kosong !");
                System.out.println("=================================");
            }
        }

        // men-Set inputan user ke variable setter
        Mahasiswa.setNama(name);
        Mahasiswa.setUmur(umur);
        Mahasiswa.setTTL(TTL);
        Mahasiswa.setAsalSekolah(sekolah);
        Mahasiswa.setAlamat(alamat);
        Mahasiswa.setNoTelepon("+62"+(nomor));



        System.out.println("\n-------------");
        System.out.println("Biodata");
        System.out.println("-------------\n");
        // men-Get inputan user dengan mengambil variable dari getter
        System.out.println("Nama\t\t\t : " + Mahasiswa.getNama());
        System.out.println("Umur\t\t\t : " + Mahasiswa.getUmur());
        System.out.println("Jenis Kelamin\t : " + Mahasiswa.getJenisKelamin());
        System.out.println("TTL\t\t\t\t : " + Mahasiswa.getTTL());
        System.out.println("Asal Sekolah\t : " + Mahasiswa.getAsalSekolah());
        System.out.println("Alamat\t\t\t : " + Mahasiswa.getAlamat());
        System.out.println("No Telepon\t\t : " + Mahasiswa.getNoTelepon());
        System.out.println("\n ~Data anda sudah terkirim, Terima kasih sudah mendaftar :)~");



    }
}
