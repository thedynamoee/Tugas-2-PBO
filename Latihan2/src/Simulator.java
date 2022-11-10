public class Simulator {
    public static void main(String[] args) {
        
        //upcasting
        Mahasiswa fa = new Asdos("Raja OP Damanik", 24, 1);
        System.out.println(fa.getNama("Fairuzikun") + fa.getJamSibuk());

        Dosen r = new Dosen("Raja OP Damanik", 5);
        System.out.println(r.getNama("Raja OP Damanik") + r.getJamSibuk());
        
        //upcasting
        Mahasiswa a = new Asdos("Angel-chan", 20, 4);
        System.out.println(a.getNama("Angel-chan") + a.getJamSibuk());
        
        Mahasiswa fi = new Mahasiswa("Firman", 20);
        System.out.println(fi.getNama("Firman") + fi.getJamSibuk());

        Mahasiswa nid = new Mahasiswa("Nid to pass this sem", 23);
        System.out.println(nid.getNama("Nid to pass this sem") + nid.getJamSibuk());

        Dosen niv = new Dosen("Nivotko", 3);  
        System.out.println(niv.getNama("Nivotko") + niv.getJamSibuk());
        
        int total = fa.getJamSibuk() + r.getJamSibuk() + a.getJamSibuk() + fi.getJamSibuk() + nid.getJamSibuk() + niv.getJamSibuk();
        System.out.println("Total jam sibuk elemen Fasilkom adalah " + total);
        
      }
}
