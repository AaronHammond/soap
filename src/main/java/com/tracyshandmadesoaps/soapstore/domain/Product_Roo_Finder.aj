// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.tracyshandmadesoaps.soapstore.domain;

import com.tracyshandmadesoaps.soapstore.domain.Line;
import com.tracyshandmadesoaps.soapstore.domain.Product;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

privileged aspect Product_Roo_Finder {
    
    public static TypedQuery<Product> Product.findProductsByLineEquals(Line line) {
        if (line == null) throw new IllegalArgumentException("The line argument is required");
        EntityManager em = Product.entityManager();
        TypedQuery<Product> q = em.createQuery("SELECT o FROM Product AS o WHERE o.line = :line", Product.class);
        q.setParameter("line", line);
        return q;
    }
    
}