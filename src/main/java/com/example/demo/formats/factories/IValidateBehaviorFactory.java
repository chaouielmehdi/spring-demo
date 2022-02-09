package com.example.demo.formats.factories;

import com.example.demo.formats.behaviors.IValidateBehavior;
import org.springframework.stereotype.Component;

@Component
public interface IValidateBehaviorFactory {
    IValidateBehavior getBehavior(String behavior);
}