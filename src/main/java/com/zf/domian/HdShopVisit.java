package com.zf.domian;

import javax.persistence.*;

/**
 * HdShopVisit
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_shop_visit", schema = "", catalog = "wholesale")
public class HdShopVisit {
    private int svId;
    private Integer shopId;
    private String visitTime;
    private String visitIp;

    @Id
    @Column(name = "sv_id", nullable = false, insertable = true, updatable = true)
    public int getSvId() {
        return svId;
    }

    public void setSvId(int svId) {
        this.svId = svId;
    }

    @Basic
    @Column(name = "shop_id", nullable = true, insertable = true, updatable = true)
    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "visit_time", nullable = true, insertable = true, updatable = true, length = 20)
    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime;
    }

    @Basic
    @Column(name = "visit_ip", nullable = true, insertable = true, updatable = true, length = 15)
    public String getVisitIp() {
        return visitIp;
    }

    public void setVisitIp(String visitIp) {
        this.visitIp = visitIp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdShopVisit that = (HdShopVisit) o;

        if (svId != that.svId) return false;
        if (shopId != null ? !shopId.equals(that.shopId) : that.shopId != null) return false;
        if (visitTime != null ? !visitTime.equals(that.visitTime) : that.visitTime != null) return false;
        if (visitIp != null ? !visitIp.equals(that.visitIp) : that.visitIp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = svId;
        result = 31 * result + (shopId != null ? shopId.hashCode() : 0);
        result = 31 * result + (visitTime != null ? visitTime.hashCode() : 0);
        result = 31 * result + (visitIp != null ? visitIp.hashCode() : 0);
        return result;
    }
}
