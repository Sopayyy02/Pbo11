/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PramukaForm;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author VIVOBOOK 14
 */
@Entity
@Table(name = "pramuka")
@NamedQueries({
    @NamedQuery(name = "Pramuka.findAll", query = "SELECT p FROM Pramuka p"),
    @NamedQuery(name = "Pramuka.findByNta", query = "SELECT p FROM Pramuka p WHERE p.nta = :nta"),
    @NamedQuery(name = "Pramuka.findByNama", query = "SELECT p FROM Pramuka p WHERE p.nama = :nama"),
    @NamedQuery(name = "Pramuka.findByAlamat", query = "SELECT p FROM Pramuka p WHERE p.alamat = :alamat"),
    @NamedQuery(name = "Pramuka.findByJeniskelamin", query = "SELECT p FROM Pramuka p WHERE p.jeniskelamin = :jeniskelamin")})
public class Pramuka implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nta")
    private String nta;
    @Column(name = "nama")
    private String nama;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "jeniskelamin")
    private String jeniskelamin;

    public Pramuka() {
    }

    public Pramuka(String nta) {
        this.nta = nta;
    }

    public String getNta() {
        return nta;
    }

    public void setNta(String nta) {
        this.nta = nta;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nta != null ? nta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pramuka)) {
            return false;
        }
        Pramuka other = (Pramuka) object;
        if ((this.nta == null && other.nta != null) || (this.nta != null && !this.nta.equals(other.nta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PramukaForm.Pramuka[ nta=" + nta + " ]";
    }
    
}
