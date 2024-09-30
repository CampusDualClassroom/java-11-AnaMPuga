package com.campusdual.classroom;

public class TVRemote {
    int channel;
    int volume;
    boolean on;
    String color;


    public TVRemote(String color) { //aquí el constructor deja que le pongamos el color ya que se pasa por parámetro
        this.channel = 0;
        this.volume = 20;
        this. color = color;
    }

    public boolean turnOn() {
        this.on = true;
        return this.on;
    }

    public boolean turnOff() {
        this.on = false;
        return this.on;
    }

    public void channelUp() {
        this.channel++;
    }

    public void channelDown() {
        if (this.checkMiValue(this.channel)) {
            this.channel--;
        }
    }

    public void volumeUp() {
        this.volume++;
    }

    public void volumeDown() {
        if (this.checkMiValue(this.volume)) {
            this.volume--;
        }
    }

    public String getColor() {
        return this.color;
    }

    private boolean checkMiValue(int value) {
        if (value == 0) {
            return false;
        } else {
            return true;

        }

    }
}
