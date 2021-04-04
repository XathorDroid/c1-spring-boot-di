package com.xathordroid.c1springbootdi.models.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Component
@RequestScope
public class Invoice {

    @Value("${invoice.description}") 
    private String description;
    
    @Autowired
    private Client client;
    
    @Autowired
    @Qualifier("loadInvoiceItemsOffice")
    private List<InvoiceItem> items;
    
    @PostConstruct
    public void init() {
        this.client.setFirstName(client.getFirstName().concat(" ").concat("FirstName"));
        this.description = this.description.concat(" from client: ").concat(this.client.getFirstName());
    }
    
    @PreDestroy
    public void destroy() {
        System.out.println("Invoice destroyed: ".concat(this.description));
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    public List<InvoiceItem> getItems() {
        return items;
    }
    public void setItems(List<InvoiceItem> items) {
        this.items = items;
    }
}
