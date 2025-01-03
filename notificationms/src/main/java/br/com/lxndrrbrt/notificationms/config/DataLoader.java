package br.com.lxndrrbrt.notificationms.config;

import br.com.lxndrrbrt.notificationms.entity.Channel;
import br.com.lxndrrbrt.notificationms.entity.Notification;
import br.com.lxndrrbrt.notificationms.entity.Status;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;
import br.com.lxndrrbrt.notificationms.repository.ChannelRepository;
import br.com.lxndrrbrt.notificationms.repository.NotificationRepository;
import br.com.lxndrrbrt.notificationms.repository.StatusRepository;
import java.util.Arrays;

@Configuration
public class DataLoader implements  CommandLineRunner{

    ChannelRepository channelRepository;
    StatusRepository statusRepository;
    NotificationRepository notificationRepository;

    public DataLoader(ChannelRepository channelRepository, StatusRepository statusRepository, NotificationRepository notificationRepository) {
        this.channelRepository = channelRepository;
        this.statusRepository = statusRepository;
        this.notificationRepository = notificationRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Arrays.stream(Channel.Values.values())
                .map(Channel.Values::toChannel)
                .forEach(channelRepository::save);




    }
}
