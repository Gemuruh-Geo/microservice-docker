package com.geo.play.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "arts_t_transaction")
public class Transaction {

    @Column(name = "c_transaction_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_transaction_bookcode")
    private String bookcode;

    @Column(name = "c_transaction_paycode")
    private String paycode;

    @Column(name = "c_transaction_transdate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime transdate;

    @Column(name = "c_transaction_departdate")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate departdate;

    @Column(name = "c_transaction_totamount")
    private BigDecimal totamount;

    @Column(name = "c_transaction_extrafee")
    private BigDecimal extrafee;

    @Column(name = "c_transaction_netamount")
    private BigDecimal netamount;

    @Column(name = "c_transaction_paidamount")
    private BigDecimal paidamount;

    @Column(name = "c_transaction_custname")
    private String custname;

    @Column(name = "c_transaction_phonenum")
    private String phonenum;

    @Column(name = "c_transaction_email")
    private String email;

    @Column(name = "c_transaction_totpsgadult")
    private int totpsgadult;

    @Column(name = "c_transaction_totpsgchild")
    private int totpsgchild;

    @Column(name = "c_transaction_totpsginfant")
    private int totpsginfant;

    @Column(name = "c_stasiun_idorg")
    private BigInteger stasiunidorg;

    @Column(name = "c_stasiun_codeorg")
    private String stasiuncodeorg;

    @Column(name = "c_stasiun_iddes")
    private BigInteger stasiuniddes;

    @Column(name = "c_stasiun_codedes")
    private String stasiuncodedes;

    @Column(name = "c_schedule_id")
    private String scheduleid;

    @Column(name = "c_schedule_noka")
    private String schedulenoka;

    @Column(name = "c_schedule_localstat")
    private String schedulelocalstat;

    @Column(name = "c_schedule_trainname")
    private String scheduleTrainname;

    @Column(name = "c_trip_id")
    private String tripid;

    @Column(name = "c_trip_date")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate tripdate;

    @Column(name = "c_subclass_id")
    private BigInteger subclassid;

    @Column(name = "c_subclass_code")
    private String subclasscode;

    @Column(name = "c_paytype_id")
    private BigInteger paytypeid;

    @Column(name = "c_paytype_code")
    private String paytypecode;

    @Column(name = "c_user_idbook")
    private BigInteger useridbook;

    @Column(name = "c_user_fullnamebook")
    private String userfullnamebook;

    @Column(name = "c_unit_idbook")
    private BigInteger unitidbook;

    @Column(name = "c_unit_codebook")
    private String unitcodebook;

    @Column(name = "c_shift_idbook")
    private String shiftidbook;

    @Column(name = "c_channel_idbook")
    private BigInteger channelidbook;

    @Column(name = "c_channel_codebook")
    private String channelcodebook;

    @Column(name = "c_user_idpay")
    private BigInteger useridpay;

    @Column(name = "c_user_fullnamepay")
    private String userfullnamepay;

    @Column(name = "c_unit_idpay")
    private BigInteger unitidpay;

    @Column(name = "c_unit_codepay")
    private String unitcodepay;

    @Column(name = "c_shift_idpay")
    private String shiftidpay;

    @Column(name = "c_channel_idpay")
    private BigInteger channelidpay;

    @Column(name = "c_channel_codepay")
    private String channelcodepay;

    @Column(name = "c_transaction_bookedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime bookedon;

    @Column(name = "c_transaction_booktimeouton")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime booktimeouton;

    @Column(name = "c_transaction_paytimeouton")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime paytimeouton;

    @Column(name = "c_transaction_paidon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime paidon;

    @Column(name = "c_transaction_smsbooksent")
    private String smsbooksent;

    @Column(name = "c_transaction_emailbooksent")
    private String emailbooksent;

    @Column(name = "c_transaction_smspaysent")
    private String smspaysent;

    @Column(name = "c_transaction_emailpaysent")
    private String emailpaysent;

    @Column(name = "c_transaction_reroutestat")
    private String reroutestat;

    @Column(name = "c_transaction_flexiredeemstat")
    private String flexiredeemstat;

    @Column(name = "c_transaction_ref1")
    private String ref1;

    @Column(name = "c_transaction_ref2")
    private String ref2;

    @Column(name = "c_transaction_ref3")
    private String ref3;

    @Column(name = "c_voucher_id")
    private String voucherid;

    @Column(name = "c_voucher_code")
    private String vouchercode;

    @Column(name = "c_voucher_amount")
    private BigDecimal voucheramount;

    @Column(name = "c_voucher_amounttype")
    private String voucheramounttype;

    @Column(name = "c_voucher_amountconvert")
    private BigDecimal voucheramountconvert;

    @Column(name = "c_transaction_status")
    private String status;

    @Column(name = "c_transaction_domain")
    private BigInteger domain;

    @Column(name = "c_transaction_createdby")
    private BigInteger createdby;

    @Column(name = "c_transaction_createdon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime createdon;

    @Column(name = "c_transaction_modifiedby")
    private BigInteger modifiedby;

    @Column(name = "c_transaction_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime modifiedon;

    @Column(name = "c_subclass_vipstat")
    public String subclassVipstat;

    @Column(name = "c_wagonclass_code")
    private String wagonclasscode;

    @Column(name = "c_wagonclass_id")
    private BigInteger wagonclassid;

    @Column(name = "c_psg_birthdate")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate birthdate;

    @Column(name = "c_groupdiscount_code")
    private String groupDiscountCode;

    @Transient
    public String tickettype;
    @Transient
    private String billercode;
    @Transient
    private String approvalcode;

    @Transient
    private String relation;
    @Transient
    private String clientPaycode;

    @Transient
    private String stopdeparture;

    @Transient
    private String stoparival;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookcode() {
        return bookcode;
    }

    public void setBookcode(String bookcode) {
        this.bookcode = bookcode;
    }

    public String getPaycode() {
        return paycode;
    }

    public void setPaycode(String paycode) {
        this.paycode = paycode;
    }

    public LocalDateTime getTransdate() {
        return transdate;
    }

    public void setTransdate(LocalDateTime transdate) {
        this.transdate = transdate;
    }

    public LocalDate getDepartdate() {
        return departdate;
    }

    public void setDepartdate(LocalDate departdate) {
        this.departdate = departdate;
    }

    public BigDecimal getTotamount() {
        return totamount;
    }

    public void setTotamount(BigDecimal totamount) {
        this.totamount = totamount;
    }

    public BigDecimal getExtrafee() {
        return extrafee;
    }

    public void setExtrafee(BigDecimal extrafee) {
        this.extrafee = extrafee;
    }

    public BigDecimal getNetamount() {
        return netamount;
    }

    public void setNetamount(BigDecimal netamount) {
        this.netamount = netamount;
    }

    public BigDecimal getPaidamount() {
        return paidamount;
    }

    public void setPaidamount(BigDecimal paidamount) {
        this.paidamount = paidamount;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTotpsgadult() {
        return totpsgadult;
    }

    public void setTotpsgadult(int totpsgadult) {
        this.totpsgadult = totpsgadult;
    }

    public int getTotpsgchild() {
        return totpsgchild;
    }

    public void setTotpsgchild(int totpsgchild) {
        this.totpsgchild = totpsgchild;
    }

    public int getTotpsginfant() {
        return totpsginfant;
    }

    public void setTotpsginfant(int totpsginfant) {
        this.totpsginfant = totpsginfant;
    }

    public BigInteger getStasiunidorg() {
        return stasiunidorg;
    }

    public void setStasiunidorg(BigInteger stasiunidorg) {
        this.stasiunidorg = stasiunidorg;
    }

    public String getStasiuncodeorg() {
        return stasiuncodeorg;
    }

    public void setStasiuncodeorg(String stasiuncodeorg) {
        this.stasiuncodeorg = stasiuncodeorg;
    }

    public BigInteger getStasiuniddes() {
        return stasiuniddes;
    }

    public void setStasiuniddes(BigInteger stasiuniddes) {
        this.stasiuniddes = stasiuniddes;
    }

    public String getStasiuncodedes() {
        return stasiuncodedes;
    }

    public void setStasiuncodedes(String stasiuncodedes) {
        this.stasiuncodedes = stasiuncodedes;
    }

    public String getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(String scheduleid) {
        this.scheduleid = scheduleid;
    }

    public String getSchedulenoka() {
        return schedulenoka;
    }

    public void setSchedulenoka(String schedulenoka) {
        this.schedulenoka = schedulenoka;
    }

    public String getSchedulelocalstat() {
        return schedulelocalstat;
    }

    public void setSchedulelocalstat(String schedulelocalstat) {
        this.schedulelocalstat = schedulelocalstat;
    }

    public String getScheduleTrainname() {
        return scheduleTrainname;
    }

    public void setScheduleTrainname(String scheduleTrainname) {
        this.scheduleTrainname = scheduleTrainname;
    }

    public String getTripid() {
        return tripid;
    }

    public void setTripid(String tripid) {
        this.tripid = tripid;
    }

    public LocalDate getTripdate() {
        return tripdate;
    }

    public void setTripdate(LocalDate tripdate) {
        this.tripdate = tripdate;
    }

    public BigInteger getSubclassid() {
        return subclassid;
    }

    public void setSubclassid(BigInteger subclassid) {
        this.subclassid = subclassid;
    }

    public String getSubclasscode() {
        return subclasscode;
    }

    public void setSubclasscode(String subclasscode) {
        this.subclasscode = subclasscode;
    }

    public BigInteger getPaytypeid() {
        return paytypeid;
    }

    public void setPaytypeid(BigInteger paytypeid) {
        this.paytypeid = paytypeid;
    }

    public String getPaytypecode() {
        return paytypecode;
    }

    public void setPaytypecode(String paytypecode) {
        this.paytypecode = paytypecode;
    }

    public BigInteger getUseridbook() {
        return useridbook;
    }

    public void setUseridbook(BigInteger useridbook) {
        this.useridbook = useridbook;
    }

    public String getUserfullnamebook() {
        return userfullnamebook;
    }

    public void setUserfullnamebook(String userfullnamebook) {
        this.userfullnamebook = userfullnamebook;
    }

    public BigInteger getUnitidbook() {
        return unitidbook;
    }

    public void setUnitidbook(BigInteger unitidbook) {
        this.unitidbook = unitidbook;
    }

    public String getUnitcodebook() {
        return unitcodebook;
    }

    public void setUnitcodebook(String unitcodebook) {
        this.unitcodebook = unitcodebook;
    }

    public String getShiftidbook() {
        return shiftidbook;
    }

    public void setShiftidbook(String shiftidbook) {
        this.shiftidbook = shiftidbook;
    }

    public BigInteger getChannelidbook() {
        return channelidbook;
    }

    public void setChannelidbook(BigInteger channelidbook) {
        this.channelidbook = channelidbook;
    }

    public String getChannelcodebook() {
        return channelcodebook;
    }

    public void setChannelcodebook(String channelcodebook) {
        this.channelcodebook = channelcodebook;
    }

    public BigInteger getUseridpay() {
        return useridpay;
    }

    public void setUseridpay(BigInteger useridpay) {
        this.useridpay = useridpay;
    }

    public String getUserfullnamepay() {
        return userfullnamepay;
    }

    public void setUserfullnamepay(String userfullnamepay) {
        this.userfullnamepay = userfullnamepay;
    }

    public BigInteger getUnitidpay() {
        return unitidpay;
    }

    public void setUnitidpay(BigInteger unitidpay) {
        this.unitidpay = unitidpay;
    }

    public String getUnitcodepay() {
        return unitcodepay;
    }

    public void setUnitcodepay(String unitcodepay) {
        this.unitcodepay = unitcodepay;
    }

    public String getShiftidpay() {
        return shiftidpay;
    }

    public void setShiftidpay(String shiftidpay) {
        this.shiftidpay = shiftidpay;
    }

    public BigInteger getChannelidpay() {
        return channelidpay;
    }

    public void setChannelidpay(BigInteger channelidpay) {
        this.channelidpay = channelidpay;
    }

    public String getChannelcodepay() {
        return channelcodepay;
    }

    public void setChannelcodepay(String channelcodepay) {
        this.channelcodepay = channelcodepay;
    }

    public LocalDateTime getBookedon() {
        return bookedon;
    }

    public void setBookedon(LocalDateTime bookedon) {
        this.bookedon = bookedon;
    }

    public LocalDateTime getBooktimeouton() {
        return booktimeouton;
    }

    public void setBooktimeouton(LocalDateTime booktimeouton) {
        this.booktimeouton = booktimeouton;
    }

    public LocalDateTime getPaytimeouton() {
        return paytimeouton;
    }

    public void setPaytimeouton(LocalDateTime paytimeouton) {
        this.paytimeouton = paytimeouton;
    }

    public LocalDateTime getPaidon() {
        return paidon;
    }

    public void setPaidon(LocalDateTime paidon) {
        this.paidon = paidon;
    }

    public String getSmsbooksent() {
        return smsbooksent;
    }

    public void setSmsbooksent(String smsbooksent) {
        this.smsbooksent = smsbooksent;
    }

    public String getEmailbooksent() {
        return emailbooksent;
    }

    public void setEmailbooksent(String emailbooksent) {
        this.emailbooksent = emailbooksent;
    }

    public String getSmspaysent() {
        return smspaysent;
    }

    public void setSmspaysent(String smspaysent) {
        this.smspaysent = smspaysent;
    }

    public String getEmailpaysent() {
        return emailpaysent;
    }

    public void setEmailpaysent(String emailpaysent) {
        this.emailpaysent = emailpaysent;
    }

    public String getReroutestat() {
        return reroutestat;
    }

    public void setReroutestat(String reroutestat) {
        this.reroutestat = reroutestat;
    }

    public String getFlexiredeemstat() {
        return flexiredeemstat;
    }

    public void setFlexiredeemstat(String flexiredeemstat) {
        this.flexiredeemstat = flexiredeemstat;
    }

    public String getRef1() {
        return ref1;
    }

    public void setRef1(String ref1) {
        this.ref1 = ref1;
    }

    public String getRef2() {
        return ref2;
    }

    public void setRef2(String ref2) {
        this.ref2 = ref2;
    }

    public String getRef3() {
        return ref3;
    }

    public void setRef3(String ref3) {
        this.ref3 = ref3;
    }

    public String getVoucherid() {
        return voucherid;
    }

    public void setVoucherid(String voucherid) {
        this.voucherid = voucherid;
    }

    public String getVouchercode() {
        return vouchercode;
    }

    public void setVouchercode(String vouchercode) {
        this.vouchercode = vouchercode;
    }

    public String getVoucheramounttype() {
        return voucheramounttype;
    }

    public void setVoucheramounttype(String voucheramounttype) {
        this.voucheramounttype = voucheramounttype;
    }

    public BigDecimal getVoucheramount() {
        return voucheramount;
    }

    public void setVoucheramount(BigDecimal voucheramount) {
        this.voucheramount = voucheramount;
    }

    public BigDecimal getVoucheramountconvert() {
        return voucheramountconvert;
    }

    public void setVoucheramountconvert(BigDecimal voucheramountconvert) {
        this.voucheramountconvert = voucheramountconvert;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigInteger getDomain() {
        return domain;
    }

    public void setDomain(BigInteger domain) {
        this.domain = domain;
    }

    public BigInteger getCreatedby() {
        return createdby;
    }

    public void setCreatedby(BigInteger createdby) {
        this.createdby = createdby;
    }

    public LocalDateTime getCreatedon() {
        return createdon;
    }

    public void setCreatedon(LocalDateTime createdon) {
        this.createdon = createdon;
    }

    public BigInteger getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(BigInteger modifiedby) {
        this.modifiedby = modifiedby;
    }

    public LocalDateTime getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(LocalDateTime modifiedon) {
        this.modifiedon = modifiedon;
    }

    public String getSubclassVipstat() {
        return subclassVipstat;
    }

    public void setSubclassVipstat(String subclassVipstat) {
        this.subclassVipstat = subclassVipstat;
    }

    public String getTickettype() {
        return tickettype;
    }

    public void setTickettype(String tickettype) {
        this.tickettype = tickettype;
    }

    public String getWagonclasscode() {
        return wagonclasscode;
    }

    public void setWagonclasscode(String wagonclasscode) {
        this.wagonclasscode = wagonclasscode;
    }

    public BigInteger getWagonclassid() {
        return wagonclassid;
    }

    public void setWagonclassid(BigInteger wagonclassid) {
        this.wagonclassid = wagonclassid;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getBillercode() {
        return billercode;
    }

    public void setBillercode(String billercode) {
        this.billercode = billercode;
    }

    public String getApprovalcode() {
        return approvalcode;
    }

    public void setApprovalcode(String approvalcode) {
        this.approvalcode = approvalcode;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getClientPaycode() {
        return clientPaycode;
    }

    public void setClientPaycode(String clientPaycode) {
        this.clientPaycode = clientPaycode;
    }

    public String getStopdeparture() {
        return stopdeparture;
    }

    public void setStopdeparture(String stopdeparture) {
        this.stopdeparture = stopdeparture;
    }

    public String getStoparival() {
        return stoparival;
    }

    public void setStoparival(String stoparival) {
        this.stoparival = stoparival;
    }

    public String getGroupDiscountCode() {
        return groupDiscountCode;
    }

    public void setGroupDiscountCode(String groupDiscountCode) {
        this.groupDiscountCode = groupDiscountCode;
    }
}