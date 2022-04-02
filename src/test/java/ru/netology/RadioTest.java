package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setIncreaseCurrentVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeToMax() {
        Radio radio = new Radio();
        for (int i = 0; i < 11; i++) {
            radio.setIncreaseCurrentVolume();
        }
        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setDecreaseCurrentVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeToMin() {
        Radio radio = new Radio();
        for (int i = 10; i != 0; i--) {
            radio.setDecreaseCurrentVolume();
        }
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNewStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        int expected = 7;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPressButtonNext() {
        Radio radio = new Radio();
        radio.setNextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckStationCycleNext() {
        Radio radio = new Radio();
        for (int i = 0; i < 10; i++) {
            radio.setNextStation();
        }
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPressPrevButton() {
        Radio radio = new Radio();
        radio.setPrevStation();
        int expected = 8;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckStationCyclePrev() {
        Radio radio = new Radio();
        for (int i = 10; i > 0; i--) {
            radio.setPrevStation();
        }
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
}
