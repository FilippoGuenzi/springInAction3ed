package _01_core_spring._03_advanced_wiring._05_runtime_value_injection._02_wiring_with_the_spring_expression_language._01_a_few_spel_examples._03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpecificCD implements CompactDisc {
    private String author;
    private String title;

    @Autowired
    public SpecificCD(@Value("#{systemProperties['author']}") String author, @Value("#{systemProperties['title']}") String title) {
        this.author = author;
        this.title = title;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + author);
    }
}
