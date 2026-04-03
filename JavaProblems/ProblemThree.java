/*Skenario
Anda memiliki sebuah array integer primitif. Anda diminta untuk mencari elemen
terbesar ke-3 dari array tersebut menggunakan Java 8 Stream. Tahapannya
adalah: mengubah array menjadi stream, mengubah tipe data primitif menjadi
objek agar bisa diurutkan secara kustom, mengurutkan dari yang terbesar,
melompati elemen tertentu, dan mengambil hasilnya.
Instruksi
Isilah bagian rumpang pada kode di bawah ini dengan ketentuan:
1. Bagian [1]: Panggil metode dari kelas Arrays untuk mengubah array
menjadi IntStream.
2. Bagian [2]: Gunakan metode untuk mengubah stream primitif (int) menjadi
stream objek (Integer) agar bisa menggunakan Comparator.
3. Bagian [3]: Gunakan operasi untuk melompati (skip) sejumlah elemen
pertama.
4. Bagian [4]: Gunakan operasi terminal untuk mengambil elemen pertama
yang tersedia setelah proses skipping.
5. Bagian [5]: Gunakan metode untuk memberikan nilai default jika stream
ternyata kosong.
*/

package JavaProblems;
import java.util.Arrays;

public class ProblemThree {
    public static void main(String[] args) {
    int arr[] = {12, 4, 3, 1, 9, 657};
    int n = 3; // Mencari elemen terbesar ke-3
    int ans = Arrays.stream(arr)
    .boxed() // Konversi ke Stream<Integer>
    .sorted((a, b) -> Integer.compare(b, a)) // Urutkan descending
    .skip(n - 1) // Lewati 2 elemen pertama
    .findFirst() // Ambil elemen yang tersisa
    .orElse(0); // Nilai default jika tidak ada
    System.out.println("Elemen terbesar ke-3 adalah: " + ans);
    }
}
/*Output yang Diharapkan
The 3rd largest element is: 9*/
