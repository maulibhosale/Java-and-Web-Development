package interfacedemo;

public class SmartPhone implements MusicPlayer,Camera {

	@Override
	public void takePhoto() {
		// TODO Auto-generated method stub
		System.out.println("We can take photos in smartphone");
	}

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("We can play music in smartphone");
	}

	public static void main(String[] args) {
		SmartPhone s = new SmartPhone();
		s.takePhoto();
		s.playMusic();
	}
	
}
