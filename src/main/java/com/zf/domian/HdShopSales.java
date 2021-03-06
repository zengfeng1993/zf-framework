package com.zf.domian;

import javax.persistence.*;

/**
 * HdShopSales
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_shop_sales", schema = "", catalog = "wholesale")
public class HdShopSales {
    private int ssId;
    private Integer shopId;
    private Double totalSales;
    private Integer salesCount;

    @Id
    @Column(name = "ss_id", nullable = false, insertable = true, updatable = true)
    public int getSsId() {
        return ssId;
    }

    public void setSsId(int ssId) {
        this.ssId = ssId;
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
    @Column(name = "total_sales", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Double totalSales) {
        this.totalSales = totalSales;
    }

    @Basic
    @Column(name = "sales_count", nullable = true, insertable = true, updatable = true)
    public Integer getSalesCount() {
        return salesCount;
    }

    public void setSalesCount(Integer salesCount) {
        this.salesCount = salesCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdShopSales that = (HdShopSales) o;

        if (ssId != that.ssId) return false;
        if (shopId != null ? !shopId.equals(that.shopId) : that.shopId != null) return false;
        if (totalSales != null ? !totalSales.equals(that.totalSales) : that.totalSales != null) return false;
        if (salesCount != null ? !salesCount.equals(that.salesCount) : that.salesCount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ssId;
        result = 31 * result + (shopId != null ? shopId.hashCode() : 0);
        result = 31 * result + (totalSales != null ? totalSales.hashCode() : 0);
        result = 31 * result + (salesCount != null ? salesCount.hashCode() : 0);
        return result;
    }
}
