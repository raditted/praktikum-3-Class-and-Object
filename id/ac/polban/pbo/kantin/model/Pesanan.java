package id.ac.polban.pbo.kantin.model;

public class Pesanan {
    private static int nextNumber = 1;

    private int nomor;
    private Mahasiswa pemesan;
    private MenuItem menu;
    private int jumlah;

    public Pesanan(Mahasiswa pemesan, MenuItem menu, int jumlah) {
        this.nomor = nextNumber++;
        this.pemesan = pemesan;
        this.menu = menu;
        this.jumlah = jumlah;
    }

    public boolean dapatDiproses() {
        return jumlah > 0 && menu.isTersedia();
    }

    public int hitungTotal() {
        return menu.getHarga() * jumlah;
    }

    // task 4
    public static int getJumlahPesananDibuat() {
        return nextNumber - 1;
    }

    // task 1
    public void cetakRingkasan() {
        System.out.println("--- Ringkasan Pesanan #" + nomor + " ---");
        System.out.println("Pemesan : " + pemesan.getNama() + " (" + pemesan.getNim() + ")");
        System.out.println("Menu    : " + menu.getNama() + " x " + jumlah);
        System.out.println("Status  : " + (dapatDiproses() ? "Diproses" : "Ditolak"));
        if (dapatDiproses()) {
            System.out.println("Total   : Rp " + hitungTotal());
        }
    }

    public int getNomor() {
        return nomor;
    }

    public Mahasiswa getPemesan() {
        return pemesan;
    }

    public MenuItem getMenu() {
        return menu;
    }

    public int getJumlah() {
        return jumlah;
    }
}