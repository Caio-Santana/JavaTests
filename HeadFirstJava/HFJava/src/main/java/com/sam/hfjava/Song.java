/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.hfjava;

import java.util.Comparator;

/**
 *
 * @author Caio
 */
public class Song implements Comparable<Song> {

    String artist;
    String title;
    String rating;
    String bpm;
    
    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    public Song(String artist, String title, String rating, String bpm) {
        this.artist = artist;
        this.title = title;
        this.rating = rating;
        this.bpm = bpm;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(Song o) {
        return this.title.compareTo(o.getTitle());
    }
}
