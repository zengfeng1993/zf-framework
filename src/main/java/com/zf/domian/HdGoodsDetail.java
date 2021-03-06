package com.zf.domian;

import javax.persistence.*;

/**
 * HdGoodsDetail
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_detail", schema = "", catalog = "wholesale")
public class HdGoodsDetail {
    private int gdId;
    private Integer goodsId;
    private String detail;

    @Id
    @Column(name = "gd_id", nullable = false, insertable = true, updatable = true)
    public int getGdId() {
        return gdId;
    }

    public void setGdId(int gdId) {
        this.gdId = gdId;
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
    @Column(name = "detail", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdGoodsDetail that = (HdGoodsDetail) o;

        if (gdId != that.gdId) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (detail != null ? !detail.equals(that.detail) : that.detail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gdId;
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (detail != null ? detail.hashCode() : 0);
        return result;
    }
}
