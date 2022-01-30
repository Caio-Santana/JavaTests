/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.hfjava.GameCharacter;

import java.io.*;

/**
 *
 * @author Caio
 */
public class GameSaverTest {

    public static void main(String[] args) {
        GameCharacter elf = new GameCharacter(100, "Lankhansva", "Elf", new String[]{"bow", "dagger", "sword"});
        GameCharacter wizard = new GameCharacter(150, "Merlin", "Human", new String[]{"staff", "scroll"});
        GameCharacter dwarf = new GameCharacter(230, "Toric", "Dwarf", new String[]{"Axe", "Hammer"});

        GameCharacter[] players = new GameCharacter[]{elf, wizard, dwarf};

        showCharactersStatus(players);
        
        // foi atingido por uma flecha (-25)
        elf.setHp(75);
        
        // tomou booster de hp (+50)
        wizard.setHp(200);
        
        // se machucou (-30)
        dwarf.setHp(200);

        serializeSaver(players);

        System.out.println("");
        players = serializeLoader();
        
        showCharactersStatus(players);

    }

    private static void serializeSaver(GameCharacter[] g) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            for (GameCharacter gameCharacter : g) {
                os.writeObject(gameCharacter);
            }
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static GameCharacter[] serializeLoader() {
        GameCharacter[] characters = new GameCharacter[3];
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            for (int i = 0; i < characters.length; i++) {
                characters[i] = (GameCharacter) is.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return characters;
    }

    private static void showCharactersStatus(GameCharacter[] characters) {
        for (GameCharacter c : characters) {
            System.out.println("Name: " + c.getName() + ", Hp: " + c.getHp() + ", Race: " + c.getRace() + ", Weapons: " + c.getWeapons());
        }
    }
}
