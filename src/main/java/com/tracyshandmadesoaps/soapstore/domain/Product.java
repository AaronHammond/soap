package com.tracyshandmadesoaps.soapstore.domain;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.roo.addon.json.RooJson;

import java.math.BigDecimal;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = {"findProductsByLineEquals"})
@RooJson
public class Product {

    @NotNull
    private String name;

    @NotNull
    private String description;

    @ManyToOne
    private Line line;

    private BigDecimal price;
}
