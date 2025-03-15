package Adaptor.With;

public class Human {
 public static void main(String[] args) {
    
    NewMusic newMusic=new NewMusic();

    OldMusic oldMusic=new MusicAdaptor(newMusic) ;
    oldMusic.playOldSong();

 }   
}
