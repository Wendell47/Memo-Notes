package org.vaadin.example.components;

import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.theme.lumo.LumoIcon;


public class Header {
    
    private Image icon;
    private Span title;
    private Div container;
    private Div iconContainer;


    Button Option = new Button(LumoIcon.COG.create());
    
  public Header(){
    Avatar avatarBasic = new Avatar("Wendel");

    icon = new Image("images/icon.png","Logo");
    title = new Span("Wendel");

    iconContainer = new Div(avatarBasic,title);
    iconContainer.addClassName("Profile");
  };

    

  public Div HeaderComponent(){

    TextField field = new TextField();
    field.setPlaceholder("Pesquisar");
    field.setClearButtonVisible(true);
    field.setPrefixComponent(new Icon(VaadinIcon.SEARCH));
    Option.addThemeVariants(ButtonVariant.LUMO_TERTIARY);

    container = new Div();
    
    container.addClassName("header");
    container.add(iconContainer, field,Option);

    return container;
    
};

}
