/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuiskipasangin.model;

/**
 *
 * @author YENI
 */

    public class kipas {
    String kode;
    String merk;
    String harga;
    String warna;
    String tgl_beli;

    
        public kipas(String kode, String merk, String harga, String warna, String tgl_beli) {
        this.kode = kode;
        this.merk = merk;
        this.harga = harga;
        this.warna = warna;
        this.tgl_beli = tgl_beli;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setTgl_beli(String tgl_beli) {
        this.tgl_beli = tgl_beli;
    }

    public String getKode() {
        return kode;
    }

    public String getMerk() {
        return merk;
    }

    public String getHarga() {
        return harga;
    }

    public String getWarna() {
        return warna;
    }

    public String getTgl_beli() {
        return tgl_beli;
    }
    
      
}


