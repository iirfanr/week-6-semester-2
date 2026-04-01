/*Skenario
*Anda diminta untuk mengurutkan daftar objek Student. Aturan pengurutannya
*adalah:
*1. Urutkan berdasarkan Nama secara alfabetis (tanpa mempedulikan huruf
*besar/kecil).
*2. Jika ada nama yang sama, maka urutkan berdasarkan ID dari yang terkecil
*ke terbesar.
*Instruksi Pengerjaan
*Lengkapilah bagian kosong pada kode di bawah ini dengan ketentuan:
*1. Bagian [1]: Panggil fungsi untuk memulai operasi Stream pada koleksi.
*2. Bagian [2]: Gunakan metode Stream untuk melakukan pengurutan elemen.
*3. Bagian [3]: Gunakan metode dari kelas wrapper Integer untuk
*membandingkan dua nilai ID secara aman.
*4. Bagian [4]: Gunakan metode String yang tepat untuk membandingkan dua
*string tanpa memperhatikan case (huruf besar/kecil) untuk menghasilkan
*nilai integer perbandingan.
*5. Bagian [5]: Panggil operasi terminal untuk mengumpulkan hasil akhir ke
*dalam sebuah List.
*nstruksi*/

package JavaProblems;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class ProblemTwo {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student(101, "Joe"),
            new Student(103, "Zulkifli"),
            new Student(102, "Riza"),
            new Student(104, "Alice"),
            new Student(105, "Joshua"),
            new Student(106, "Alice"),
            new Student(107, "Joe")
        );
        
        List<Student> ans = students.stream() // Membuka stream
            .sorted((s1, s2) -> { // Melakukan pengurutan

                // Logika: Jika nama sama, bandingkan ID
                if (s1.getName().equalsIgnoreCase(s2.getName())) {
                    return Integer.compare(s1.getId(), s2.getId());
                }
                // Jika nama berbeda, bandingkan Nama
                else {
                    return s1.getName().compareTo(s2.getName());
                }
            })
            .collect(Collectors.toList()); // Mengumpulkan hasil

        for (Student student : ans) {
            System.out.println(student);
        }
    }
}
// Buatlah class Student disertai dengan attribute dan method lainnya yang
/*diperlukan!
*Output yang Diharapkan
*Student{id=104, name='Alice'}
*Student{id=101, name='Joe'}
*Student{id=105, name='Joshua'}
*Student{id=102, name='Riza'}
*Student{id=103, name='Zulkifli'}
*/