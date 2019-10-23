/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aud;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author pushya
 */
@Entity
@Table(name = "Auditoriums", catalog = "aud_jdbms", schema = "")
@NamedQueries({
    @NamedQuery(name = "Auditoriums.findAll", query = "SELECT a FROM Auditoriums a")
    , @NamedQuery(name = "Auditoriums.findByAudID", query = "SELECT a FROM Auditoriums a WHERE a.audID = :audID")
    , @NamedQuery(name = "Auditoriums.findByOfSeats", query = "SELECT a FROM Auditoriums a WHERE a.ofSeats = :ofSeats")
    , @NamedQuery(name = "Auditoriums.findByStatus", query = "SELECT a FROM Auditoriums a WHERE a.status = :status")})
public class Auditoriums implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Aud_ID")
    private Integer audID;
    @Column(name = "ofSeats")
    private Integer ofSeats;
    @Column(name = "Status")
    private String status;

    public Auditoriums() {
    }

    public Auditoriums(Integer audID) {
        this.audID = audID;
    }

    public Integer getAudID() {
        return audID;
    }

    public void setAudID(Integer audID) {
        Integer oldAudID = this.audID;
        this.audID = audID;
        changeSupport.firePropertyChange("audID", oldAudID, audID);
    }

    public Integer getOfSeats() {
        return ofSeats;
    }

    public void setOfSeats(Integer ofSeats) {
        Integer oldOfSeats = this.ofSeats;
        this.ofSeats = ofSeats;
        changeSupport.firePropertyChange("ofSeats", oldOfSeats, ofSeats);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (audID != null ? audID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auditoriums)) {
            return false;
        }
        Auditoriums other = (Auditoriums) object;
        if ((this.audID == null && other.audID != null) || (this.audID != null && !this.audID.equals(other.audID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aud.Auditoriums[ audID=" + audID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
