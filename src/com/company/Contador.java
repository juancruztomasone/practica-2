package com.company;

public class Contador {
    int count;


    public Contador() {
        this.count = 0;
    }

    public Contador(int init) {
        this.count = init;
    }

    public Contador(Contador contador) {
        this.count = contador.count;
    }

    public void incrementar(){
        this.count++;
    }

    public void decrementar(){
        this.count--;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
