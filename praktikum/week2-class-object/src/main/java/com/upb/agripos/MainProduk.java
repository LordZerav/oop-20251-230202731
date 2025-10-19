package com.upb.agripos;
import com.upb.agripos.model.Produk;
import com.upb.agripos.util.CreditBy;

public class MainProduk {
    public static void main(String[] args) {
        //Buat objek dulu
        Produk benihPadi = new Produk("B001", "Benih Padi", 50000, 100);
        Produk pupukUrea = new Produk("B002", "Pupuk Urea", 45000, 75);
        Produk cangkul = new Produk("B003", "Cangkul", 150000, 12);

        //Tampilkan informasi produk
        System.out.println("==== Data Produk Pertanian ====");
        tampilkanProduk(benihPadi);
        tampilkanProduk(pupukUrea);
        tampilkanProduk(cangkul);

        CreditBy.showCredit(230202731, "Amru Muiz Fauzan");
    }

    //Buat method untuk nampilin informasi produk
    public static void tampilkanProduk(Produk produk) {
        System.out.println("----------------------------------");
        System.out.println("Kode produk : " + produk.getKode());
        System.out.println("Nama produk : " + produk.getNama());
        System.out.println("Harga produk : " + produk.getHarga());
        System.out.println("Stok Produk : " + produk.getStok());
    }
}