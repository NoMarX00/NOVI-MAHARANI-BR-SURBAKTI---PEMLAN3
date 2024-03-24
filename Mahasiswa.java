import java.util.ArrayList;
public class Mahasiswa {

    public ArrayList <Mahasiswa> listMahasiswa;
    public String NIM;
    public String Nama;

    public Mahasiswa(String NIM, String Nama) {
        this.NIM= NIM;
        this.Nama= Nama;
        this.listMahasiswa=new ArrayList<>();
    }
    public String getNama() {
        return Nama;
        
    }
    public String getNIM() {
        return NIM;
    }
    
    public void  tambahMahasiswa(Mahasiswa mhs){
        listMahasiswa.add(mhs);
    }

}