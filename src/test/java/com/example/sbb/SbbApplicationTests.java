package com.example.sbb;

import com.example.sbb.answer.Answer;
import com.example.sbb.answer.AnswerRepository;
import com.example.sbb.question.Question;
import com.example.sbb.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SbbApplicationTests {
@Autowired
private QuestionRepository questionRepository;
@Autowired
private AnswerRepository answerRepository;

@Test
void testJpa () {
    Question q1 = new Question();
    q1.setContent("안녕하세요");
    q1.setSubject("하이");
    q1.setCreateDate(LocalDateTime.now());
    this.questionRepository.save(q1);

    Question q2 = new Question();
    q2.setContent("안녕하세요2");
    q2.setSubject("하이2");
    q2.setCreateDate(LocalDateTime.now());
    this.questionRepository.save(q2);

    Question q3 = new Question();
    q3.setContent("안녕하세요3");
    q3.setSubject("하이3");
    q3.setCreateDate(LocalDateTime.now());
    this.questionRepository.save(q3);
}
}
