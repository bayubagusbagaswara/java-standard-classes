# Date & Calendar

- Tiap bahasa pemrogaman biasanya memiliki representasi tanggal
- di Java ada class `Date & Calendar` yang bisa kita gunakan sebagai representasi tanggal
- Sebenarnya di Java 8 sudah ada cara manipulasi tanggal yang baru, yakni menggunakan `Java Date Time API`

# Hubungan Date dan Calendar

- Class Date adalah class representasi tanggal sampai presisi `milisecond`
- Namun di class Date sudah banyak method-methodyang di `deprecated` 
- Sehingga untuk memanipulasi date tanggal, kita sekarang harus melakukan kombinasi antara Class Date dan Calendar
- Sederhananya Date itu untuk representasi tanggal, dan Calendar untuk memanipulasi tanggal