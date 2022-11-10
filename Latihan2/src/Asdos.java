public class Asdos extends Mahasiswa{ //Merupakan Polymorphism menggunakan Inheritance
    private int jamNgasdos;

    public Asdos(String nama, int sks, int jamNgasdos){
        super(nama, sks);
        jamSibuk = jamSibuk + jamNgasdos;
    }
  
    public int getJamSibuk(){
        return jamSibuk;
    }
    
    @Override
    String getNama(String nama){
        return nama + " adalah seorang asdos dengan jam sibuk " ;
    }
    
}

