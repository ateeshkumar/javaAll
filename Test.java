import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test{

	public static void main(String[] args) {

		Veena v = new Veena();
		v.play();
		
		Playable p = new Veena();
		p.play();
		
		Saxophone s = new Saxophone();
		s.play();
		
		Playable ps = new Saxophone();
		ps.play();

	}

}

package music;

public interface Playable {

	void play();

}


package music.string;

import music.Playable;

public class Veena implements Playable {

	public void play() {

		System.out.println("Veena is Playing");

	}

}

package music.wind;

import music.Playable;

public class Saxophone implements Playable {

	public void play() {

		System.out.println("Saxophone is Playing");

	}

}
}
