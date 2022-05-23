package com.sharansh.ruleengine.repository;

import com.sharansh.ruleengine.domain.RuleDbModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RulesRepository extends JpaRepository<RuleDbModel, Long> {
    List<RuleDbModel> findByRuleNamespace(String ruleNamespace);
    List<RuleDbModel> findAll();
}
