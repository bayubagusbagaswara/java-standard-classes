# Number Class

- Semua number class yang bukan primitif memiliki parent class yang sama, yaitu class `Number`
- Class number memiliki banyak method yang bisa digunakan untuk melakukan konversi ke tipe number lain
- Hal ini memudahkan kita untuk mengkonversi object number dari satu tipe ke tipe number lainnya

# Konversi String ke Number

- Long, Integer, Short, Byte memiliki static method untuk melakukan konversi dari String ke number
- `parseXxx(string)` digunakan untuk mengkonversi dari `string` ke tipe data `number primitif`
- valueOf(string) digunakan untuk mengkonversi dari `string` ke tipe data `number non primitif`
- Method ini akan throw NumberFormatException jika ternyata gagal melakukan konversi String ke number