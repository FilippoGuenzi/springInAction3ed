package _01_core_spring._03_advanced_wiring._05_runtime_value_injection._01_injecting_external_values._02_resolving_property_placeholders._03_placeholders_in_java_auto_wiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpecificCD implements CompactDisc {
    private String author;
    private String title;

    @Autowired
    public SpecificCD(@Value("${author}") String author, @Value("${title}") String title) {
        this.author = author;
        this.title = title;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + author);
    }
}
