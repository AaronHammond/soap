package com.tracyshandmadesoaps.soapstore.util;

import com.tracyshandmadesoaps.soapstore.domain.Line;
import com.tracyshandmadesoaps.soapstore.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: Aaron
 * Date: 5/8/13
 * Time: 4:55 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    @Transactional
    public void onApplicationEvent(final ContextRefreshedEvent event) {
        Line simplePleasures = new Line();
        if(Line.findLinesByNameEquals("Simple Pleasures").getResultList().size() == 0){
            simplePleasures.setIngredients("Test oil, Test arabica, Test blueberries");
            simplePleasures.setName("Simple Pleasures");
            simplePleasures.persist();
        }
        Line eco = new Line();
        if(Line.findLinesByNameEquals("Eco").getResultList().size() == 0){
            eco.setIngredients("Test oil, Test arabica, Test blueberries");
            eco.setName("Eco");
            eco.persist();
        }

        Line finer = new Line();
        if(Line.findLinesByNameEquals("The Finer Things").getResultList().size() == 0){
            finer.setIngredients("Test oil, Test arabica, Test blueberries");
            finer.setName("The Finer Things");
            finer.persist();
        }

        if(Product.findProductsByLineEquals(Line.findLinesByNameEquals("Simple Pleasures").getSingleResult())
                .getResultList().size() == 0){
            Product testSimple = new Product();
            testSimple.setLine(simplePleasures);
            testSimple.setDescription("This is the simplest test product that is also pleasurable");
            testSimple.setPrice(new BigDecimal("3.99"));
            testSimple.setName("Test Simple Pleasure");
            testSimple.persist();

            Product testSimple2 = new Product();
            testSimple2.setLine(simplePleasures);
            testSimple2.setDescription("LA TEE DA MOTHERFUCKERS THIS IS A SUPER DUPER LONG DESCRIPTION TO TEST TEXTWRAPPING. This is the simplest test 222 product that is also pleasurable. But this one has a much longer textual description because fuck you that's why");
            testSimple2.setPrice(new BigDecimal("4.99"));
            testSimple2.setName("Test Simple Pleasure With a Longer title");
            testSimple2.persist();
        }

        if(Product.findProductsByLineEquals(Line.findLinesByNameEquals("Eco").getSingleResult())
                .getResultList().size() == 0){
            Product testEco = new Product();
            testEco.setLine(eco);
            testEco.setDescription("This is the simplest test product that is also pleasurable");
            testEco.setPrice(new BigDecimal("3.99"));
            testEco.setName("Test Eco");
            testEco.persist();

            Product testEco2 = new Product();
            testEco2.setLine(eco);
            testEco2.setDescription("LA TEE DA MOTHERFUCKERS THIS IS A SUPER DUPER LONG DESCRIPTION TO TEST TEXTWRAPPING. This is the simplest test 222 product that is also pleasurable. But this one has a much longer textual description because fuck you that's why");
            testEco2.setPrice(new BigDecimal("4.99"));
            testEco2.setName("Test Eco With a Longer title");
            testEco2.persist();
        }

        if(Product.findProductsByLineEquals(Line.findLinesByNameEquals("The Finer Things").getSingleResult())
                .getResultList().size() == 0){
            Product testFiner = new Product();
            testFiner.setLine(finer);
            testFiner.setDescription("This is the Finerst test product that is also pleasurable");
            testFiner.setPrice(new BigDecimal("3.99"));
            testFiner.setName("Test Finer Pleasure");
            testFiner.persist();

            Product testFiner2 = new Product();
            testFiner2.setLine(finer);
            testFiner2.setDescription("LA TEE DA MOTHERFUCKERS THIS IS A SUPER DUPER LONG DESCRIPTION TO TEST TEXTWRAPPING. This is the Finerst test 222 product that is also pleasurable. But this one has a much longer textual description because fuck you that's why");
            testFiner2.setPrice(new BigDecimal("4.99"));
            testFiner2.setName("Test Finer Pleasure With a Longer title");
            testFiner2.persist();
        }

    }
}
