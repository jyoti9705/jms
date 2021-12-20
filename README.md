# jms

1. What is Message?
    1. It is a piece of information that is exchanged between two applications which may or may not run in same platform
2. What is Messaging?
    1. The communication system used to exchange the information between system components or applications is called
       Messaging
    2. Advantages
        1. Different platforms can talk to each other
        2. Increases scalability
        3. Increases reliability of message delivery
3. What is JMS
    1. Java Message Oriented Middleware API for sending messages within two or more clients
    2. JMS is part of Java Enterprise Edition
    3. It is like a postOffice which is used by both sender and receiver and postOffice acts as middleware
    4. It is a common way for Java programs to send , receive and read distributed enterprise messages
    5. It is loosely coupled
    6. Asynchronous messaging
    7. Reliable Delivery
        1. Message is guaranteed to be delivered once and only once , message will not be lost
    8. Sender sends messages to the network where message is taken by broker i.e. message oriented middleware which is
       again send over network and is received by receiver
    9. JMS vs Java mail
        1. Java mail is api for sending mails with attachment , reading emails etc. vs JMS si messaging service capable
           of exchanging messages between applications
        2. Mainly human to human communication in Java email , JMS is Inter and Intra company (Application/Human to
           Application/Human)
        3. In Java Email mail can be duplicated and receive twice whereas JMS ensures to send messages only once at a
           time no duplicate messages can be received from JMS
        4. Email is designed for connectivity on the web whereas JMS is designed for very high performance messaging
           with low latency and higher reliability avoiding duplicate and message loss
        5. Both are designed for transmitting messages
    10. JMS Components
        1. JMS Provider : The MOM Message oriented middleware that implements JMS in addition to other administrative
           and control functionality required for a full-featured messaging product,It is a message Broker Agent.
        2. JMS Clients : Java applications that produce or receive the messages
        3. JMS Producer / Publisher : A JMS Clients that sends the message
        4. JMS Consumer / Subscriber : A JMS Clients that can receive the message
        5. JMS Applications : Composed by many JMS clients and producers
    11. Messaging Models
        1. PTP (Point to Point)
            1. Built on principle of Queues message present first in the quueue will be picked up and processed first
            2. Each Message has only one consumer
                1. A Queue might have more than one sender and more than one consumer but will be processed by only one
                   receiver
        2. Publish/Subscribe
            1. Instead of Queue we have topics
            2. Topic replicates the message and sends it to more than subscriber
            3. It can have multiple producers and subscribers
                1. Durable
                2. Non Durable
        3. PTP vs Pub-Sub
            1. In PTP message has only one consumer, in Pub-Sub each message can have multiple Subscribers
            2. Messages are first sent to Queue, and then it is further processed by Receiver in PTP mechanism , In
               Pub-Sub messages are first send to destination Topic, and it is further processed by many subscribers
            3. In PTP receiver acknowledges successful message delivery but in Pub-Sub acknowledgement is not sent to
               the sender
        4. Steps
            1. Create Connection Factory
            2. Create Connections from Connection Factory
            3. Creation session from connection
            4. From Session create producer or consumer
            5. When Provider is created from session
                1. Create Text Message from Provider
                2. Send Message
            6. From Session when consumer is received
                1. Create Consumer
                2. Start Connection
                3. Receive messages
                4. When we do consumer.receive()that mean we are opting for synchronous message
                5. For Asynchronous messaging we register a listener to listen to the messages
                6. Listener has an onMessage method where message will be processed
        5. Synchronous Messaging
            1. It is a messaging system when client waits for the server to respond
            2. When message is not received from Server it will Fail
        6. Asynchronous messaging
            1. Client does not wait for messages from server
            2. An event is used to trigger messages from the server
            3. So even if client is down , message will be communicated successfully
        7. Spring provides JMS Integration Framework that facilitates use of JMS API
            1. JMS can be roughly divided into two main areas of functionality namely the production and consumption of
               messages
            2. JMS Template can be used for message production and synchronous message reception
            3. For Asynchronous message processing similarly to message driver bean Spring provides number message
               listener containers that are used to create message driven POJOs
        8. Steps to install Active MQ
            1. Download zip file for windows
            2. Extract the zip file
            3. Once zip is extracted go to terminal inside bin and create broker with command
                1. .\artemis create <path for broker creation>
            4. once broker is create go to bin folder inside the broker folder and run the active mq using command
                1. .\artemis run
                2. Above command will create queues for us on the fly
        9. Artemis server is available at http://localhost:8161/console 