package cardscommons.dto;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Objects;


public class RelDeckCardsDTO {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long deckId;
    private Long cardNumber;
    private String cardSetCode;
    private Double card_price;
    private String card_raridade;
    private Date dt_criacao;
    private boolean isSideDeck;
    private boolean isSpeedDuel;
    private String setRarityCode;
    private String rarityDetails;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getDeckId() {
        return deckId;
    }
    public void setDeckId(Long deck_id) {
        this.deckId = deck_id;
    }

    public Double getCard_price() {
        return card_price;
    }
    public void setCard_price(Double card_price) {
        this.card_price = card_price;
    }
    public String getCard_raridade() {
        return card_raridade;
    }
    public void setCard_raridade(String card_raridade) {
        this.card_raridade = card_raridade;
    }
    public Date getDt_criacao() {
        return dt_criacao;
    }
    public void setDt_criacao(Date dt_criacao) {
        this.dt_criacao = dt_criacao;
    }
    public boolean getIsSideDeck() {
        return isSideDeck;
    }
    public void setIsSideDeck(boolean isSideDeck) {
        this.isSideDeck = isSideDeck;
    }

    public boolean getIsSpeedDuel() {
        return isSpeedDuel;
    }
    public void setIsSpeedDuel(boolean isSpeedDuel) {
        this.isSpeedDuel = isSpeedDuel;
    }

    public Long getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getCardSetCode() {
        return cardSetCode;
    }
    public void setCardSetCode(String cardSetCode) {
        this.cardSetCode = cardSetCode;
    }
    public void setSpeedDuel(boolean isSpeedDuel) {
        this.isSpeedDuel = isSpeedDuel;
    }


    @Override
    public String toString() {
        return "RelDeckCards [id=" + id + ", deckId=" + deckId + ", cardNumber=" + cardNumber + ", cardSetCode="
                + cardSetCode + ", card_price=" + card_price + ", card_raridade=" + card_raridade + ", dt_criacao="
                + dt_criacao + ", isSideDeck=" + isSideDeck + ", isSpeedDuel=" + isSpeedDuel + "]";
    }
    public String getRarityDetails() {
        return rarityDetails;
    }
    public void setRarityDetails(String rarityDetails) {
        this.rarityDetails = rarityDetails;
    }
    public String getSetRarityCode() {
        return setRarityCode;
    }
    public void setSetRarityCode(String setRarityCode) {
        this.setRarityCode = setRarityCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardSetCode, rarityDetails);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RelDeckCardsDTO other = (RelDeckCardsDTO) obj;
        return Objects.equals(cardSetCode, other.cardSetCode) && Objects.equals(rarityDetails, other.rarityDetails);
    }

}
