package com.company;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;
public class MusicMain {
    public static void main(String args[]) {
        Veena v = new Veena();
        Saxophone s = new Saxophone();
        Playable pv, ps; /c. Place the above instances in a variable of type Playable and then call play()./
                pv = new Veena();
        ps = new Saxophone();

        v.play(); /a. Create an instance of Veena and call play() method/
                s.play(); /b. Create an instance of Saxophone and call play() method/

                pv.play(); /c. Place the above instances in a variable of type Playable and then call play()./
                ps.play();

    }
}