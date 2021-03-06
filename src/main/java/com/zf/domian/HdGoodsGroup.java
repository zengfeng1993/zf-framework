package com.zf.domian;

import javax.persistence.*;

/**
 * HdGoodsGroup
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_group", schema = "", catalog = "wholesale")
public class HdGoodsGroup {
    private int ggId;
    private String goodsIds;
    private Double groupPrice;

    @Id
    @Column(name = "gg_id", nullable = false, insertable = true, updatable = true)
    public int getGgId() {
        return ggId;
    }

    public void setGgId(int ggId) {
        this.ggId = ggId;
    }

    @Basic
    @Column(name = "goods_ids", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getGoodsIds() {
        return goodsIds;
    }

    public void setGoodsIds(String goodsIds) {
        this.goodsIds = goodsIds;
    }

    @Basic
    @Column(name = "group_price", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getGroupPrice() {
        return groupPrice;
    }

    public void setGroupPrice(Double groupPrice) {
        this.groupPrice = groupPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdGoodsGroup that = (HdGoodsGroup) o;

        if (ggId != that.ggId) return false;
        if (goodsIds != null ? !goodsIds.equals(that.goodsIds) : that.goodsIds != null) return false;
        if (groupPrice != null ? !groupPrice.equals(that.groupPrice) : that.groupPrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ggId;
        result = 31 * result + (goodsIds != null ? goodsIds.hashCode() : 0);
        result = 31 * result + (groupPrice != null ? groupPrice.hashCode() : 0);
        return result;
    }
}
