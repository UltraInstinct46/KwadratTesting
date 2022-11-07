package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int a,b,c,d,x1,x2;
        String result;
        while (true) {
            if(exit){
                break;
            }
        System.out.print
                ("1.Jumlah Hasil Akar \n" +
                        "2.Rumus ABC \n" +
                        "3.Menyusun Persamaan Kuadrat \n" +
                        "4.Pertidaksamaan Kuadrat \n" +
                        "5.Pertidaksamaan Linear \n" +
                        "6.Exit \n" +
                        "Pilih : ");
        int pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Jumlah Hasil Akar");
                    System.out.print("Masukan Nilai a : ");
                    a = scanner.nextInt();
                    System.out.print("Masukan Nilai b : ");
                    b = scanner.nextInt();
                    System.out.print("Masukan Nilai c : ");
                    c = scanner.nextInt();
                    result = kwadrat.JumlahHasilAkar(a, b, c);
                    System.out.println("Hasil : " + result);
                    break;
                case 2:
                    System.out.println("Rumus ABC");
                    System.out.print("Masukan Nilai a : ");
                    a = scanner.nextInt();
                    System.out.print("Masukan Nilai b : ");
                    b = scanner.nextInt();
                    System.out.print("Masukan Nilai c : ");
                    c = scanner.nextInt();
                    result = kwadrat.JumlahHasilAkar(a, b, c);
                    System.out.println("Hasil : " + result);
                    break;
                case 3:
                    System.out.println("Menyusun Persamaan Kuadrat");
                    System.out.print("Masukan Nilai x1 : ");
                    x1 = scanner.nextInt();
                    System.out.print("Masukan Nilai x2 : ");
                    x2 = scanner.nextInt();
                    result = kwadrat.MenyusunPersamaanKuadrat(x1, x2);
                    System.out.println("Hasil : " + result);
                    break;
                case 4:
                    String equivalent;
                    System.out.println("Pertidaksamaan Kuadrat");
                    System.out.print("Masukan Nilai a : ");
                    a = scanner.nextInt();
                    System.out.print("Masukan Nilai b : ");
                    b = scanner.nextInt();
                    System.out.print("Masukan Nilai c : ");
                    c = scanner.nextInt();
                    System.out.print("Masukan Nilai equivalent : ");
                    equivalent = scanner.next();
                    result = kwadrat.PertidaksamaanKuadrat(a, b, c, equivalent);
                    System.out.println("Hasil : " + result);
                    break;
                case 5:
                    System.out.println("Pertidaksamaan Linear");
                    System.out.print("Masukan Nilai a : ");
                    a = scanner.nextInt();
                    System.out.print("Masukan Nilai b : ");
                    b = scanner.nextInt();
                    System.out.print("Masukan Nilai c : ");
                    c = scanner.nextInt();
                    System.out.print("Masukan Nilai d : ");
                    d = scanner.nextInt();
                    System.out.print("Masukan Nilai equivalent : ");
                    equivalent = scanner.next();
                    result = kwadrat.PertidaksamaanLinear(a, b, c, d, equivalent);
                    System.out.println("Hasil : " + result);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    break;
            }
        }
    }
}
