package UAS_PBO1;

// 1. class
public class Nilai {
    // no 3 dan 7. atribut dan encapsulasi
    private String nama;
    private double nilai;
    
    // 4. constructor
    public Nilai(String nama, double nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }
    
    // 5. mutator
    public String getNama() {
        return nama;
    }

    public double getNilai() {
        return nilai;
    }
    
    // 6. accessor
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
    
    // 9. polimorfisme displayInfo()
    public String displayInfo(){
        return "Nama : "+getNama()+
                "\nNilai : "+getNilai();
    }
}
