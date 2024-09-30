package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());
        redRemote.turnOn();
        redRemote.channelUp();
        redRemote.channelDown();
        redRemote.channel=0;
        redRemote.channelDown();
        redRemote.volumeUp();
        redRemote.volumeDown();
        redRemote.volume = 0;
        redRemote.volumeDown();
        System.out.println(redRemote.getColor());
        redRemote.turnOff();
   }

}