public class nilai implements Penilaian { 
    private String npmMahasiswa;
    private String kodeMataKuliah;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;
    public static int totalNilai = 0; // Static variable

    // Constructor Parameter (Syarat 5.4)
    public nilai(String npm, String kode, double tgs, double uts, double uas) {
        this.npmMahasiswa = npm;
        this.kodeMataKuliah = kode;
        this.nilaiTugas = tgs;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
        totalNilai++; // 
    }

    // Implementasi Interface 
    @Override
    public double hitungNilaiAkhir() {
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
}
