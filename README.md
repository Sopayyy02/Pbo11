# **🧭 Penerapan Sistem CRUD dengan Pemanfaatan CSV dan Konsep Persistence**
Tugas Pertemuan Kesebelas

# **📌 Deskripsi Tugas**

Proyek ini dikembangkan sebagai implementasi sistem CRUD (Create, Read, Update, Delete) berbasis Java Swing yang terintegrasi dengan database PostgreSQL menggunakan Java Persistence API (JPA).

Selain fitur CRUD standar, aplikasi ini juga dilengkapi dengan kemampuan unggah data melalui file CSV (Comma-Separated Values). Fitur ini memungkinkan pengguna untuk menambahkan data dalam jumlah besar secara otomatis tanpa harus menginput satu per satu melalui form.

Proses unggah CSV dilakukan menggunakan komponen JFileChooser untuk memilih file, dan BufferedReader untuk membaca serta memproses isi file baris demi baris sebelum dimasukkan ke database melalui mekanisme JPA.

**🔧 Fitur Utama:**

Tampilan Utama (Main Form): Menampilkan seluruh data dalam bentuk tabel (JTable).

Dialog Tambah, Edit, Hapus (JDialog): Menyediakan antarmuka terpisah untuk memproses data dengan rapi.

Upload CSV: Memungkinkan pengguna mengimpor file .csv ke dalam database secara otomatis.

Koneksi Database: Menggunakan PostgreSQL untuk penyimpanan data permanen.

Konsep Persistence (JPA): Mengelola penyimpanan data secara berkelanjutan tanpa menulis SQL secara manual.

**🎯 Tujuan Pengembangan:**

- Mempelajari penerapan konsep persistence dalam sistem CRUD berbasis Java.

- Mengimplementasikan Java Persistence API (JPA) untuk mengelola data objek ke database.

- Menerapkan pembacaan dan pemrosesan file CSV sebagai alternatif input data massal.

- Melatih penggunaan komponen GUI (Swing) seperti JTable, JButton, dan JFileChooser.

- Mengintegrasikan OOP, GUI, CSV, dan database dalam satu aplikasi yang terstruktur.

# **🧠 Dasar Teori**
**1. Konsep Persistence**

Persistence adalah kemampuan aplikasi untuk menyimpan data secara permanen agar tidak hilang saat program berhenti atau komputer dimatikan.
Tanpa persistence, semua data yang diolah hanya tersimpan di memori sementara (RAM).

Persistence berfungsi sebagai jembatan antara objek dalam program dan penyimpanan data (database atau file), sehingga data dapat dikelola secara konsisten dan efisien.

Manfaat Persistence:

- Menyimpan data secara otomatis dan permanen.

- Memudahkan pengambilan data kembali.

- Mengurangi kesalahan manual dalam input data.

- Memisahkan logika program dari mekanisme penyimpanan.

**2. Java Persistence API (JPA)**

Java Persistence API (JPA) adalah standar Java untuk mengelola penyimpanan dan pengambilan data menggunakan pendekatan Object-Relational Mapping (ORM).
Melalui JPA, objek Java dapat langsung dipetakan ke tabel database tanpa perlu menulis SQL secara manual.

Komponen Utama JPA:

- EntityManager: Mengelola objek entity — menyimpan, memperbarui, mencari, dan menghapus data.

- Persistence Unit: Menyimpan konfigurasi koneksi database di file persistence.xml.

Kelebihan JPA:

- Abstraksi dari SQL (lebih mudah dan aman).

- Mendukung relasi antar-objek (One-to-Many, Many-to-One).

- Transaksi otomatis dan rollback saat error.

**3. Entity dan Anotasi JPA**

Entity merupakan kelas Java yang merepresentasikan tabel dalam database.
Setiap objek dari kelas entity mewakili satu baris data.

Anotasi Penting:

- @Entity → Menandai kelas sebagai entity.

- @Table(name="nama_tabel") → Menentukan nama tabel.

- @Id → Menunjukkan primary key.

- @Column(name="nama_kolom") → Menyambungkan atribut dengan kolom database.

- @NamedQuery → Mendefinisikan query tetap untuk operasi tertentu.

Dengan anotasi ini, pengelolaan data menjadi lebih terstruktur dan terintegrasi dengan database.

**4. Integrasi CSV dengan Persistence**

CSV (Comma-Separated Values) adalah format file teks sederhana untuk menyimpan data dalam bentuk tabel.
Dalam proyek ini, CSV digunakan untuk import data massal ke database.

Alur Kerja Fitur CSV:

- Pengguna memilih file CSV melalui JFileChooser.

- Program membaca file menggunakan BufferedReader.

- Data dipecah berdasarkan tanda koma (,) dan diubah menjadi objek entity.

- Objek disimpan ke database melalui EntityManager.persist().

Integrasi ini menunjukkan penerapan persistence tidak hanya terbatas pada database, tetapi juga pada file eksternal (CSV) sebagai bentuk penyimpanan sementara.

# **🧩 Teknologi yang Digunakan:**
- Java Swing – Antarmuka pengguna (GUI).

- Java Persistence API (JPA) – Manajemen data berbasis ORM.

- EclipseLink – Provider JPA untuk koneksi database.

- PostgreSQL – Database utama.

- CSV Processing (BufferedReader) – Membaca dan mengimpor file CSV.
