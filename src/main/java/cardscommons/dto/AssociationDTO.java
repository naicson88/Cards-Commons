package cardscommons.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

public class AssociationDTO {
    @NotNull(message =  "Source ID cannot be empty")
    private Integer sourceId;
    @NotNull
    @NotEmpty(message =  "Array to Associate cannot be empty")
    private List<Integer> arrayToAssociate;

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public List<Integer> getArrayToAssociate() {
        return arrayToAssociate;
    }

    public void setArrayToAssociate(List<Integer> arrayToAssociate) {
        this.arrayToAssociate = arrayToAssociate;
    }
}
