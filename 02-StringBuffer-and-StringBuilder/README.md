# Immutable String

- String adalah tipe data immutable, artinya tidak bisa berubah isinya
- Saat kita mengubah string, sebenarnya yang dilakukan di Java adalah `membuat String baru`
- Jika kita ingin memanipulasi String dalam jumlah yang banyak, maka sangat tidak disarankan menggunakan String, karena akan memakan memory yang cukup besar
- Untuk kasus seperti diatas, lebih disarankan menggunakan `StringBuffer` atau `StringBuilder`

# StringBuffer vs StringBuilder

- Kemampuan StringBuffer dan StringBuilder cukup sama, bisa digunakan untuk memanipulasi String
- Yang membedakan adalah `StringBuffer` itu `thread safe`
- Sedangkan `StringBuilder` itu `tidak thread safe`
- Jika kita ingin memanipulasi String secara paralel atau bersamaan, maka disarankan menggunakan StringBuffer
- Namun, jika tidak butuh secara paralel, maka cukup gunakan StringBuilder
- Karena StringBuffer dibuat agar thread safe, maka secara otomatis performanya `lebih lambat` dibandingkan StringBuilder

