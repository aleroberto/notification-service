# notification-service
Microsserviço que permite envio de notificações via SMS, e-mail, WhatsApp e push. Suporta agendamento, cancelamento e histórico de envios, dados armazenados no MySQL. Utiliza Spring Boot, Spring Scheduler, Spring Data JPA e Docker, na sua construção.

## Funcionalidades

- **Envio de notificações**: Suporte a SMS, e-mail, WhatsApp e push.
- **Agendamento de mensagens**: Programar o envios para datas futuras.
- **Cancelamento de notificações**: Permite cancelamento de notificações agendadas e ainda não enviadas.
- **Histórico de envios**: Tudo fica armezenado em banco.

## Tecnologias Utilizadas

- **Spring Scheduler**: Para o agendamentos.
- **Spring Data JPA**: Persistência.
- **MySQL**: Banco de dados.
- **Docker**: Criação e gerenciamento do banco de dados.
- **Maven**: Gerenciamento das dependências.

## Pré-requisitos

- **Java 17+**
- **Maven 3.8+**
- **Docker**

## Endpoints Principais

- **POST /notifications**: Enviar uma nova notificação.
- **GET /notifications/{id}**: Consultar detalhes de uma notificação.
- **PUT /notifications/{id}/cancel**: Cancelar uma notificação agendada.
- **GET /notifications/history**: Obter o histórico de notificações.

