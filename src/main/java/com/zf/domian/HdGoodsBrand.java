package com.zf.domian;

import javax.persistence.*;

/**
 * HdGoodsBrand
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_brand", schema = "", catalog = "wholesale")
public class HdGoodsBrand {
    private int gbId;
    private String gbName;
    private String gbLogo;

    @Id
    @Column(name = "gb_id", nullable = false, insertable = true, updatable = true)
    public int getGbId() {
        return gbId;
    }

    public void setGbId(int gbId) {
        this.gbId = gbId;
    }

    @Basic
    @Column(name = "gb_name", nullable = true, insertable = true, updatable = true, length = 20)
    public String getGbName() {
        return gbName;
    }

    public void setGbName(String gbName) {
        this.gbName = gbName;
    }

    @Basic
    @Column(name = "gb_logo", nullable = true, insertable = true, updatable = true, length = 255)
    public String getGbLogo() {
        return gbLogo;
    }

    public void setGbLogo(String gbLogo) {
        this.gbLogo = gbLogo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdGoodsBrand that = (HdGoodsBrand) o;

        if (gbId != that.gbId) return false;
        if (gbName != null ? !gbName.equals(that.gbName) : that.gbName != null) return false;
        if (gbLogo != null ? !gbLogo.equals(that.gbLogo) : that.gbLogo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gbId;
        result = 31 * result + (gbName != null ? gbName.hashCode() : 0);
        result = 31 * result + (gbLogo != null ? gbLogo.hashCode() : 0);
        return result;
    }
}
