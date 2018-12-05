public class SoundSystemSubwoofer extends SoundSystemDecorator {
    public SoundSystemSubwoofer(SoundSystem soundSystem) {
        super(soundSystem);
    }

    @Override
    public void playMusic() {
        super.playMusic();
        System.out.println("Subwoofer is playing music");
    }
}
