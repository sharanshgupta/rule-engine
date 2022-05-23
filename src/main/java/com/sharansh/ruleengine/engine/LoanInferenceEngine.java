package com.sharansh.ruleengine.engine;

import com.sharansh.ruleengine.constant.RuleNamespace;
import com.sharansh.ruleengine.domain.LoanDetails;
import com.sharansh.ruleengine.domain.UserDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoanInferenceEngine extends InferenceEngine<UserDetails, LoanDetails> {

    @Override
    protected RuleNamespace getRuleNamespace() {
        return RuleNamespace.LOAN;
    }

    @Override
    protected LoanDetails initializeOutputResult() {
        return LoanDetails.builder().build();
    }
}
