package Dependency_Inversion.good;

import Interface_Segregation.MusicPlayer;

public class MusicApp{
    private MusicPlayer musicPlayer;

    MusicApp( MusicPlayer musicPlayer){
      this.musicPlayer=musicPlayer;
    }

    public void play(){
        musicPlayer.playMusic();
    }
    public static void main(String[] args) {
      MusicPlayer ms=new HipHopMusic();

      ms.playMusic();

    }
}
class  RockMusic implements MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("Play Rock music");
    }
}
class ClassicalMusic implements MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("Play Classical Music");
    }
}
class HipHopMusic implements MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("HipHop is On");
    }
}
