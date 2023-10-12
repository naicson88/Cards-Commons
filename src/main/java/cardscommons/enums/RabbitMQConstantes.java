package cardscommons.enums;

public enum RabbitMQConstantes {
     DECK_QUEUE("DECK_QUEUE"),
     SET_COLLECTION_QUEUE("SET_COLLECTION_QUEUE"),
     DECK_COLLECTION_QUEUE("DECK_COLLECTION_QUEUE"),
     CARD_QUEUE("CARD_QUEUE"),
     SET_PRICE_QUEUE("SET_PRICE_QUEUE"),
     CARD_PRICE_QUEUE("CARD_PRICE_QUEUE");

     private final String queue;

      RabbitMQConstantes(String queue){
         this.queue = queue;
     }

     public String getQueue(){
        return queue;
     }
}
