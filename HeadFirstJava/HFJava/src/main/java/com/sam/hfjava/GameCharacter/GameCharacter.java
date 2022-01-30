/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.hfjava.GameCharacter;

import java.io.Serializable;

/**
 *
 * @author Caio
 */
public class GameCharacter implements Serializable {

    private int hp;
    private String name;
    private String race;
    private String[] weapons;

    public GameCharacter(int hp, String name, String race, String[] weapons) {
        this.hp = hp;
        this.name = name;
        this.race = race;
        this.weapons = weapons;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            return;
        }
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public String getWeapons() {
        String weaponsList = "";
        for (String weapon : weapons) {
            weaponsList += weapon + ", ";
        }
        return weaponsList;
    }

}
