package org.vaadin.example.components;

import org.springframework.stereotype.Component;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;


public class NotesFilter {

    private int NoteQuantity;
    private String Title;
    private Span text;
    private Button AddNewNoteButton;
    
    public NotesFilter(int noteQuantity){
        this.NoteQuantity = noteQuantity;
    }

    private void handleNotesQuantity(){

        if(NoteQuantity <=1){
            Title = "Nota";
        } 
        else if(NoteQuantity >=1){
            Title = "Notas";
        }
        else{
            Title = "vazio";
        }

        text= new Span(NoteQuantity + " " + Title);
    }

 

    public Div setTitle(){

        handleNotesQuantity();

        AddNewNoteButton = new Button("Adicionar Nota",new Icon(VaadinIcon.PLUS));
        AddNewNoteButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY, ButtonVariant.LUMO_CONTRAST);

        Div containerDiv = new Div();

        containerDiv.add(text,AddNewNoteButton);
        containerDiv.addClassName("notesOptionsBar");


        return containerDiv;

        
    }
}
