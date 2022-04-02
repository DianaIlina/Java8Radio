package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setIncreaseCurrentVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setDecreaseCurrentVolume();
        int expected = 9;
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
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setNextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setPrevStation() {
        Radio radio = new Radio();
        radio.setPrevStation();
        int expected = 8;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }


}
