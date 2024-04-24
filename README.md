# Proyek AndroidTest

Proyek ini adalah contoh aplikasi sederhana Android yang dibuat untuk demonstrasi penggunaan pengujian unit lokal dan instrumental menggunakan framework JUnit dan Espresso.

### Pengujian Unit

- **MainActivityUnitTest.java**: 
  - Pengujian unit untuk metode `generateGreetMessage` dalam kelas `MainActivity`.
  - Terdapat dua kasus uji:
    1. Pengujian pesan sapaan dengan nama.
    2. Pengujian pesan sapaan tanpa nama.

### Pengujian Instrumental

- **MainActivityInstrumentedTest.java**: 
  - Pengujian instrumental untuk interaksi antarmuka pengguna pada `MainActivity`.
  - Terdapat dua kasus uji:
    1. Pengujian input teks pada EditText dan pengecekan apakah pesan sapaan ditampilkan dengan benar.
    2. Pengujian klik tombol tanpa memasukkan teks pada EditText dan pengecekan apakah pesan sapaan default ditampilkan dengan benar.
