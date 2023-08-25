package com.example.pizzasender.applicationController;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.backoff.FixedBackOffPolicy;
import org.springframework.retry.policy.ExceptionClassifierRetryPolicy;
import org.springframework.retry.policy.SimpleRetryPolicy;
import org.springframework.retry.support.RetryTemplate;

import java.util.Collections;

@Configuration
public class RetryConfig {

    @Bean
    public RetryTemplate retryTemplate() {
        RetryTemplate retryTemplate = new RetryTemplate();

        FixedBackOffPolicy fixedBackOffPolicy = new FixedBackOffPolicy();
        fixedBackOffPolicy.setBackOffPeriod(2000L);  // 2 seconds. You can adjust this value as per your needs.
        retryTemplate.setBackOffPolicy(fixedBackOffPolicy);

        ExceptionClassifierRetryPolicy classifierRetryPolicy = new ExceptionClassifierRetryPolicy();
        SimpleRetryPolicy simpleRetryPolicy = new SimpleRetryPolicy(4); // Initial call + 3 retries = 4 attempts total

        classifierRetryPolicy.setPolicyMap(Collections.singletonMap(org.springframework.web.client.ResourceAccessException.class, simpleRetryPolicy));
        retryTemplate.setRetryPolicy(classifierRetryPolicy);

        return retryTemplate;
    }
}
