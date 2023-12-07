package com.example.sbb;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Question {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "Text")
    private String content;
    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;

}
