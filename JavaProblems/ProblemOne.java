//Instruksi
/*Lengkapilah bagian kosong pada cuplikan kode di bawah ini dengan ketentuan
*sebagai berikut:
*1. Bagian [1]: Panggil metode untuk mengubah ArrayList menjadi Stream.
*2. Bagian [2]: Gunakan metode pengurutan (intermediate operation) yang
*menerima lambda expression.
*3. Bagian [3]: Panggil metode getter yang sesuai untuk membandingkan
*nama antar objek.
*4. Bagian [4]: Gunakan operasi terminal untuk merubah aliran data kembali
*menjadi objek List.
*5. Bagian [5]: Gunakan utility class dan metode yang tepat untuk
*mengumpulkan hasil akhir ke dalam format List.
*Source Code*/

package JavaProblems;
import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;
public class ProblemOne {
public static void main(String[] args) {
    ArrayList<Employee> list = new ArrayList<>();
    list.add(new Employee("John", 10000));
    list.add(new Employee("Rob", 40000));
    list.add(new Employee("Bob", 70000));
    list.add(new Employee("Alice", 50000));
    // Melakukan proses filtering/sorting menggunakan Stream API
    List<Employee> sortedEmp = list.stream() // Ubah list ke stream
    // Mengurutkan employee berdasarkan nama
    .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
    // Mengumpulkan hasil akhir
    .collect(Collectors.toList() );
        for(Employee e : sortedEmp){
        System.out.println(e);
        }
    }
}
// Buatlah class Employee disertai dengan getter getName() dan getSalary(),
//termasuk attribute dan method lainnya jika diperlukan!

//Output yang Diharapkan
//Employee{name='Alice', salary=50000}
//Employee{name='Bob', salary=70000}
//Employee{name='John', salary=10000}
//Employee{name='Rob', salary=40000}