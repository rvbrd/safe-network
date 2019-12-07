package org.academiadecodigo.hackathon.womanizer.persistence.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "quiz_question")
public class QuizQuestion extends Model {

    @Column(length = 300)
    @NotNull
    @NotBlank
    private String question;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<QuizResponse> responses;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<QuizResponse> getResponses() {
        return responses;
    }

    public void setResponses(List<QuizResponse> responses) {
        this.responses = responses;
    }

    @Override
    public String toString() {
        return "QuizQuestion{" +
                "question='" + question + '\'' +
                '}';
    }
}
