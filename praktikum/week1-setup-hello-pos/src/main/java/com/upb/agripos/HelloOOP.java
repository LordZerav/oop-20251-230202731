package com.upb.agripos;

//Class
class Mahasiswa {
    String name;
    int nim;

    //Constructor
    public Mahasiswa(String name, int nim) {
        this.name = name;
        this.nim = nim;
    }

    //Method atau Function
    public void perkenalan() {
        System.out.println("Hello World, I'm " + name + " dengan nim " + nim);
    }
}

public class HelloOOP {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Amru Muiz Fauzan", 230202731);
        mahasiswa.perkenalan();
    }
}