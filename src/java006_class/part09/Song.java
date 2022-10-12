package java006_class.part09;

public class Song {
	String title;
	String artist;
	String album;
	String[] composer;
	int year;
	int track;
	
	public Song() {
		
	}

	public Song(String title, String artist, String album, String[] composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
		show();
	}

	public void show() {
			
		System.out.printf("노래제목: %s\n", title);
		System.out.printf("가수: %s\n", artist);
		System.out.printf("앨범: %s\n", album);
		System.out.printf("작곡가: %s, %s\n", composer);
		System.out.printf("년도: %d\n", year);
		System.out.printf("트랙: %d\n", track);

	}
}
