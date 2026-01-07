public class Mahasiswa extends User {
    private String prodi;
    public static int totalMahasiswa = 0; //Static variable
    
    public Mahasiswa(){ //construktor non parameter
        super();
        this.prodi="";
        totalMahasiswa++;
    }
    public Mahasiswa(String npm, String nama, String prodi){ //construktor dengan parameter
        super(npm, nama);
        this.prodi = prodi;
        totalMahasiswa++;
    }
    public Mahasiswa(String npm, String nama, String prodi, int angkatan){ //construktor overloading
        super(npm, nama);
        this.prodi = prodi;
        totalMahasiswa++;
    }
    //=================== // geter dan setter
    public String getprodi(){
        return prodi;
    }
    public void setprodi(String prodi){
        this.prodi = prodi;
    }
    //====================
    @Override
    public void tampilInfo(){
         System.out.println("NPM : " + getnpm() + ", NAMA MAHASISWA : " + getNama() + ", PRODI : " + prodi);
    }
    
}