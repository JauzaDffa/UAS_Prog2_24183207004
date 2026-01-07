public class nilai implements Penilaian { // Memenuhi syarat 5.9
    private String npmMahasiswa;
    private String kodeMataKuliah;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;
    public static int totalNilai = 0; // Syarat 5.2 (Static Variable)

    // Constructor Parameter (Syarat 5.4)
    public nilai(String npm, String kode, double tgs, double uts, double uas) {
        this.npmMahasiswa = npm;
        this.kodeMataKuliah = kode;
        this.nilaiTugas = tgs;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
        totalNilai++; // Menambah hitungan setiap objek dibuat
    }

    // --- Implementasi Interface (Syarat 5.9) ---
    @Override
    public double hitungNilaiAkhir() {
        // Rumus: Tugas 30%, UTS 30%, UAS 40%
        return (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }

    @Override
    public String tentukanGrade() {
        double na = hitungNilaiAkhir();
        if (na >= 80) return "A";
        else if (na >= 70) return "B";
        else if (na >= 60) return "C";
        else if (na >= 50) return "D";
        else return "E";
    }

    // Method tampilInfo untuk polymorphism
    public void tampilInfo() {
        System.out.println("NPM: " + npmMahasiswa + " | MK: " + kodeMataKuliah + " | Akhir: " + hitungNilaiAkhir() + " | Grade: " + tentukanGrade());
    }
    
    // Jangan lupa Getter & Setter untuk Encapsulation (Syarat 5.5)
}