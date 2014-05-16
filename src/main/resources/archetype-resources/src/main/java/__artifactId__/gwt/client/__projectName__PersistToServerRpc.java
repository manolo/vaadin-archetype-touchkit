#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.gwt.client;

import com.vaadin.shared.communication.ServerRpc;

public interface ${projectName}PersistToServerRpc extends ServerRpc {
    void persistToServer();
}
