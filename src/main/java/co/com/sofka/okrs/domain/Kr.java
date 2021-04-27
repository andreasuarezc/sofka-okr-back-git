package co.com.sofka.okrs.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Kr")
public class Kr {
    @Id
    private String id;
    private String okrId;
    private String keyResult;
    private String personInChargeNameKr;
    private String personInChargeEmailKr;
    private Date startDate;
    private Date finishDate;
    private Float advanceKr;
    private Float percentageWeight;
    private String descriptionKr;

    public Kr(String id, String okrId, String keyResult, String personInChargeNameKr, String personInChargeEmailKr,
              Float advanceKr, Float percentageWeight, String descriptionKr) {
        this.id = id;
        this.okrId = okrId;
        this.keyResult = keyResult;
        this.personInChargeNameKr = personInChargeNameKr;
        this.personInChargeEmailKr = personInChargeEmailKr;
        this.startDate = new Date();
        this.finishDate = new Date();
        this.advanceKr = advanceKr;
        this.percentageWeight = percentageWeight;
        this.descriptionKr = descriptionKr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOkrId() {
        return okrId;
    }

    public void setOkrId(String okrId) {
        this.okrId = okrId;
    }

    public String getKeyResult() {
        return keyResult;
    }

    public void setKeyResult(String keyResult) {
        this.keyResult = keyResult;
    }

    public String getPersonInChargeNameKr() {
        return personInChargeNameKr;
    }

    public void setPersonInChargeNameKr(String personInChargeNameKr) {
        this.personInChargeNameKr = personInChargeNameKr;
    }

    public String getPersonInChargeEmailKr() {
        return personInChargeEmailKr;
    }

    public void setPersonInChargeEmailKr(String personInChargeEmailKr) {
        this.personInChargeEmailKr = personInChargeEmailKr;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public Float getAdvanceKr() {
        return advanceKr;
    }

    public void setAdvanceKr(Float advanceKr) {
        this.advanceKr = advanceKr;
    }

    public Float getPercentageWeight() {
        return percentageWeight;
    }

    public void setPercentageWeight(Float percentageWeight) {
        this.percentageWeight = percentageWeight;
    }

    public String getDescriptionKr() {
        return descriptionKr;
    }

    public void setDescriptionKr(String descriptionKr) {
        this.descriptionKr = descriptionKr;
    }
}
