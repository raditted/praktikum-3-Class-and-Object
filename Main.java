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
    }
}
