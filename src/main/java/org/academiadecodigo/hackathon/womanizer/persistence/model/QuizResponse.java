package org.academiadecodigo.hackathon.womanizer.persistence.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "quiz_response")
public class QuizResponse extends Model {

    @NotNull
    @NotBlank
    private String responseText;

    @NotNull
    private int value;

    //@ManyToMany(fetch = FetchType.LAZY)
    //private List<QuizQuestion> questions;

    public String getResponseText() {
        return responseText;
    }

    public void setResponseText(String responseText) {
        this.responseText = responseText;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "QuizResponse{" +
                "responseText='" + responseText + '\'' +
                ", value=" + value +
                '}';
    }
}
