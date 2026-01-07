public class matakuliah {
    private String kodeMK;
    private String namaMK;
    private int sks;
    
    public matakuliah(){ //construktor non-parameter
        this.kodeMK = "";
        this.namaMK = "";
        this.sks = 0;
    }
    
    public matakuliah(String kodeMK, String namaMK, int sks){ //construktor dengan parameter
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }
    //================getter dan setter
    public String getKodeMK(){
        return kodeMK;
    }
    public String getnamaMK(){
        return namaMK;
    }
    public void setsks(int sks){
        this.sks = sks;
    }
    //=========================
    public void tampilInfo(){
        System.out.println("Mata Kuliah - Kode MK: " + kodeMK + ", Nama: " + namaMK + ", SKS: " +sks);
    }
}