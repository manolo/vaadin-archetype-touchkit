#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};


import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

/**
 * The UI's "main" class
 */
@Widgetset("${package}.gwt.AppWidgetSet")
public class MyTouchKitUI extends UI {
    @Override
    protected void init(VaadinRequest request) {
        setContent(new CssLayout());
        final CssLayout cssLayout = new CssLayout();
        Button button = new Button("Click Me");
        button.addClickListener(new ClickListener() {
            public void buttonClick(ClickEvent event) {
                cssLayout.addComponent(new Label("Thank you for clicking"));
            }
        });
        cssLayout.addComponent(button);
        setContent(cssLayout);
    }

}