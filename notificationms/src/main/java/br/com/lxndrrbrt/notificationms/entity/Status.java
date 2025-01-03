package br.com.lxndrrbrt.notificationms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_status")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long statusID;
    private String description;

    public Status(long id, String description) {
        this.statusID = id;
        this.description = description;
    }

    public Status() {
    }

    public enum Values{
        PENDING(1, "pending"),
        CANCELED(2, "canceled"),
        ERROR(3, "error"),
        SUCCESS(4, "success");


        private long id;
        private String description;

        Values(long id, String description) {
            this.id = id;
            this.description = description;

        }

        public Status toStatus(long id, String description){
            return new Status(id, description);
        }

    }

}
