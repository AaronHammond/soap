// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.tracyshandmadesoaps.soapstore.domain;

import com.tracyshandmadesoaps.soapstore.domain.Cart;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Cart_Roo_Jpa_Entity {
    
    declare @type: Cart: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Cart.id;
    
    @Version
    @Column(name = "version")
    private Integer Cart.version;
    
    public Long Cart.getId() {
        return this.id;
    }
    
    public void Cart.setId(Long id) {
        this.id = id;
    }
    
    public Integer Cart.getVersion() {
        return this.version;
    }
    
    public void Cart.setVersion(Integer version) {
        this.version = version;
    }
    
}
