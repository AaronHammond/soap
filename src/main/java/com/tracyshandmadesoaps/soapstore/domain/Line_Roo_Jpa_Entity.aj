// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.tracyshandmadesoaps.soapstore.domain;

import com.tracyshandmadesoaps.soapstore.domain.Line;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Line_Roo_Jpa_Entity {
    
    declare @type: Line: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Line.id;
    
    @Version
    @Column(name = "version")
    private Integer Line.version;
    
    public Long Line.getId() {
        return this.id;
    }
    
    public void Line.setId(Long id) {
        this.id = id;
    }
    
    public Integer Line.getVersion() {
        return this.version;
    }
    
    public void Line.setVersion(Integer version) {
        this.version = version;
    }
    
}
