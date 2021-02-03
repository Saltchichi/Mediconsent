package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

    List<Question> findAll();

    Optional<Question> findById(@PathVariable Long id);

    void deleteById(@PathVariable Long id);

    Question save(@RequestBody Question question);

    @Query(value = "SELECT q.* FROM Question q, Formulaire f, Question_formulaire qf " +
            "WHERE q.id_question = qf.id_question " +
            "AND qf.id_formulaire = :id_formulaire",
            nativeQuery = true)
    List<Question> findQuestionsByFormulaire(@Param("id_formulaire") Long id_formulaire);

}