package com.xathordroid.c1springbootdi;

import com.xathordroid.c1springbootdi.models.domain.InvoiceItem;
import com.xathordroid.c1springbootdi.models.domain.Product;
import com.xathordroid.c1springbootdi.models.services.IService;
import com.xathordroid.c1springbootdi.models.services.MyComplexService;
import com.xathordroid.c1springbootdi.models.services.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {
    
    @Bean("mySimpleService")
    public IService registerService() {
        return new MyService();
    }

    @Primary
    @Bean("myComplexService")
    public IService registerComplexService() {
        return new MyComplexService();
    }
    
    @Bean("loadInvoiceItems")
    public List<InvoiceItem> registerItems() {
        Product firstProduct = new Product("Sony camera", 100);
        Product secondProduct = new Product("Bianchi Cycle r26", 200);
        
        InvoiceItem firstLine = new InvoiceItem(firstProduct, 2);
        InvoiceItem secondLine = new InvoiceItem(secondProduct, 1);
        
        return Arrays.asList(firstLine, secondLine);
    }

    @Bean("loadInvoiceItemsOffice")
    public List<InvoiceItem> registerItemsOffice() {
        Product firstProduct = new Product("Monitor LG LCD 24", 250);
        Product secondProduct = new Product("Notebook Asus", 500);
        Product thirdProduct = new Product("Multifunction printer", 80);
        Product fourthProduct = new Product("Office Desk", 300);

        InvoiceItem firstLine = new InvoiceItem(firstProduct, 2);
        InvoiceItem secondLine = new InvoiceItem(secondProduct, 4);
        InvoiceItem thirdLine = new InvoiceItem(thirdProduct, 1);
        InvoiceItem fourthLine = new InvoiceItem(fourthProduct, 2);

        return Arrays.asList(firstLine, secondLine, thirdLine, fourthLine);
    }
}
