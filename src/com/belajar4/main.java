//MEMAHAMI OPERATOR ARITMATIKA DALAM JAVA
//OPERATOR adalah suatu tanda yang adigunakan untuk mengoperasikan suatu nilai dalam program.

package com.belajar4;

public class main {
    public static void main(String[] args){
        System.out.println("OPERATOR DALAM JAVA");
        System.out.println("===================");

        //DEKLARASI
        int a;//<------deklarasi
        int b;//<------deklarasi
        int hasil;
        a = 10;
        b = 4;

        //1. penjumlahan(+)
        System.out.println("\n1. PENJUMLAHAN");
        System.out.println("---------------------------------");
        hasil = a + b;
        System.out.println( a + " + " + b + " = " + hasil);
        hasil = 3 + 4;
        System.out.println("3 + 4 = " + hasil);

        // 2. pengrangan(-)
        System.out.println("\n2. PENGURANGAN");
        System.out.println("---------------------------------");
        hasil = a - b;
        System.out.println( a + " - " + b + " = " + hasil);
        hasil = 3 - 4;
        System.out.println("3 - 4 = " + hasil);

        //3. perklaian(*)
        System.out.println("\n3. PERKALIAN");
        System.out.println("---------------------------------");
        hasil = a * b;
        System.out.println( a + " * " + b + " = " + hasil);
        hasil = 3 * 4;
        System.out.println("3 * 4 = " + hasil);

        //4. pembagian(/)
        System.out.println("\n4. PEMBAGIAN");
        System.out.println("---------------------------------");
        hasil = a / b;
        System.out.println( a + " / " + b + " = " + hasil);
        hasil = 3 / 4;
        System.out.println("3 / 4 = " + hasil);

        //5. modulus(%) <--- adalah sisa hasil bagi
        System.out.println("\n5. MODULUS");
        System.out.println("---------------------------------");
        hasil = a % b;
        System.out.println( a + " % " + b + " = " + hasil);
        hasil = 3 % 4;
        System.out.println("3 % 4 = " + hasil);

    }
}
