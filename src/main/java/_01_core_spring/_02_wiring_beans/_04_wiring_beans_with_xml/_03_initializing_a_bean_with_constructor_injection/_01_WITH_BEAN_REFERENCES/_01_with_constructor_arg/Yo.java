package _01_core_spring._02_wiring_beans._04_wiring_beans_with_xml._03_initializing_a_bean_with_constructor_injection._01_WITH_BEAN_REFERENCES._01_with_constructor_arg;

public class Yo {

    private Ya ya;

    public Yo(Ya ya) {
        this.ya = ya;
    }
}
