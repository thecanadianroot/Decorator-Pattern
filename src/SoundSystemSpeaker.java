public class SoundSystemSpeaker extends SoundSystemDecorator{
    public SoundSystemSpeaker(SoundSystem soundSystem) {
        super(soundSystem);
    }

    @Override
    public void playMusic() {
        super.playMusic();
        System.out.println("Speaker is playing some music");
    }
}
