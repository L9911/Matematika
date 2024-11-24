public class Matematika {
    private int hasil; // Menggunakan modifier private untuk enkapsulasi

    // Metode untuk operasi tambah
    public int tambah(int a, int b) {
        return a + b;
    }

    // Metode untuk operasi kurang
    public int kurang(int a, int b) {
        return a - b;
    }

    // Metode untuk operasi kali
    public int kali(int a, int b) {
        return a * b;
    }

    // Metode untuk operasi bagi
    public int bagi(int a, int b) {
        if (b != 0) { // Menambahkan pengecekan pembagian dengan nol
            return a / b;
        } else {
            throw new ArithmeticException;
        }
    }
}

