// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package edu.unlv.kilo.domain;

import java.lang.String;

privileged aspect UserRole_Roo_ToString {
    
    public String UserRole.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("RoleEntry: ").append(getRoleEntry()).append(", ");
        sb.append("UserEntry: ").append(getUserEntry()).append(", ");
        sb.append("Version: ").append(getVersion());
        return sb.toString();
    }
    
}
