package br.com.lxndrrbrt.notificationms.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tb_channel")
public class Channel {
    @Id
    private long channelID;
    private String description;

    public Channel(long channelID, String description) {
        this.channelID = channelID;
        this.description = description;
    }

    public Channel() {
    }


    public enum Values {
        EMAIL(1L , "email"),
        SMS(2L, "sms"),
        PUSH(3, "push") ,
        WHATSAPP (4, "whatsapp");

        private long id;
        private String description;

        Values(long id, String description) {
            this.id = id;
            this.description = description;
        }

        public Channel toChannel(){
            return new Channel(id, description);

        }

    }

}
