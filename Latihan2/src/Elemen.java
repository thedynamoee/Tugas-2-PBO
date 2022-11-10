abstract class Elemen {
    private String nama;
    public int jamSibuk;

    public  Elemen(String nama){ //Downcasting
        this.nama = nama;
    }
    
    abstract String getNama(String nama);

}

