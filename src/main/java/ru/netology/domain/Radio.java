package ru.netology.domain;

public class Radio {
    private int currentVolume = 10;
    private int currentStation = 5;
    private int numberOfStations;
    private int minStation = 0;
    private int maxStation;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
        this.numberOfStations = 10;
        this.maxStation = calculateMaxStation();
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        this.maxStation = calculateMaxStation();
    }

    private int calculateMaxStation() {
        return (numberOfStations - 1);
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setIncreaseCurrentVolume() {
        if (this.currentVolume >= maxVolume) {
            return;
        }
        this.currentVolume++;
    }

    public void setDecreaseCurrentVolume() {
        if (this.currentVolume <= minVolume) {
            return;
        }
        this.currentVolume = this.currentVolume - 1;
    }

    public int getCurrentStation() {
        return this.currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public void setNextStation() {
        if (this.currentStation == maxStation) {
            this.currentStation = minStation;
        } else {
            this.currentStation++;
        }
    }

    public void setPrevStation() {
        if (this.currentStation == minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation--;
        }
    }
}
