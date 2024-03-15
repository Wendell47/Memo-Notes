package org.vaadin.example;

import org.vaadin.example.components.HandleNotes;
import org.vaadin.example.components.Header;
import org.vaadin.example.components.NoteCard;
import org.vaadin.example.components.NotesFilter;

import com.vaadin.flow.component.html.Div;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import com.vaadin.flow.router.Route;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and use @Route
 * annotation to announce it in a URL as a Spring managed bean.
 * <p>
 * A new instance of this class is created for every new user and every browser
 * tab/window.
 * <p>
 * The main view contains a text field for getting the user name and a button
 * that shows a greeting message in a notification.
 */
@Route
public class MainView extends VerticalLayout {
    private HandleNotes listOfNotes;



   
    public MainView() { 

        

        listOfNotes = new HandleNotes();
        


        NoteCard ExampleCard1 = new NoteCard("Classe", "Classe define um objeto");
        NoteCard ExampleCard2 = new NoteCard("Objeto", "conjunto de propriedades e métodos");
        NoteCard ExampleCard4 = new NoteCard(
        "UML - Linguagem de Modelagem Unificada", 
        "UML, ou Linguagem de Modelagem Unificada, é uma linguagem gráfica padronizada para descrever, visualizar, projetar e documentar sistemas orientados a objetos. Ela oferece uma maneira visual e compreensível de representar a estrutura e o comportamento de um sistema.");
        
        NoteCard ExampleCard5 = new NoteCard(
        "POO(Programação orientada a Objetos)", 
        "A POO (Programação Orientada a Objetos) é um paradigma de programação que se baseia na representação de elementos do mundo real como objetos, que possuem atributos (dados ou características) e métodos (ações ou comportamentos). ");
    
        listOfNotes.addCard(ExampleCard1);
        listOfNotes.addCard(ExampleCard2);
        listOfNotes.addCard(ExampleCard4);
        listOfNotes.addCard(ExampleCard5);


        Header header = new Header();

        NotesFilter notesFilter = new NotesFilter(listOfNotes.displayNoteCardsQuantity());
        
        Div cardsContainer =listOfNotes.displayNoteCards();

       
       /* sayHello.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
        }); */


        setMargin(false);
        setPadding(false);

        setMaxWidth("1300px");
        setClassName("main");

        setHorizontalComponentAlignment(Alignment.CENTER);

        
        
        add(header.HeaderComponent(),notesFilter.setTitle(),cardsContainer);
    }

}
