package id.ac.polban.pbo.kantin.app;
import id.ac.polban.pbo.kantin.model.Pesanan;

public class Kasir {
    // Challange A
    // Relasi uses-a, Pesanan hanya diterima sebagai parameter method. artinya yang berinteraksi dengan Pesanan hanya ketika method dijalankan,
    public void proses(Pesanan pesanan) {
        System.out.println(pesanan.getNomor());
        if (pesanan.dapatDiproses()) {
            System.out.println("Pesanan diterima. Rp " + pesanan.hitungTotal());
        } else {
            System.out.println("Pesanan ditolak");
        }
    }
}