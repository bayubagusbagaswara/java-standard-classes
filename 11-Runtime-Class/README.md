# Runtime Class

- Ketika aplikasi Java kita berjalan, kita bisa melihat informasi environment tempat aplikasi Java berjalan
- Informasi itu terdapat di class Runtime
- Class Runtime tidak bisa dibuat, secara otomatis Java akan membuat single object. Kita bisa mengakses object tersebut menggunakan static method `getRuntime()` milik class Runtime

# Method di Runtime Class

- `int availableProcessors()` untuk mendapatkan jumlah core CPU
- `long freeMemory()` untuk mendapatkan jumlah memory bebas di JVM
- `long totalMemory()` untuk mendapatkan jumlah total memory di JVM
- `long maxMemory()` untuk mendapatkan jumlah maksimum memory di JVM
- `void gc()` untuk menjalankan garbage collector untuk menghilangkan data di memory yang sudah tidak terpakai lagi