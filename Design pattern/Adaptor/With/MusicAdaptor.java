package Adaptor.With;

public class MusicAdaptor implements OldMusic{

    private NewMusic newMusic;

    public MusicAdaptor(NewMusic newMusic){
        this.newMusic=newMusic;
    }

    @Override
    public void playOldSong() {
         newMusic.playNewSongs();
    }
    
    
}
