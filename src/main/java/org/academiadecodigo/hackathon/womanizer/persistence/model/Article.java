package org.academiadecodigo.hackathon.womanizer.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "article")
public class Article extends Model{

    @NotNull
    @NotBlank
    private String title;

    @NotNull
    @NotBlank
    private String summary;

    @NotNull
    @NotBlank
    @Column(length = 2509)
    private String content;

    @NotNull
    @NotBlank
    private String image;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", content='" + content + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
