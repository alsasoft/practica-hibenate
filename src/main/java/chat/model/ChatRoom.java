package chat.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Modela una sala de chat. Por favor, revise detenidamente la clase y complete las partes omitidas
 * atendiendo a los comentarios indicados mediante @TODO
 */
// @TODO completar las anotaciones de la clase
@Entity
@Table(name = "chatrooms")
public class ChatRoom {

    // @TODO completar las anotaciones del atributo id (autogenerado)
    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    // @TODO completar las anotaciones del atributo name
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    // @TODO completar las anotaciones del atributo creator
    @ManyToOne(optional = false)
    @JoinColumn(name = "createdBy", nullable = false)
    private User creator;

    // @TODO completar las anotaciones del atributo messages
    @OneToMany(mappedBy = "chatRoom")
    private Set<Message> messages;
    private String chatrooms;

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
