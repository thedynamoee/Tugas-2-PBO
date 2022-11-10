public class Mahasiswa extends Elemen { //Merupakan Polymorphism menggunakan Inheritance
    private int sks;

    public Mahasiswa(String nama, int sks){
        super(nama);
        jamSibuk=sks*3;
    }
  
    public int getJamSibuk(){
        return jamSibuk;
    }
    
    @Override
    String getNama(String nama){
        return nama + " adalah seorang mahasiswa dengan jam sibuk ";
    }
  
}

