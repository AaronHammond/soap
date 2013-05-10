package com.tracyshandmadesoaps.soapstore.domain;

import java.util.*;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.tostring.RooToString;


@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders={"findCartsByOwnerSessionId"})
@RooJson
public class Cart {

    @OneToMany(cascade = CascadeType.ALL)
    private java.util.List<ProductFulfillment> products = new ArrayList<ProductFulfillment>();

    private String ownerSessionId;

    @Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private java.util.Date created = new Date();
}
