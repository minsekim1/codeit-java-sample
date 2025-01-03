package org.example;

abstract class Animal {
    abstract void sound();  // 자식 클래스에서 구현할 메서드
    void breathe() {  // 부모 클래스에서 구현
        System.out.println("Breathing...");
    }
}
