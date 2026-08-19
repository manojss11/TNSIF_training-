package org.tnsif.acc.c2tc.multipleinterface;

class Smartphone implements Camera,MusicPlayer{

	@Override
	public void playmusic() {
		System.out.println("playong music on the smartphone");
		
	}

	@Override
	public void takephoto() {
		System.out.println("taking photo using smartphone");
		
	}
	
}
public class MultipleInterfaceDemo {

	public static void main(String[] args) {
		Smartphone Smartphone=new Smartphone();
		Smartphone.playmusic();
		Smartphone.takephoto();
	}

}
