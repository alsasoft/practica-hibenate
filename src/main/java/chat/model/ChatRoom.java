package chat.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Modela una sala de chat. Por favor, revise detenidamente la clase y complete las partes omitidas
 * atendiendo a los comentarios indicados mediante @TODO
 */
// @TODO completar las anotaciones de la clase
public class ChatRoom {

    // @TODO completar las anotaciones del atributo id (autogenerado)

    // @TODO completar las anotaciones del atributo name

    // @TODO completar las anotaciones del atributo creator

    // @TODO completar las anotaciones del atributo messages

    public ChatRoom() {

    }

    public ChatRoom(String name, User creator) {
        this.name = name;
        this.creator = creator;
        this.messages = new HashSet<Message>();
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public User getCreator() {
        return this.creator;
    }

    public Set<Message> getMessages() {
        return this.messages;
    }
}
