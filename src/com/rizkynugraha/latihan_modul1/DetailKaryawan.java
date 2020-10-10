package com.rizkynugraha.latihan_modul1;

import java.util.Scanner;

// Kelas Karyawan
class Karyawan{
    // inisiasi Variabel
    String namaLengkap,jenisKelamin,alamat,divisi,quotes,noTelepon;
    int umur;

    // consturctor dengan parameter
    Karyawan(String inputNamaLengkap,int inputUmur, String inputJenisKelamin, String inputAlamat,
             String inputDivisi,String inputQuotes, String inputNoTelepon){
        this.namaLengkap = inputNamaLengkap;
        this.umur = inputUmur;
        this.jenisKelamin = inputJenisKelamin;
        this.alamat = inputAlamat;
        this.divisi = inputDivisi;
        this.quotes = inputQuotes;
        this.noTelepon = inputNoTelepon;
    }
}

public class DetailKaryawan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // array karyawan list
        String[] karyawanList = {"Rimuru", "Anos", "Veldora", "Hestia", "Saburo"};
        Boolean exit = false;


        System.out.println("============================");
        System.out.println("==|  PT. Family Tempest  |==");
        System.out.println("============================");
        System.out.println("Karyawan Terbaik Tahun Ini: ");

        // mencetak array karyawan list dengan perulangan : for
        for (int i = 0; i < karyawanList.length; i++) {
            System.out.println((i+1) +". "+ karyawanList[i]);
        }

        do {
            // mengulangi menu ini sampe boolean exit == true
        System.out.println("\n00. Exit Program");
        System.out.println("Untuk melihat detail Karyawan silahkan pilih No(1-5)");
        System.out.print("Input: ");
        int option = input.nextInt();

            switch (option){
                case 1:
                    // Inisiasi kelas karyawan berParameter
                    Karyawan karyawan1 = new Karyawan("Rimuru Tempest",27,"Laki-Laki",
                            "Tokyo, Japan","Pengembangan Teknologi",
                            "Terus melangkah jangan takut!","+628812312");

                    System.out.println("\nKaryawan Terbaik-1 : " + karyawanList[0]);
                    System.out.println("----------------------");
                    System.out.println("\nDetail Karyawan");
                    // mengambil data dari kelas karyawan
                    System.out.println("Nama Lengkap\t : " + karyawan1.namaLengkap);
                    System.out.println("Umur\t\t\t : " + karyawan1.umur);
                    System.out.println("Jenis Kelamin\t : " + karyawan1.jenisKelamin);
                    System.out.println("Alamat Tinggal\t : " + karyawan1.alamat);
                    System.out.println("Divisi\t\t\t : " + karyawan1.divisi);
                    System.out.println("No Telepon\t\t : " + karyawan1.noTelepon);
                    System.out.println("Quotes\t\t\t : " + karyawan1.quotes);
                    break;
                case 2:
                    // Inisiasi kelas karyawan berParameter
                    Karyawan karyawan2 = new Karyawan("Anos Voldigoad",2001,"Laki-Laki",
                            "Hell, Apocalypse","Pertahanan",
                            "Orang yang Kuat berawal dari orang yang lemah !","+627841392");

                    // mengambil data dari kelas karyawan
                    System.out.println("\nKaryawan Terbaik-1 : " + karyawanList[1]);
                    System.out.println("----------------------");
                    System.out.println("\nDetail Karyawan");
                    System.out.println("Nama Lengkap\t : " + karyawan2.namaLengkap);
                    System.out.println("Umur\t\t\t : " + karyawan2.umur);
                    System.out.println("Jenis Kelamin\t : " + karyawan2.jenisKelamin);
                    System.out.println("Alamat Tinggal\t : " + karyawan2.alamat);
                    System.out.println("Divisi\t\t\t : " + karyawan2.divisi);
                    System.out.println("No Telepon\t\t : " + karyawan2.noTelepon);
                    System.out.println("Quotes\t\t\t : " + karyawan2.quotes);
                    break;
                case 3:
                    // Inisiasi kelas karyawan berParameter
                    Karyawan karyawan3 = new Karyawan("Veldora Tempest",661231,"Laki-Laki",
                            "Bandung, Indonesia","Sosialisasi Intern",
                            "Tetaplah rendah hati!","+62412312221");

                    // mengambil data dari kelas karyawan
                    System.out.println("\nKaryawan Terbaik-1 : " + karyawanList[2]);
                    System.out.println("----------------------");
                    System.out.println("\nDetail Karyawan");
                    System.out.println("Nama Lengkap\t : " + karyawan3.namaLengkap);
                    System.out.println("Umur\t\t\t : " + karyawan3.umur);
                    System.out.println("Jenis Kelamin\t : " + karyawan3.jenisKelamin);
                    System.out.println("Alamat Tinggal\t : " + karyawan3.alamat);
                    System.out.println("Divisi\t\t\t : " + karyawan3.divisi);
                    System.out.println("No Telepon\t\t : " + karyawan3.noTelepon);
                    System.out.println("Quotes\t\t\t : " + karyawan3.quotes);
                    break;
                case 4:
                    // Inisiasi kelas karyawan berParameter
                    Karyawan karyawan4 = new Karyawan("Hestia",100,"Perempuan",
                            "Cyms, Yunani","Perlengkapan Item",
                            "Laki-Laki dan Wanita itu sama saja, jadi jangan diam kalau mereka mengancam!","+621311213");

                    // mengambil data dari kelas karyawan
                    System.out.println("\nKaryawan Terbaik-1 : " + karyawanList[3]);
                    System.out.println("----------------------");
                    System.out.println("\nDetail Karyawan");
                    System.out.println("Nama Lengkap\t : " + karyawan4.namaLengkap);
                    System.out.println("Umur\t\t\t : " + karyawan4.umur);
                    System.out.println("Jenis Kelamin\t : " + karyawan4.jenisKelamin);
                    System.out.println("Alamat Tinggal\t : " + karyawan4.alamat);
                    System.out.println("Divisi\t\t\t : " + karyawan4.divisi);
                    System.out.println("No Telepon\t\t : " + karyawan4.noTelepon);
                    System.out.println("Quotes\t\t\t : " + karyawan4.quotes);
                    break;
                case 5:
                    // Inisiasi kelas karyawan berParameter
                    Karyawan karyawan5 = new Karyawan("Uzumaki Saburo",19,"Laki-Laki",
                            "Busan, Korea","Penyelidik Negara",
                            "Bergerak seperti Angin~","+62555211232");

                    // mengambil data dari kelas karyawan
                    System.out.println("\nKaryawan Terbaik-1 : " + karyawanList[4]);
                    System.out.println("----------------------");
                    System.out.println("\nDetail Karyawan");
                    System.out.println("Nama Lengkap\t : " + karyawan5.namaLengkap);
                    System.out.println("Umur\t\t\t : " + karyawan5.umur);
                    System.out.println("Jenis Kelamin\t : " + karyawan5.jenisKelamin);
                    System.out.println("Alamat Tinggal\t : " + karyawan5.alamat);
                    System.out.println("Divisi\t\t\t : " + karyawan5.divisi);
                    System.out.println("No Telepon\t\t : " + karyawan5.noTelepon);
                    System.out.println("Quotes\t\t\t : " + karyawan5.quotes);
                    break;
                case 00:
                    exit = true;
                    System.out.println("\nTerima kasih sudah melihat para karyawan terbaik tahun ini :)");
                    System.exit(0);
                default:
                    System.out.println("===============");
                    System.out.println("Menu Tidak ada!");
                    System.out.println("===============");
            }
        }while (!exit);
    }
}
