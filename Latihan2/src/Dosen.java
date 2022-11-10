public class Dosen extends Elemen{ //Merupakan Polymorphism menggunakan Inheritance
    private int jumlahHariKerja;

    public Dosen(String nama, int jumlahHariKerja){
        super(nama);
        jamSibuk = jumlahHariKerja * 8;
    }

    public int getJamSibuk(){
        return jamSibuk;
    }

    @Override
    String getNama(String nama){
        return nama + " adalah seorang dosen dengan jam sibuk " ;
    }

}

