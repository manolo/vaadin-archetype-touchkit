#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.ui;

import com.vaadin.addon.touchkit.ui.DatePicker;
import com.vaadin.addon.touchkit.ui.EmailField;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.touchkit.demo.gwt.client.DemoAppPersistToServerRpc;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;

@SuppressWarnings("serial")
public class FormView extends NavigationView {

    private final DemoAppPersistToServerRpc serverRpc = new DemoAppPersistToServerRpc() {
        @Override
        public void persistToServer() {
            Notification.show("Thanks !!");
        }
    };

    public FormView() {
        setCaption("Form");
        final VerticalComponentGroup content = new VerticalComponentGroup();

        final TextField nameField = new TextField("Name");
        nameField.setInputPrompt("Enter your name...");
        content.addComponent(nameField);

        final DatePicker dateField = new DatePicker("Date of Birth");
        content.addComponent(dateField);

        final EmailField emailField = new EmailField("Email");
        emailField.setInputPrompt("Enter your email address...");
        content.addComponent(emailField);

        final Button submitButton = new Button("Submit");
        submitButton.addClickListener(new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                serverRpc.persistToServer();
            }
        });

        setContent(new CssLayout(content, submitButton));
    }

}
