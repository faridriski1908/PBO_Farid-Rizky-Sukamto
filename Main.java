import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Pemanggilan class Scanner
        Scanner keyboard = new Scanner(System.in);

        //Membuat sample array untuk list nanti dan soal
        String[] opsi = {"Belah Ketupat","Segitiga","Persegi"};

        System.out.println("""
                1. Penerapan if else dengan penerapan nested
                   loop untuk for dengan studi kasus bebas.
                """);

        //Membuat Daftar menu pilihan
        System.out.println("Pilihlah Bentuk :");
        for (int i = 0; i < opsi.length; i++) {
            System.out.print("Ketik "+(i+1)+" untuk membuat ");
            System.out.println(opsi[i]);
        }
        //Membuat Input
        System.out.print("Silahkan ketik : ");
        int input = keyboard.nextInt();

        //Ini digunakan untuk menentukan banyaknya titik
        System.out.print("Tentukan Panjang Titiknya : ");
        int n = keyboard.nextInt();

        //Membuat kondisi dengan opsi 1-3
        if (input == 1){
            //Ketika kondisi dipanggil ini digunakan untuk menampilkan belah ketupat
            System.out.println("Belah Ketupat\nDiagonal 1 = "+(n*2+1)+" titik \nDiagonal 2 = "+(n*2+1)+" titik");
            //Perulangan for untuk segitiga bagian atas
            for (int i = 0; i <= n; i++) {
                for (int j = n; j > i; j--) {
                    System.out.print("   ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*  ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*  ");
                }
                for (int j = n; j > i; j--) {
                    System.out.print("   ");
                }
                System.out.println();
            }
            //Perulangan for untuk segitiga bagian bawah
            for (int i = 1; i <= n; i++) {

                for (int j = 0; j < i; j++) {
                    System.out.print("   ");
                }
                for (int j = n; j >= i; j--) {
                    System.out.print("*  ");
                }

                for (int j = n; j > i; j--) {
                    System.out.print("*  ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("   ");
                }
                System.out.println();
            }
        }else if (input == 2){
            //Ketika kondisi dipanggil ini digunakan untuk menampilkan Segtiga
            System.out.println("Segitiga\n Alas = "+(n*2+1)+" titik \n Tinggi = "+(n+1)+" titik");
            for (int i = 0; i <= n; i++) {
                for (int j = n; j > i; j--) {
                    System.out.print("  ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                for (int j = n; j > i; j--) {
                    System.out.print("  ");
                }
                System.out.println();
            }
        }else if (input == 3){
            //Ketika kondisi dipanggil ini digunakan untuk menampilkan Persegi

            System.out.println("Persegi\n Sisi = "+(n*2+1)+ " titik");
            for (int i = 0; i <= n; i++) {
                for (int j = n; j > i; j--) {
                    System.out.print("*  ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*  ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*  ");
                }
                for (int j = n; j > i; j--) {
                    System.out.print("*  ");
                }
                System.out.println();
            }
            for (int i = 1; i <= n; i++) {

                for (int j = 0; j < i; j++) {
                    System.out.print("*  ");
                }
                for (int j = n; j >= i; j--) {
                    System.out.print("*  ");
                }

                for (int j = n; j > i; j--) {
                    System.out.print("*  ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*  ");
                }
                System.out.println();
            }
        }else {
            //Ketika kondisi dipanggil ini jika opsi yang di input salah

            System.out.println("Pilihan tidak tepat");
        }

        //Selanjutnya dibawah ini untuk soal nomor 2

        System.out.println("\n\n2. Penerapan switch case dengan for dan while");

        //Membuat list untuk opsi nomor 2
        System.out.println("Ketik 1 menghitung Luas");
        System.out.println("Ketik 2 menghitung Deret Matematika");
        System.out.print("Pilih salah satu : ");
        //Input untuk opsi
        int inputDua = keyboard.nextInt();

        //Penggunaan switch berdasarkan data dari Input dua
        switch (inputDua) {
            case 1 -> {
                //Kondisi jika input diisi 1
                for (int i = 0; i < opsi.length; i++) {
                    System.out.print("Ketik " + (i + 1) + " untuk menghitung luas ");
                    System.out.println(opsi[i]);
                }
                System.out.print("Pilih salah satu : ");
                int bentuk = keyboard.nextInt();

                //Membuat percabangan dengan membuat switch
                switch (bentuk) {
                    case 1 -> {
                        //Kondisi jika input diisi 1

                        System.out.print("Masukan \nDiagonal = ");
                        int diagonal1 = keyboard.nextInt();
                        System.out.println("Luas = (Diagonal 1 x Diagonal 2)/2");
                        System.out.println("     = (" + diagonal1 + " x " + diagonal1 + ")/2");
                        System.out.println("     = (Diagonal " + (diagonal1 * diagonal1) + "/2");
                        System.out.println("     = " + ((diagonal1 * diagonal1) / 2));
                    }
                    case 2 -> {
                        //Kondisi jika input diisi 2

                        System.out.print("Masukan \nAlas = ");
                        int alas = keyboard.nextInt();
                        System.out.print("Tinggi = ");
                        int tinggi = keyboard.nextInt();
                        System.out.println("Luas = (Alas x Tinggi)/2");
                        System.out.println("     = (Alas " + alas + " x Tinggi " + tinggi + ")/2");
                        System.out.println("     = " + (alas * tinggi) + "/2");
                        System.out.println("     = " + ((alas * tinggi) / 2));
                    }
                    case 3 -> {
                        //Kondisi jika input diisi 3

                        System.out.print("Masukan \nSisi = ");
                        int sisi = keyboard.nextInt();
                        System.out.println("Luas = Sisi x Sisi");
                        System.out.println("     = (Sisi " + sisi + " x Sisi " + sisi + ")");
                        System.out.println("     = " + (sisi * sisi));
                    }
                    default -> {
                    }
                }
            }
            case 2 -> {
                //Kondisi jika input diisi 2

                System.out.println("Pilih jenis peritungan Deret Matematika");
                String[] deret = {"Bilangan Ganjil", "Bilangan Genap", "Fibonacci"};
                for (int i = 0; i < deret.length; i++) {
                    System.out.println("- Tentukan Deret " + deret[i] + " (Ketik " + (i + 1) + ")");
                }
                System.out.print("Pilih salah satu : ");
                int deretAngka = 0;
                int max = 500;
                int suku = 0;

                //while (deretAngka > 500 ){
                int inputDeret = keyboard.nextInt();
                switch (inputDeret) {
                    case 1 -> {
                        System.out.println();
                        while (deretAngka <= max) {
                            deretAngka++;
                            if (deretAngka % 2 == 0) {
                                System.out.print(deretAngka + " ");
                                suku++;
                            }

                        }
                        System.out.println("\nBilangan diatas adalah bilangan genap dibawah " +
                                max + " dan jumlah suku ada " + suku);
                    }
                    case 2 -> {
                        System.out.println();
                        while (deretAngka < max) {
                            deretAngka++;
                            if (deretAngka % 2 != 0) {
                                System.out.print(deretAngka + " ");
                                suku++;
                            }
                        }
                        System.out.println("\nBilangan diatas adalah bilangan ganjil dibawah " +
                                max + " dan jumlah suku ada " + suku);
                    }
                    case 3 -> {
                        System.out.println();
                        int rumus;
                        int num1 = 0, num2 = 1;
                        while (num1 < max) {
                            System.out.print(num1 + " ");
                            rumus = num1 + num2;
                            num1 = num2;
                            num2 = rumus;
                            suku++;
                        }
                        System.out.println("\nBilangan diatas adalah bilangan Fibonacci dibawah " +
                                max + " dan jumlah suku ada " + suku);
                    }
                }
            }
            default -> {
            }
        }
    }
}