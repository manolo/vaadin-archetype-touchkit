#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import com.vaadin.addon.touchkit.ui.TouchKitUI;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.CssLayout;

/**
 * The UI's "main" class
 */
@SuppressWarnings("serial")
public class MyVaadinUI extends TouchKitUI
{
	@Override
    protected void init(VaadinRequest request) {
		setContent(new CssLayout());
        Button button = new Button("Click Me");
        button.addClickListener(new ClickListener() {
            public void buttonClick(ClickEvent event) {
                event.getButton().getWindow().addComponent(new Label("Thank you for clicking"));
            }
        });
        addComponent(button);
    }

    
}
