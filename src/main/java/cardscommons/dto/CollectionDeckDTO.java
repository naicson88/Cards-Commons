package cardscommons.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CollectionDeckDTO extends KonamiDeckDTO{
    private static final long serialVersionUID = 1L;

    @JsonProperty("setId")
    private Integer setId ;
    @JsonProperty("filterSetCode")
    private String filterSetCode;

    public Integer getSetId() {
        return setId;
    }
    public void setSetId(Integer setId) {
        this.setId = setId;
    }
    public String getFilterSetCode() {
        return filterSetCode;
    }
    public void setFilterSetCode(String filterSetCode) {
        this.filterSetCode = filterSetCode;
    }
}
