
package MediaPlayers;


public class VideoPlayer extends MediaPlayer
{

    @Override
    void audioplay()
    {
      System.out.println("playing audio file");

    }

    @Override
    void videoplay() 
    {
       System.out.println("playing video file");

    }
    
}
