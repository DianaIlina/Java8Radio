package ru.netology;

public class Radio {
    private int currentVolume = 5;
    private int currentStation = 9;

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setIncreaseCurrentVolume() {
        if(this.currentVolume >= 10) {
            return;
        }
        this.currentVolume ++;
    }

    public void setDecreaseCurrentVolume() {
        if(this.currentVolume <= 0) {
            return;
        }
        this.currentVolume = this.currentVolume - 1;
    }

    public int getCurrentStation() {
        return this.currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if(newCurrentStation < 0) {
            return;
        }
        if(newCurrentStation > 9) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public void setNextStation() {
        if(this.currentStation == 9) {
            this.currentStation = 0;
        } else {
            this.currentStation++;
        }
    }

    public void setPrevStation() {
        if(this.currentStation == 0) {
            this.currentStation = 9;
        } else {
            this.currentStation--;
        }
    }
}
