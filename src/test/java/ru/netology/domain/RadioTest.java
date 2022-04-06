package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldIncreaseVolume() {
        radio.setIncreaseCurrentVolume();
        int expected = 11;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeToMax() {
        for (int i = 0; i < 101; i++) {
            radio.setIncreaseCurrentVolume();
        }
        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setDecreaseCurrentVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeToMin() {
        for (int i = 100; i != 0; i--) {
            radio.setDecreaseCurrentVolume();
        }
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNewStation() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(13);
        int expected = 13;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationOverMax() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(18);
        int expected = 5;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowMin() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(-1);
        int expected = 5;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPressButtonNext() {
        Radio radio = new Radio(15);
        radio.setNextStation();
        int expected = 6;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckStationCycleNext() {
        Radio radio = new Radio(15);
        for (int i = 0; i < 15; i++) {
            radio.setNextStation();
        }
        int expected = 5;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPressPrevButton() {
        Radio radio = new Radio(15);
        radio.setPrevStation();
        int expected = 4;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckStationCyclePrev() {
        Radio radio = new Radio(15);
        for (int i = 15; i > 0; i--) {
            radio.setPrevStation();
        }
        int expected = 5;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
}
