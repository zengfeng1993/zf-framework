package com.zf.domian;

import javax.persistence.*;

/**
 * SysMenu
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "sys_menu", schema = "", catalog = "wholesale")
public class SysMenu {
    private int menuId;
    private String menuName;
    private String menuUrl;
    private String parentId;
    private String menuOrder;
    private String menuIcon;
    private String menuType;

    @Id
    @Column(name = "MENU_ID", nullable = false, insertable = true, updatable = true)
    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    @Basic
    @Column(name = "MENU_NAME", nullable = true, insertable = true, updatable = true, length = 255)
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Basic
    @Column(name = "MENU_URL", nullable = true, insertable = true, updatable = true, length = 255)
    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
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
    @Column(name = "MENU_ORDER", nullable = true, insertable = true, updatable = true, length = 100)
    public String getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(String menuOrder) {
        this.menuOrder = menuOrder;
    }

    @Basic
    @Column(name = "MENU_ICON", nullable = true, insertable = true, updatable = true, length = 30)
    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    @Basic
    @Column(name = "MENU_TYPE", nullable = true, insertable = true, updatable = true, length = 10)
    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysMenu sysMenu = (SysMenu) o;

        if (menuId != sysMenu.menuId) return false;
        if (menuName != null ? !menuName.equals(sysMenu.menuName) : sysMenu.menuName != null) return false;
        if (menuUrl != null ? !menuUrl.equals(sysMenu.menuUrl) : sysMenu.menuUrl != null) return false;
        if (parentId != null ? !parentId.equals(sysMenu.parentId) : sysMenu.parentId != null) return false;
        if (menuOrder != null ? !menuOrder.equals(sysMenu.menuOrder) : sysMenu.menuOrder != null) return false;
        if (menuIcon != null ? !menuIcon.equals(sysMenu.menuIcon) : sysMenu.menuIcon != null) return false;
        if (menuType != null ? !menuType.equals(sysMenu.menuType) : sysMenu.menuType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = menuId;
        result = 31 * result + (menuName != null ? menuName.hashCode() : 0);
        result = 31 * result + (menuUrl != null ? menuUrl.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (menuOrder != null ? menuOrder.hashCode() : 0);
        result = 31 * result + (menuIcon != null ? menuIcon.hashCode() : 0);
        result = 31 * result + (menuType != null ? menuType.hashCode() : 0);
        return result;
    }
}
