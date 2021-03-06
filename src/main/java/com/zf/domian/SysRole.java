package com.zf.domian;

import javax.persistence.*;

/**
 * SysRole
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "sys_role", schema = "", catalog = "wholesale")
public class SysRole {
    private String roleId;
    private String roleName;
    private String rights;
    private String parentId;
    private String addQx;
    private String delQx;
    private String editQx;
    private String chaQx;
    private String qxId;

    @Id
    @Column(name = "ROLE_ID", nullable = false, insertable = true, updatable = true, length = 100)
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "ROLE_NAME", nullable = true, insertable = true, updatable = true, length = 100)
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "RIGHTS", nullable = true, insertable = true, updatable = true, length = 255)
    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights;
    }

    @Basic
    @Column(name = "PARENT_ID", nullable = true, insertable = true, updatable = true, length = 100)
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "ADD_QX", nullable = true, insertable = true, updatable = true, length = 255)
    public String getAddQx() {
        return addQx;
    }

    public void setAddQx(String addQx) {
        this.addQx = addQx;
    }

    @Basic
    @Column(name = "DEL_QX", nullable = true, insertable = true, updatable = true, length = 255)
    public String getDelQx() {
        return delQx;
    }

    public void setDelQx(String delQx) {
        this.delQx = delQx;
    }

    @Basic
    @Column(name = "EDIT_QX", nullable = true, insertable = true, updatable = true, length = 255)
    public String getEditQx() {
        return editQx;
    }

    public void setEditQx(String editQx) {
        this.editQx = editQx;
    }

    @Basic
    @Column(name = "CHA_QX", nullable = true, insertable = true, updatable = true, length = 255)
    public String getChaQx() {
        return chaQx;
    }

    public void setChaQx(String chaQx) {
        this.chaQx = chaQx;
    }

    @Basic
    @Column(name = "QX_ID", nullable = true, insertable = true, updatable = true, length = 100)
    public String getQxId() {
        return qxId;
    }

    public void setQxId(String qxId) {
        this.qxId = qxId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysRole sysRole = (SysRole) o;

        if (roleId != null ? !roleId.equals(sysRole.roleId) : sysRole.roleId != null) return false;
        if (roleName != null ? !roleName.equals(sysRole.roleName) : sysRole.roleName != null) return false;
        if (rights != null ? !rights.equals(sysRole.rights) : sysRole.rights != null) return false;
        if (parentId != null ? !parentId.equals(sysRole.parentId) : sysRole.parentId != null) return false;
        if (addQx != null ? !addQx.equals(sysRole.addQx) : sysRole.addQx != null) return false;
        if (delQx != null ? !delQx.equals(sysRole.delQx) : sysRole.delQx != null) return false;
        if (editQx != null ? !editQx.equals(sysRole.editQx) : sysRole.editQx != null) return false;
        if (chaQx != null ? !chaQx.equals(sysRole.chaQx) : sysRole.chaQx != null) return false;
        if (qxId != null ? !qxId.equals(sysRole.qxId) : sysRole.qxId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId != null ? roleId.hashCode() : 0;
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        result = 31 * result + (rights != null ? rights.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (addQx != null ? addQx.hashCode() : 0);
        result = 31 * result + (delQx != null ? delQx.hashCode() : 0);
        result = 31 * result + (editQx != null ? editQx.hashCode() : 0);
        result = 31 * result + (chaQx != null ? chaQx.hashCode() : 0);
        result = 31 * result + (qxId != null ? qxId.hashCode() : 0);
        return result;
    }
}
