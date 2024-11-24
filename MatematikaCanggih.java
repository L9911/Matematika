public class MatematikaCanggih extends Matematika {

    // Menambahkan metode untuk operasi modulus
    public int modulus(int a, int b) {
        return a % b;
    }

    // Menambahkan metode untuk operasi kombinasi (penjumlahan dan perkalian)
    public int kombinasiTambahKali(int a, int b, int c) {
        return tambah(a, b) * c; // Hasil dari (a + b) * c
    }
}
