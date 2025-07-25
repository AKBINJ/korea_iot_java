package org.example.test.test0710.자바OOP구현문제;

interface Playable {
    void play();
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("피아노 소리");
    }
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("기타 소리");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Playable[] instruments = {new Piano(), new Guitar()};
        for (Playable instrument : instruments) {
            instrument.play();
        }
    }
}
