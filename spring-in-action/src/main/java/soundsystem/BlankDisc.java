package soundsystem;

import java.util.Collection;

public class BlankDisc implements CompactDisc {

	private String title;

	private String artist;

	private Collection<String> tracks;

	public BlankDisc(String title, String artist, Collection<String> tracks) {
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}

	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
		for (String track : tracks) {
			System.out.println("-Tracks: " + track);
		}
	}

}
