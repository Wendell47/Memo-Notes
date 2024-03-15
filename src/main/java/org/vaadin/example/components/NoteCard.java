package org.vaadin.example.components;

import java.time.LocalDate;
import java.util.Date;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;

public class NoteCard {
    private Span date ;
    private H3 title;
    private Paragraph description;
    Div div;


    private String[] Months = {
        "Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"
    };

    public NoteCard(String title, String description){
       
        LocalDate DateNow = LocalDate.now();
        int day = DateNow.getDayOfMonth();
        int month = DateNow.getMonthValue();


        this.date = new Span(day + " " + Months[month - 1].toUpperCase());
        this.title= new H3(title);
        this.description = new Paragraph(description);
    };

    public Div data(){
        
        div = new Div(date,title,description);
        div.addClassName("Card");
        return div;
    }
}
