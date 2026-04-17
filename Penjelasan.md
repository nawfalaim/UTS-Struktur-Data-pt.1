# Mengurutkan Data Kompetisi Antar Sekolah dengan Bubble Sort, Insertion Sort, dan Selection Sort

Sebuah kegiatan kompetisi antar sekolah tingkat SMA/SMK/MA dilakukan untuk mengukur kemampuan siswa dalam berbagai bidang. Dalam kompetisi ini terdapat 10 sekolah yang bersaing dan memperoleh nilai berdasarkan hasil penilaian juri. Data nilai sementara yang diperoleh adalah sebagai berikut:

| Nama Sekolah | Poin |
| --- | --- |
| SMA Negeri 1 | 88 |
| SMA Negeri 2 | 92 |
| SMA Negeri 3 | 85 |
| SMA Negeri 4 | 90 |
| SMA Negeri 5 | 87 |
| SMA Negeri 6 | 93 |
| SMA Negeri 7 | 84 |
| SMA Negeri 8 | 89 |
| SMA Negeri 9 | 91 |
| SMA Negeri 10 | 86 |

---

## 1. Teknik Bubble Sort

Bubble Sort merupakan metode pengurutan data yang bekerja dengan cara mengecek dua data yang berdekatan secara berulang. Jika urutannya belum sesuai, maka kedua data tersebut akan ditukar. Proses ini terus dilakukan sampai seluruh data berada pada urutan yang benar.

Metode ini dapat diibaratkan seperti proses “menggeser” nilai terbesar secara perlahan ke posisi paling akhir pada setiap tahap pengurutan.

### Coding Bubble Sort
[Bubble Sort](BubbleSort.java)

### Output Bubble Sort
![Bubble Sort](bubble.png)

---

## 2. Teknik Insertion Sort

Insertion Sort adalah metode pengurutan yang bekerja dengan cara memasukkan setiap data ke posisi yang tepat pada bagian data yang sudah terurut. Setiap elemen akan dibandingkan dan ditempatkan sesuai urutan yang benar.

Cara kerja metode ini mirip seperti menyusun kartu secara berurutan di tangan, di mana setiap kartu baru langsung ditempatkan pada posisi yang sesuai.

### Coding Insertion Sort
[Insertion Sort](InsertionSort.java)

### Output Insertion Sort
![Insertion Sort](insertion.png)

---

## 3. Teknik Selection Sort

Selection Sort merupakan metode pengurutan yang mencari nilai terbesar (atau terkecil) dari seluruh data, kemudian menukarnya dengan data di posisi awal. Proses ini dilakukan berulang sampai semua data tersusun dengan benar.

Metode ini lebih menekankan pada proses pemilihan nilai terbaik di setiap langkah pengurutan.

### Coding Selection Sort
[Selection Sort](SelectionSort.java)

### Output Selection Sort
![Selection Sort](selection.png)

---

## Kesimpulan

Dari ketiga metode pengurutan yang digunakan, yaitu Bubble Sort, Insertion Sort, dan Selection Sort, semuanya menghasilkan urutan data yang sama, yaitu dari nilai tertinggi ke terendah.

Perbedaannya hanya terdapat pada cara kerja masing-masing algoritma dalam melakukan proses pengurutan data.