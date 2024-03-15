package org.vaadin.example.components;

import java.util.ArrayList;

import com.vaadin.flow.component.html.Div;

public class HandleNotes {
    
   
    private ArrayList<NoteCard> notes;

    public HandleNotes(){
        this.notes = new ArrayList<NoteCard>();

    }

    public void addCard(NoteCard newCard){
        this.notes.add(newCard);
    }
    
    public int displayNoteCardsQuantity(){
        int count = notes.size();
        return count;
    
    }
    public Div displayNoteCards(){
        Div CardsContainer = new Div();
        CardsContainer.addClassName("cardContainer");

        for(NoteCard card:notes){
            
            CardsContainer.add(card.data());
        }
       return CardsContainer;

    }

}
