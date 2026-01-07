import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) { // Perbaikan 5.2: Parameter main standar
        Scanner scanner = new Scanner(System.in);
        
        // Perbaikan 5.7: Polymorphism menggunakan List dari Parent (User)
        ArrayList<User> users = new ArrayList<>(); 
        ArrayList<matakuliah> matakuliahs = new ArrayList<>();
        ArrayList<nilai> nilais = new ArrayList<>();
        
        int pilihan;
        do {
            System.out.println("======= SIAKAD MINI =======");
            System.out.println("Pilih menu dibawah: ");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Input Data Dosen");
            System.out.println("3. Input Mata Kuliah");
            System.out.println("4. Input Nilai Mahasiswa");
            System.out.println("5. Tampilkan Data");
            System.out.println("6. Keluar");
            System.out.println("======= TERIMA KASIH =======");
            System.out.println("Ketik: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (pilihan) {
                case 1 -> {
                    System.out.print("NPM: "); String npm = scanner.nextLine();
                    System.out.print("NAMA: "); String nama = scanner.nextLine();
                    System.out.print("PRODI: "); String prodi = scanner.nextLine();
                    
                    
                    User mhs = new Mahasiswa(npm, nama, prodi); 
                    users.add(mhs);
                    System.out.println("Data mahasiswa berhasil ditambahkan.");
                }
                case 2 -> {
                    System.out.print("NIDN: "); String nidn = scanner.nextLine();
                    System.out.print("NAMA: "); String nama = scanner.nextLine();
                    System.out.print("MATA KULIAH: "); String mk = scanner.nextLine();
                    
                    
                    User dsn = new Dosen(nidn, nama, mk);
                    users.add(dsn);
                    System.out.println("Data dosen berhasil ditambahkan.");
                }
                case 3 -> {
                    System.out.print("Kode MK: "); String kode = scanner.nextLine();
                    System.out.print("Nama MK: "); String namaMk = scanner.nextLine();
                    System.out.print("SKS: "); int sks = scanner.nextInt();
                    
                    matakuliah mkObj = new matakuliah(kode, namaMk, sks);
                    matakuliahs.add(mkObj);
                }
                case 4 -> {
                    System.out.print("NPM Mahasiswa: "); String npm = scanner.nextLine();
                    System.out.print("Kode Mata Kuliah: "); String kode = scanner.nextLine();
                    System.out.print("Nilai Tugas: "); double tugas = scanner.nextDouble();
                    System.out.print("NIlai UTS: "); double uts = scanner.nextDouble();
                    System.out.print("Nilai UAS: "); double uas = scanner.nextDouble();scanner.nextLine();
                    
                    
                    nilai dataNilai = new nilai(npm, kode, tugas, uts, uas);
                    nilais.add(dataNilai);
                    System.out.println("Data nilai berhasil ditambahkan");
                }
                case 5 -> {
                    System.out.println("DATA USER (Polymorphism)");
                    for (User user: users) {
                        user.tampilInfo(); //  Polymorphism
                    System.out.println("============================");
                    }
                    System.out.println("DATA NILAI (Interface Implementation)");
                    for (matakuliah mk : matakuliahs) {
                        mk.tampilInfo();
                    }
                    
                    System.out.println("Total Mahasiswa di Sistem: " + Mahasiswa.totalMahasiswa);
                    System.out.println("Total Record Nilai: " + nilai.totalNilai);
                }
            }
        } while (pilihan != 6);
        scanner.close();
    }
}