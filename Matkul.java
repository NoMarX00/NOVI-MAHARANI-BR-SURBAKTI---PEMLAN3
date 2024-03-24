import java.util.ArrayList;

class Matkul {
    private String kode;
    private String namaMk;
    private int nilai;

    public Matkul(String kode, String namaMk, int nilai) {
        this.kode = kode;
        this.namaMk = namaMk;
        this.nilai = nilai;
    }

    public String getKode() {
        return kode;
    }

    public String getNamaMk() {
        return namaMk;
    }

    public int getNilai() {
        return nilai;
    }

    public String nilaih() {
        String nilaih;
        if (nilai > 80) {
            nilaih = "A";
        } else if (nilai <= 80 && nilai > 75) {
            nilaih = "B+";
        } else if (nilai <= 75 && nilai > 69) {
            nilaih = "B";
        } else if (nilai <= 69 && nilai > 60) {
            nilaih = "C+";
        } else if (nilai <= 60 && nilai > 55) {
            nilaih = "C";
        } else if (nilai <= 55 && nilai > 50) {
            nilaih = "D+";
        } else if (nilai <= 50 && nilai > 44) {
            nilaih = "D";
        } else {
            nilaih = "E";
        }
        return nilaih;
    }

    public void cetakMatkul() {
        System.out.println("Kode             : " + getKode());
        System.out.println("Nama Mata Kuliah : " + getNamaMk());
        System.out.println("Nilai            : " + getNilai());
        System.out.println("Predikat         : " + nilaih());
        System.out.println();
    }
}