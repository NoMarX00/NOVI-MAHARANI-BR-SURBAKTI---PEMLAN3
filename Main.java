import java.util.*;


public class Main {
    public static void main(String[] args) {
        boolean nextMhs = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Matkul> listMatkul = new ArrayList<>();

        while (nextMhs) {
            System.out.println("=================");
            System.out.println("KARTU HASIL STUDI");
            System.out.println("=================");
            System.out.println();
            System.out.print("Masukan Nama : ");
            String nama = scanner.nextLine();
            System.out.print("Masukan NIM  : ");
            String nim = scanner.nextLine();
            Mahasiswa mhs1 = new Mahasiswa(nim, nama);
            mhs1.tambahMahasiswa(mhs1);

            boolean next = true;
            while (next) {
                System.out.print("Masukkan Kode Matkul : ");
                String kode = scanner.nextLine();
                System.out.print("Masukkan Nama Matkul : ");
                String namaMk = scanner.nextLine();
                System.out.print("Masukkan Nilai       : ");
                int nilai = Integer.parseInt(scanner.nextLine());
                Matkul mk1 = new Matkul(kode, namaMk, nilai);
                listMatkul.add(mk1);

                System.out.println("Ingin tambah matkul lain? (y/n)");
                String lagi = scanner.nextLine();
                if (lagi.equals("n")) next = false;
            }
            
            System.out.println("____________________");
            System.out.println("KARTU HASIL STUDI ");
            System.out.println("Nama        :" + mhs1.getNama());
            System.out.println("NIM         :" + mhs1.getNIM());
            System.out.println("");
            for (Matkul matkul : listMatkul) {
                matkul.cetakMatkul();
            }
            System.out.println("____________________");
            

            System.out.println("Tambah matkul lain ? (y/n)");
            String lain = scanner.nextLine();
            if (lain.equals("n")) nextMhs = false;
        }
    }
}