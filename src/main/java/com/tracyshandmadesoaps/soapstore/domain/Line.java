package com.tracyshandmadesoaps.soapstore.domain;

import javax.validation.constraints.NotNull;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.roo.addon.json.RooJson;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = {"findLinesByNameEquals"})
@RooJson
public class Line {

    @NotNull
    private String name;

    @NotNull
    private String ingredients;
}
