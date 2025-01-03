package br.com.lxndrrbrt.notificationms.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="tb_notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long notificationID;
    private LocalDateTime dateTime;
    private String destination;
    private String message;

    @ManyToOne
    @JoinColumn(name = "status_id")
    Status status;

    @ManyToOne
    @JoinColumn(name = "channel_id")
    Channel channel;

}
