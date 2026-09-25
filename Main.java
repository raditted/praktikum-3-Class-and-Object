public class Main {
    static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("241001", "Asep");
        Mahasiswa m2 = new Mahasiswa("241002", "Siti");

        System.out.println(m1.getNim() + " - " + m1.getNama());
        System.out.println(m2.getNim() + " - " + m2.getNama());

        MenuItem nasi = new MenuItem("M01", "Nasi Goreng", 18000);
        MenuItem kopi = new MenuItem("M02", "Kopi Susu", 12000);

        kopi.tandaiHabis();

        System.out.println(nasi.getNama() + ": " + nasi.isTersedia());
        System.out.println(kopi.getNama() + ": " + kopi.isTersedia());

//        test
//        System.out.println(kopi.getNama() + ": " + kopi.tersedia);

        Pesanan p1 = new Pesanan(m1, nasi, 2);
        Pesanan p2 = new Pesanan(m2, kopi, 1);

        Pesanan p3 = new Pesanan(m1, nasi, 1);
        System.out.println("Nomor P1: " + p1.getNomor());
        System.out.println("Nomor P2: " + p2.getNomor());
        System.out.println("Nomor P3: " + p3.getNomor());

        System.out.println("P1 dapat diproses: " + p1.dapatDiproses());
        System.out.println("Total P1: " + p1.hitungTotal());
        System.out.println("P2 dapat diproses: " + p2.dapatDiproses());
    }
}
