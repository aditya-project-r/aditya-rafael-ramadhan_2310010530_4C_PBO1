# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan nilai, dan memberikan output berupa informasi detail dari nilai tersebut seperti nilai huruf, dan hasil kelulusan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Nilai`, `NilaiDetail`, dan `NilaiBeraksi` adalah contoh dari class.

```bash
public class Nilai {
    ...
}

public class NilaiDetail extends Nilai {
    ...
}

public class NilaiBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Aditya[0] = new NilaiDetail(nama, nilai);` adalah contoh pembuatan object.

```bash
Aditya[0] = new NilaiDetail(nama, nilai);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `nilai` adalah contoh atribut.

```bash
String nama;
double nilai;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Nilai` dan `NilaiDetail`.

```bash
public Nilai(String nama, double nilai) {
    this.nama = nama;
    this.nilai = nilai;
}

public NilaiDetail(String nama, double nilai) {
    super(nama, nilai);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setnilai` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setnilai(double nilai) {
    this.nilai = nilai;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getnilai`, `getNilaiHuruf`, dan `getKelulusan` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getnilai() {
    return nilai;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `nilai` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private double nilai;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `NilaiDetal` mewarisi `Nilai` dengan sintaks `extends`.

```bash
public class NilaiDetail extends Nilai {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Nilai` merupakan overloading method `displayInfo`.

```bash
public String displayInfo(){
    return "Nama : "+getNama()+
            "\nNilai : "+getNilai();
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getNilaiHuruf` dan seleksi `switch` dalam method `getKelulusan`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `do while` untuk meminta input dan menampilkan data.

```bash
do{
    System.out.print("Lanjutkan (y/t) : ");
    String jawaban = scanner.nextLine();
        if (!jawaban.equalsIgnoreCase("y")){
        lanjutkan = false;
        }
} while (lanjutkan);
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
    System.out.print("Masukan Nama : ");
    String nama = scanner.nextLine();
    System.out.print("Masukan Nilai : ");
    double nilai = scanner.nextDouble();
    scanner.nextLine();

System.out.println(Aditya[0].displayInfo());
System.out.println("Nilai Huruf : "+ Aditya[0].getNilaiHuruf());
System.out.println("Kelulusan : "+ Aditya[0].getKelulusan());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `NilaiDetail[] Aditya = new NilaiDetail[2];` adalah contoh penggunaan array.

```bash
NilaiDetail[] Aditya = new NilaiDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (InputMismatchException e) {
    System.out.println("Kesalahan Input Pada Nilai");
    scanner.nextLine();
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Aditya Rafael Ramadhan
NPM: 2310010530
