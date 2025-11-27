/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MediaPlayers;

/**
 *
 * @author VISHNUVARDHINI
 */
public class MainMediaPlayer 
{
    public static void main(String[] args)
    {
        AudioPlayer ad=new AudioPlayer();
        ad.audioplay();
        VideoPlayer vd= new VideoPlayer();
        vd.videoplay();
    }
 
}
