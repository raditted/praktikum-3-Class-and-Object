package id.ac.polban.pbo.kantin.app;

import id.ac.polban.pbo.kantin.model.Mahasiswa;
import id.ac.polban.pbo.kantin.model.MenuItem;
import id.ac.polban.pbo.kantin.model.Pesanan;

public class Main {
    public static void main(String[] args) {
        // T-01
        Mahasiswa m1 = new Mahasiswa("241001", "Asep");
        Mahasiswa m2 = new Mahasiswa("241002", "Siti");

        MenuItem nasi = new MenuItem("M01", "Nasi Goreng", 18000);
        MenuItem kopi = new MenuItem("M02", "Kopi Susu", 12000);

        // T-03
        kopi.tandaiHabis();

        // T-04
        // T-05
        Pesanan p1 = new Pesanan(m1, nasi, 2);

        // T-06
        Pesanan p2 = new Pesanan(m2, kopi, 1);

        // T-07
        Pesanan p3 = new Pesanan(m1, nasi, 0);

        Kasir kasir = new Kasir();
        kasir.proses(p1);
        kasir.proses(p2);

//        MenuItem.tersedia = true;

        // bukti ekskusi dan ringkasan
        p1.cetakRingkasan();
        System.out.println();
        p2.cetakRingkasan();
        System.out.println();
        p3.cetakRingkasan();
        System.out.println();

        // bukti task 4
        System.out.println("Total Object Pesanan Dibuat: " + Pesanan.getJumlahPesananDibuat());

        // output T-02
        // System.out.println(m1.nama);
    }
}