package entity;

/**
 *
 * @author asus
 */
public class Buku {
    private String id;
    private String nama;
    private String jenis_buku;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getjenis_buku() {
        return jenis_buku;
    }

    public void setjenis_buku(String merk_motor) {
        this.jenis_buku = jenis_buku;
    }

    public Buku(String id, String nama, String jenis_buku) {
        this.id = id;
        this.nama = nama;
        this.jenis_buku = jenis_buku;
    }


    public boolean equals(Object object) {
        Buku temp = (Buku) object;
        return id.equals(temp.getId());
    }
}

