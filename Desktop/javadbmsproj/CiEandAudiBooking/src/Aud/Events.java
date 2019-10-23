/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aud;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author pushya
 */
@Entity
@Table(name = "Events", catalog = "aud_jdbms", schema = "")
@NamedQueries({
    @NamedQuery(name = "Events.findAll", query = "SELECT e FROM Events e")
    , @NamedQuery(name = "Events.findByEventID", query = "SELECT e FROM Events e WHERE e.eventID = :eventID")
    , @NamedQuery(name = "Events.findByEventName", query = "SELECT e FROM Events e WHERE e.eventName = :eventName")
    , @NamedQuery(name = "Events.findByMxStRqFrEvnt", query = "SELECT e FROM Events e WHERE e.mxStRqFrEvnt = :mxStRqFrEvnt")
    , @NamedQuery(name = "Events.findByDate", query = "SELECT e FROM Events e WHERE e.date = :date")
    , @NamedQuery(name = "Events.findByStartTime", query = "SELECT e FROM Events e WHERE e.startTime = :startTime")
    , @NamedQuery(name = "Events.findByEndTime", query = "SELECT e FROM Events e WHERE e.endTime = :endTime")})
public class Events implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Event_ID")
    private Integer eventID;
    @Column(name = "Event_Name")
    private String eventName;
    @Column(name = "MxStRqFrEvnt")
    private Integer mxStRqFrEvnt;
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "StartTime")
    @Temporal(TemporalType.TIME)
    private Date startTime;
    @Column(name = "EndTime")
    @Temporal(TemporalType.TIME)
    private Date endTime;

    public Events() {
    }

    public Events(Integer eventID) {
        this.eventID = eventID;
    }

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        Integer oldEventID = this.eventID;
        this.eventID = eventID;
        changeSupport.firePropertyChange("eventID", oldEventID, eventID);
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        String oldEventName = this.eventName;
        this.eventName = eventName;
        changeSupport.firePropertyChange("eventName", oldEventName, eventName);
    }

    public Integer getMxStRqFrEvnt() {
        return mxStRqFrEvnt;
    }

    public void setMxStRqFrEvnt(Integer mxStRqFrEvnt) {
        Integer oldMxStRqFrEvnt = this.mxStRqFrEvnt;
        this.mxStRqFrEvnt = mxStRqFrEvnt;
        changeSupport.firePropertyChange("mxStRqFrEvnt", oldMxStRqFrEvnt, mxStRqFrEvnt);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        Date oldStartTime = this.startTime;
        this.startTime = startTime;
        changeSupport.firePropertyChange("startTime", oldStartTime, startTime);
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        Date oldEndTime = this.endTime;
        this.endTime = endTime;
        changeSupport.firePropertyChange("endTime", oldEndTime, endTime);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventID != null ? eventID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Events)) {
            return false;
        }
        Events other = (Events) object;
        if ((this.eventID == null && other.eventID != null) || (this.eventID != null && !this.eventID.equals(other.eventID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aud.Events[ eventID=" + eventID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
