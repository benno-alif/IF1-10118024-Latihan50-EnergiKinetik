package com.benno;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Menghitung Energi Kinetik
     */

public class Main {

    public static void main(String[] args) {
        Energi energi = new Energi();
        energi.setMass(145);
        energi.setVelocity(25);

        System.out.println("Massa : " + energi.getMass() + " gram");
        System.out.println("Kecepatan : " + energi.getVelocity() + " m/s");
        System.out.println("Energi Kinetik : " + energi.kineticEnergy(energi.getMass(), energi.getVelocity()) + " J");
        System.out.println("Usaha : " + energi.usaha() + " J");
    }
}
