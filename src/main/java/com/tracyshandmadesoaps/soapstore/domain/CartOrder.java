package com.tracyshandmadesoaps.soapstore.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.roo.addon.json.RooJson;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooJson
public class CartOrder {

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<ProductFulfillment> fulfillments = new HashSet<ProductFulfillment>();

    @NotNull
    private String token;

    private BigDecimal price;
}
