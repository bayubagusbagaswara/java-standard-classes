# Regular Expression

- Regular Expression atau disingkat `regex` adalah cara untuk melakukan `pola pencarian`
- Biasanya dilakukan untuk pencarian dalam data String
- Secara sederhana, kita mungkin sudah sering melakukan pencarian text, entah di text editor atau di aplikasi word
- Regex adalah pencarian yang lebih advanced dibanding pencarian text biasanya
- Misal kita ingin mencari semua kata yang diawali huruf "a" dan diakhiri huruf "a" dan lain-lain

# Regex package

- Java sudah menyediakan package `java.util.regex` yang berisikan utilitas untuk melakukan proses regular expression
- Secara garis besar terdapat 2 class yang dapat kita gunakan, yaitu `Pattern class` dan `Matcher class`
- Pattern class adalah representasi hasil kompilasi dari pola regular expression yang kita buat
- Matcher class adalah engine untuk melakukan pencarian dari pattern yang sudah kita buat

# Aturan Regular Expression

- Aturan regular expression sangat kaya
- Kita bisa melihat detail aturannya di halaman javadoc class Pattern