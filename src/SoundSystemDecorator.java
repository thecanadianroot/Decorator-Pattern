public abstract class SoundSystemDecorator extends SoundSystem{
    private SoundSystem soundSystem;

    public SoundSystemDecorator(SoundSystem soundSystem){
        this.soundSystem = soundSystem;
    }

    @Override
    public void playMusic() {
        soundSystem.playMusic();
    }
}
