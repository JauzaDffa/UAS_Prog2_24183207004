public abstract class User { //Abstrak Class dan  Inheritance pada Mahasiswa.java dan Dosen.java
    private String id;
    private String nama;
    
    public User(){ // construktor non parameter
        this.id = "";
        this.nama = "";
    }
    public User (String id,String nama){ //construktor dengan parameter
        this.id=id;
        this.nama=nama;
    }
     //=========================== // getter dan setter (Encapsulation)
    public String getId(){
        return id;
    }
    public void SetId(String id){ 
        this.id = id;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    //============================
    public abstract void tampilInfo(); //Method abstract
}

