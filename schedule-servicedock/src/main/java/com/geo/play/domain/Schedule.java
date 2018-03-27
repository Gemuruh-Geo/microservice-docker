package com.geo.play.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(
        name = "arts_t_schedule"
)
public class Schedule {
    @Column(
            name = "c_schedule_id"
    )
    @Id
    @GeneratedValue(
            generator = "uuid"
    )
    @GenericGenerator(
            name = "uuid",
            strategy = "uuid2"
    )
    private String id;
    @Column(
            name = "c_schedule_noka"
    )
    private String noka;
    @Column(
            name = "c_schedule_startdate"
    )
    @JsonSerialize(
            using = LocalDateSerializer.class
    )
    @JsonDeserialize(
            using = LocalDateDeserializer.class
    )
    @JsonFormat(
            pattern = "yyyy-MM-dd"
    )
    @Type(
            type = "org.hibernate.type.LocalDateType"
    )
    private LocalDate startdate;
    @Column(
            name = "c_schedule_enddate"
    )
    @JsonSerialize(
            using = LocalDateSerializer.class
    )
    @JsonDeserialize(
            using = LocalDateDeserializer.class
    )
    @JsonFormat(
            pattern = "yyyy-MM-dd"
    )
    @Type(
            type = "org.hibernate.type.LocalDateType"
    )
    private LocalDate enddate;
    @Column(
            name = "c_schedule_note"
    )
    private String note;
    @Column(
            name = "c_traintype_id"
    )
    private String traintypeid;
    @Column(
            name = "c_train_id"
    )
    private String trainid;
    @Column(
            name = "c_schedule_status"
    )
    private String status;
    @Column(
            name = "c_schedule_domain"
    )
    private String domain;
    @Column(
            name = "c_schedule_modifiedby"
    )
    private String modifiedby;
    @Column(
            name = "c_schedule_modifiedon"
    )
    @JsonSerialize(
            using = LocalDateTimeSerializer.class
    )
    @JsonDeserialize(
            using = LocalDateTimeDeserializer.class
    )
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss"
    )
    @Type(
            type = "org.hibernate.type.LocalDateTimeType"
    )
    private LocalDateTime modifiedon;
    @Column(
            name = "c_trainmiles_id"
    )
    private String trainmilesid;
    @Column(
            name = "c_trainrunning_id"
    )
    private String trainrunningid;
    @Column(
            name = "c_schedule_localstat"
    )
    private String localstat;
    @Column(
            name = "c_schedule_validdays"
    )
    private String validdays;
    @Column(
            name = "c_schedule_noseatalloc"
    )
    private String noseatalloc;
    @Column(
            name = "c_schedule_noseattype"
    )
    private String noseattype;
    @Column(
            name = "c_schedule_routedesc"
    )
    private String rotuedesc;
    @Column(
            name = "c_schedule_createdby"
    )
    private String createdby;
    @Column(
            name = "c_schedule_createdon"
    )
    @JsonSerialize(
            using = LocalDateTimeSerializer.class
    )
    @JsonDeserialize(
            using = LocalDateTimeDeserializer.class
    )
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss"
    )
    @Type(
            type = "org.hibernate.type.LocalDateTimeType"
    )
    private LocalDateTime createdon;
    @Column(
            name = "c_trainrunning_value"
    )
    private int trainrunningvalue;
    @Column(
            name = "c_train_name"
    )
    private String trainname;

    @Transient
    private String departtime;
    @Transient
    private String arivingtime;
    @Transient
    private int availableseat;

    public Schedule() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNoka() {
        return this.noka;
    }

    public void setNoka(String noka) {
        this.noka = noka;
    }

    public LocalDate getStartdate() {
        return this.startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public LocalDate getEnddate() {
        return this.enddate;
    }

    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTraintypeid() {
        return this.traintypeid;
    }

    public void setTraintypeid(String traintypeid) {
        this.traintypeid = traintypeid;
    }

    public String getTrainid() {
        return this.trainid;
    }

    public void setTrainid(String trainid) {
        this.trainid = trainid;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getModifiedby() {
        return this.modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    public LocalDateTime getModifiedon() {
        return this.modifiedon;
    }

    public void setModifiedon(LocalDateTime modifiedon) {
        this.modifiedon = modifiedon;
    }

    public String getTrainmilesid() {
        return this.trainmilesid;
    }

    public void setTrainmilesid(String trainmilesid) {
        this.trainmilesid = trainmilesid;
    }

    public String getTrainrunningid() {
        return this.trainrunningid;
    }

    public void setTrainrunningid(String trainrunningid) {
        this.trainrunningid = trainrunningid;
    }

    public String getLocalstat() {
        return this.localstat;
    }

    public void setLocalstat(String localstat) {
        this.localstat = localstat;
    }

    public String getValiddays() {
        return this.validdays;
    }

    public void setValiddays(String validdays) {
        this.validdays = validdays;
    }

    public String getNoseatalloc() {
        return this.noseatalloc;
    }

    public void setNoseatalloc(String noseatalloc) {
        this.noseatalloc = noseatalloc;
    }

    public String getNoseattype() {
        return this.noseattype;
    }

    public void setNoseattype(String noseattype) {
        this.noseattype = noseattype;
    }

    public String getRotuedesc() {
        return this.rotuedesc;
    }

    public void setRotuedesc(String rotuedesc) {
        this.rotuedesc = rotuedesc;
    }

    public String getCreatedby() {
        return this.createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public LocalDateTime getCreatedon() {
        return this.createdon;
    }

    public void setCreatedon(LocalDateTime createdon) {
        this.createdon = createdon;
    }

    public int getTrainrunningvalue() {
        return this.trainrunningvalue;
    }

    public void setTrainrunningvalue(int trainrunningvalue) {
        this.trainrunningvalue = trainrunningvalue;
    }

    public String getTrainname() {
        return this.trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname;
    }

    public String getDeparttime() {
        return this.departtime;
    }

    public void setDeparttime(String departtime) {
        this.departtime = departtime;
    }

    public String getArivingtime() {
        return this.arivingtime;
    }

    public void setArivingtime(String arivingtime) {
        this.arivingtime = arivingtime;
    }

    public int getAvailableseat() {
        return this.availableseat;
    }

    public void setAvailableseat(int availableseat) {
        this.availableseat = availableseat;
    }
}

