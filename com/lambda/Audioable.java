package com.lambda;

public interface Audioable {

    void listenVoice();
}
class TestAudio{
    public static void main(String[] args) {

        Audioable audioable=() -> {
            System.out.println("This is lambda method");
        };
        audioable.listenVoice();
    }
}
