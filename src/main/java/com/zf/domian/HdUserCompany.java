package com.zf.domian;

import javax.persistence.*;

/**
 * HdUserCompany
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_user_company", schema = "", catalog = "wholesale")
public class HdUserCompany {
    private int ucId;
    private Integer userId;
    private String legalPerson;
    private String company;
    private String companyAddr;
    private String fax;
    private String companyScale;
    private String regCapital;
    private String comRegTime;
    private Integer turnover;
    private String operatingRange;
    private String industry;
    private String operRangeOther;
    private String industryOther;
    private String advantage;
    private String certificate;

    @Id
    @Column(name = "uc_id", nullable = false, insertable = true, updatable = true)
    public int getUcId() {
        return ucId;
    }

    public void setUcId(int ucId) {
        this.ucId = ucId;
    }

    @Basic
    @Column(name = "user_id", nullable = true, insertable = true, updatable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "legal_person", nullable = true, insertable = true, updatable = true, length = 16)
    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    @Basic
    @Column(name = "company", nullable = true, insertable = true, updatable = true, length = 60)
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Basic
    @Column(name = "company_addr", nullable = true, insertable = true, updatable = true, length = 200)
    public String getCompanyAddr() {
        return companyAddr;
    }

    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr;
    }

    @Basic
    @Column(name = "fax", nullable = true, insertable = true, updatable = true, length = 16)
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @Column(name = "company_scale", nullable = true, insertable = true, updatable = true, length = 32)
    public String getCompanyScale() {
        return companyScale;
    }

    public void setCompanyScale(String companyScale) {
        this.companyScale = companyScale;
    }

    @Basic
    @Column(name = "reg_capital", nullable = true, insertable = true, updatable = true, length = 32)
    public String getRegCapital() {
        return regCapital;
    }

    public void setRegCapital(String regCapital) {
        this.regCapital = regCapital;
    }

    @Basic
    @Column(name = "com_reg_time", nullable = true, insertable = true, updatable = true, length = 10)
    public String getComRegTime() {
        return comRegTime;
    }

    public void setComRegTime(String comRegTime) {
        this.comRegTime = comRegTime;
    }

    @Basic
    @Column(name = "turnover", nullable = true, insertable = true, updatable = true)
    public Integer getTurnover() {
        return turnover;
    }

    public void setTurnover(Integer turnover) {
        this.turnover = turnover;
    }

    @Basic
    @Column(name = "operating_range", nullable = true, insertable = true, updatable = true, length = 40)
    public String getOperatingRange() {
        return operatingRange;
    }

    public void setOperatingRange(String operatingRange) {
        this.operatingRange = operatingRange;
    }

    @Basic
    @Column(name = "industry", nullable = true, insertable = true, updatable = true, length = 40)
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Basic
    @Column(name = "oper_range_other", nullable = true, insertable = true, updatable = true, length = 60)
    public String getOperRangeOther() {
        return operRangeOther;
    }

    public void setOperRangeOther(String operRangeOther) {
        this.operRangeOther = operRangeOther;
    }

    @Basic
    @Column(name = "industry_other", nullable = true, insertable = true, updatable = true, length = 60)
    public String getIndustryOther() {
        return industryOther;
    }

    public void setIndustryOther(String industryOther) {
        this.industryOther = industryOther;
    }

    @Basic
    @Column(name = "advantage", nullable = true, insertable = true, updatable = true, length = 40)
    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage;
    }

    @Basic
    @Column(name = "certificate", nullable = true, insertable = true, updatable = true, length = 40)
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdUserCompany that = (HdUserCompany) o;

        if (ucId != that.ucId) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (legalPerson != null ? !legalPerson.equals(that.legalPerson) : that.legalPerson != null) return false;
        if (company != null ? !company.equals(that.company) : that.company != null) return false;
        if (companyAddr != null ? !companyAddr.equals(that.companyAddr) : that.companyAddr != null) return false;
        if (fax != null ? !fax.equals(that.fax) : that.fax != null) return false;
        if (companyScale != null ? !companyScale.equals(that.companyScale) : that.companyScale != null) return false;
        if (regCapital != null ? !regCapital.equals(that.regCapital) : that.regCapital != null) return false;
        if (comRegTime != null ? !comRegTime.equals(that.comRegTime) : that.comRegTime != null) return false;
        if (turnover != null ? !turnover.equals(that.turnover) : that.turnover != null) return false;
        if (operatingRange != null ? !operatingRange.equals(that.operatingRange) : that.operatingRange != null)
            return false;
        if (industry != null ? !industry.equals(that.industry) : that.industry != null) return false;
        if (operRangeOther != null ? !operRangeOther.equals(that.operRangeOther) : that.operRangeOther != null)
            return false;
        if (industryOther != null ? !industryOther.equals(that.industryOther) : that.industryOther != null)
            return false;
        if (advantage != null ? !advantage.equals(that.advantage) : that.advantage != null) return false;
        if (certificate != null ? !certificate.equals(that.certificate) : that.certificate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ucId;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (legalPerson != null ? legalPerson.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (companyAddr != null ? companyAddr.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (companyScale != null ? companyScale.hashCode() : 0);
        result = 31 * result + (regCapital != null ? regCapital.hashCode() : 0);
        result = 31 * result + (comRegTime != null ? comRegTime.hashCode() : 0);
        result = 31 * result + (turnover != null ? turnover.hashCode() : 0);
        result = 31 * result + (operatingRange != null ? operatingRange.hashCode() : 0);
        result = 31 * result + (industry != null ? industry.hashCode() : 0);
        result = 31 * result + (operRangeOther != null ? operRangeOther.hashCode() : 0);
        result = 31 * result + (industryOther != null ? industryOther.hashCode() : 0);
        result = 31 * result + (advantage != null ? advantage.hashCode() : 0);
        result = 31 * result + (certificate != null ? certificate.hashCode() : 0);
        return result;
    }
}
