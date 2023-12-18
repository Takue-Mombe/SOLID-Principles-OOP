package Dependency_Inversion.bad;

public class MusicApp {
    private RockMusicPlayer rockMusicPlayer;
    public MusicApp(){
        this.rockMusicPlayer=new RockMusicPlayer();
    }
    public void playRockMusic(){
        rockMusicPlayer.playRockMusic();
    }

    public static void main(String[] args) {
        MusicApp ms=new MusicApp();
        ms.playRockMusic();
    }
}
class RockMusicPlayer{
    public void playRockMusic(){
        System.out.println("Rock Music");
    }
}
class ClassicalMusicPlayer{
    public void playClassicalMusic(){
        System.out.println("classic music");
    }
}
