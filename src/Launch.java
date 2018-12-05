public class Launch {
    public static void main(String[] args){
        SoundSystem surroundSoundSystem = new SurroundSoundSystem();
        SoundSystem surroundSoundSystemWith1Speaker = new SoundSystemSpeaker(surroundSoundSystem);
        SoundSystem surroundSoundSystemWith2Speakers = new SoundSystemSpeaker(surroundSoundSystemWith1Speaker);
        SoundSystem surroundSoundSystemWith2SpeakersAnd1Subwoofer = new SoundSystemSubwoofer(surroundSoundSystemWith2Speakers);
        surroundSoundSystemWith2SpeakersAnd1Subwoofer.playMusic();
    }

}
