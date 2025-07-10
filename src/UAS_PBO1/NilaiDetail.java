package UAS_PBO1;

// 8. inheritance
public class NilaiDetail extends Nilai {

    public NilaiDetail(String nama, double nilai) {
        super(nama, nilai);
    }
    
    // 10. seleksi
    public String getNilaiHuruf() {
        if (getNilai()>= 90) {
            return "A";
        } else if (getNilai() >= 80) {
            return "B";
        } else if (getNilai() >= 70) {
            return "C";
        } else if (getNilai() >= 60) {
            return "D";
        } else {
            return "E";
        }
    }
    
    public String getKelulusan(){
        String Kelulusan = getNilaiHuruf();
        
        return switch (Kelulusan) {
            case "A", "B", "C" -> "Lulus";
            case "D", "E" -> "Tidak Lulus";
            default -> "Nilai Tidak Valid";
        };
    }
}
