// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package edu.unlv.kilo.domain;

import edu.unlv.kilo.domain.ItemEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect ItemEntity_Roo_Jpa_Entity {
    
    declare @type: ItemEntity: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long ItemEntity.id;
    
    @Version
    @Column(name = "version")
    private Integer ItemEntity.version;
    
    public Long ItemEntity.getId() {
        return this.id;
    }
    
    public void ItemEntity.setId(Long id) {
        this.id = id;
    }
    
    public Integer ItemEntity.getVersion() {
        return this.version;
    }
    
    public void ItemEntity.setVersion(Integer version) {
        this.version = version;
    }
    
}
