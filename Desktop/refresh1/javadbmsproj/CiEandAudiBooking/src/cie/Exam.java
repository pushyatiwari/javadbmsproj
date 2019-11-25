/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cie;

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
@Table(name = "Exam", catalog = "cie_book", schema = "")
@NamedQueries({
    @NamedQuery(name = "Exam.findAll", query = "SELECT e FROM Exam e")
    , @NamedQuery(name = "Exam.findByCourseID", query = "SELECT e FROM Exam e WHERE e.courseID = :courseID")
    , @NamedQuery(name = "Exam.findByCourse", query = "SELECT e FROM Exam e WHERE e.course = :course")
    , @NamedQuery(name = "Exam.findByDate", query = "SELECT e FROM Exam e WHERE e.date = :date")
    , @NamedQuery(name = "Exam.findBySTime", query = "SELECT e FROM Exam e WHERE e.sTime = :sTime")
    , @NamedQuery(name = "Exam.findByETime", query = "SELECT e FROM Exam e WHERE e.eTime = :eTime")})
public class Exam implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Course_ID")
    private String courseID;
    @Column(name = "Course")
    private String course;
    @Column(name = "Date")
    private String date;
    @Column(name = "sTime")
    @Temporal(TemporalType.TIME)
    private Date sTime;
    @Column(name = "eTime")
    @Temporal(TemporalType.TIME)
    private Date eTime;

    public Exam() {
    }

    public Exam(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        String oldCourseID = this.courseID;
        this.courseID = courseID;
        changeSupport.firePropertyChange("courseID", oldCourseID, courseID);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        String oldCourse = this.course;
        this.course = course;
        changeSupport.firePropertyChange("course", oldCourse, course);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        String oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public Date getSTime() {
        return sTime;
    }

    public void setSTime(Date sTime) {
        Date oldSTime = this.sTime;
        this.sTime = sTime;
        changeSupport.firePropertyChange("STime", oldSTime, sTime);
    }

    public Date getETime() {
        return eTime;
    }

    public void setETime(Date eTime) {
        Date oldETime = this.eTime;
        this.eTime = eTime;
        changeSupport.firePropertyChange("ETime", oldETime, eTime);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (courseID != null ? courseID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Exam)) {
            return false;
        }
        Exam other = (Exam) object;
        if ((this.courseID == null && other.courseID != null) || (this.courseID != null && !this.courseID.equals(other.courseID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cie.Exam[ courseID=" + courseID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
