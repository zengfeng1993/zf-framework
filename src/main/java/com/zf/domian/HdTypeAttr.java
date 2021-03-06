package com.zf.domian;

import javax.persistence.*;
import java.util.Arrays;

/**
 * HdTypeAttr
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_type_attr", schema = "", catalog = "wholesale")
public class HdTypeAttr {
    private int taId;
    private Integer gtId;
    private byte[] gaId;

    @Id
    @Column(name = "ta_id", nullable = false, insertable = true, updatable = true)
    public int getTaId() {
        return taId;
    }

    public void setTaId(int taId) {
        this.taId = taId;
    }

    @Basic
    @Column(name = "gt_id", nullable = true, insertable = true, updatable = true)
    public Integer getGtId() {
        return gtId;
    }

    public void setGtId(Integer gtId) {
        this.gtId = gtId;
    }

    @Basic
    @Column(name = "ga_id", nullable = true, insertable = true, updatable = true)
    public byte[] getGaId() {
        return gaId;
    }

    public void setGaId(byte[] gaId) {
        this.gaId = gaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdTypeAttr that = (HdTypeAttr) o;

        if (taId != that.taId) return false;
        if (gtId != null ? !gtId.equals(that.gtId) : that.gtId != null) return false;
        if (!Arrays.equals(gaId, that.gaId)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = taId;
        result = 31 * result + (gtId != null ? gtId.hashCode() : 0);
        result = 31 * result + (gaId != null ? Arrays.hashCode(gaId) : 0);
        return result;
    }
}
