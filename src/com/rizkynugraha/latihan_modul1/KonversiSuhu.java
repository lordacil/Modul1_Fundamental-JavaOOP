package com.rizkynugraha.latihan_modul1;
import java.text.DecimalFormat;
import java.util.Scanner;
public class KonversiSuhu {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.0");
        System.out.println("Konversi Suhu");
        System.out.println("---------------------");
        System.out.println();
        Scanner input = new Scanner(System.in);

        System.out.print("Berapa jumlah yang ingin di Konversi? : ");
        int conversions = input.nextInt();

        for (int i = 1; i <= conversions; i++) {
            System.out.println("Konversi ke-" + i);
            System.out.println();
            System.out.println("1. Celcius -> Fahrenheit");
            System.out.println("2. Fahrenheit -> Kelvin");
            System.out.println("3. Kelvin -> Reamur");
            System.out.println("4. Reamur -> Celcius");
            System.out.print("input : ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.print("Masukkan suhu Celcius: ");
                    double cels = input.nextDouble();
                    double result = celsiusToFahrenheit(choice, cels);
                    System.out.println("Konversi " + cels + " dari celcius ke fahrenheit adalah " + df.format(result));
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Masukkan suhu Fahrenheit: ");
                    double fahr = input.nextDouble();
                    double result1 = fahrenheitToKelvin(choice, fahr);
                    System.out.println("Konversi " + fahr + " dari fahrenheit ke kelvin adalah " + df.format(result1));
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.print("Masukkan suhu Kelvin: ");
                    double celv = input.nextDouble();
                    double result2 = kelvinToReamur(choice, celv);
                    System.out.println("Konversi " + celv + " dari kelvin ke reamur adalah " + df.format(result2));
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.print("Masukkan suhu Reamur: ");
                    double ream = input.nextDouble();
                    double result3 = reamurToCelcius(choice, ream);
                    System.out.println("Konversi " + ream + " dari reamur ke celcius adalah " + df.format(result3));
                    System.out.println();
                    break;
                default:
                    System.out.println("Tidak ada Pilihan!");

            }
        }
    }

    public static double celsiusToFahrenheit(int choice, double cels) {

        double converted = 0.0;
        if (choice == 1)
            converted = 9.0 / 5.0 * cels + 32;

        return converted;
    }


    public static double fahrenheitToKelvin(int choice, double fahr){
        double converted = 0.0;
        if (choice == 2)
            //converted = (fahr - 32) * 5.0 / 9.0 + 273.15;
            converted = 5.0 / 9.0 * (fahr - 32) + 273.15;

        return converted;
    }

    public static double kelvinToReamur(int choice, double celv){
        double converted = 0.0;
        if (choice == 3)
            converted = 4.0 / 5.0 * (celv + 273.15);

        return converted;
    }

    public static double reamurToCelcius(int choice, double ream){
        double converted = 0.0;
        if (choice == 4)
            converted = (5.0 / 4.0) * ream;

        return converted;
    }
    }