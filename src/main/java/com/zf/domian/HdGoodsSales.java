package com.zf.domian;

import javax.persistence.*;

/**
 * HdGoodsSales
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_sales", schema = "", catalog = "wholesale")
public class HdGoodsSales {
    private int gsId;
    private Integer goodsId;
    private Double totalSales;
    private Integer salesCount;
    private Integer gaId;

    @Id
    @Column(name = "gs_id", nullable = false, insertable = true, updatable = true)
    public int getGsId() {
        return gsId;
    }

    public void setGsId(int gsId) {
        this.gsId = gsId;
    }

    @Basic
    @Column(name = "goods_id", nullable = true, insertable = true, updatable = true)
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
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

    @Basic
    @Column(name = "ga_id", nullable = true, insertable = true, updatable = true)
    public Integer getGaId() {
        return gaId;
    }

    public void setGaId(Integer gaId) {
        this.gaId = gaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdGoodsSales that = (HdGoodsSales) o;

        if (gsId != that.gsId) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (totalSales != null ? !totalSales.equals(that.totalSales) : that.totalSales != null) return false;
        if (salesCount != null ? !salesCount.equals(that.salesCount) : that.salesCount != null) return false;
        if (gaId != null ? !gaId.equals(that.gaId) : that.gaId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gsId;
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (totalSales != null ? totalSales.hashCode() : 0);
        result = 31 * result + (salesCount != null ? salesCount.hashCode() : 0);
        result = 31 * result + (gaId != null ? gaId.hashCode() : 0);
        return result;
    }
}
