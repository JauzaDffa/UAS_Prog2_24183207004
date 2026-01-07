public class Dosen extends User{
    private String matakuliah;
    
    public Dosen(){ //construktor non parameter
        super();
        this.matakuliah="";
    }
    public Dosen(String id, String nama, String matakuliah){ //construktor dengan parameter
        super(id,nama);
        this.matakuliah = matakuliah;
    }
    //=============== getter dan setter
    public String getMataKuliah(){
        return matakuliah;
    }
    public void setMataKuliah(String matakuliah){
        this.matakuliah = matakuliah;
    }
    @Override
    public void tampilInfo(){
        System.out.println("NIDN : " + getid() + ", Nama Dosen: " + getNama() + ", Mata Kuliah: " + matakuliah);
    }
}