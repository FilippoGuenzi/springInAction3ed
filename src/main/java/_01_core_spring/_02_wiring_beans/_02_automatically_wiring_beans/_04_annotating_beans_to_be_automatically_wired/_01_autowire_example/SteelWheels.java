package _01_core_spring._02_wiring_beans._02_automatically_wiring_beans._04_annotating_beans_to_be_automatically_wired._01_autowire_example;

import org.springframework.stereotype.Component;

@Component
public class SteelWheels implements CompactDisc {
    private String author = "Rolling Stones";
    private String title = "Steel Wheels";

    public void play() {
        System.out.println("Compact disc " + title + " by " + author + " is being played");
    }
}
