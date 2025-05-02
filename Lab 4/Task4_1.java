/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahsan.lav_4;

/**
 *
 * @author ASUS
 */
class Song {
    String title;
    String artist;
    static int playCount=0;

Song(String title,String artist){
this.title=title;
this. artist=artist;
}

void play(){
   playCount++;
    System.out.println("Playing \"" + title + "\" by " + artist + "...");
}
 static int getPlayCount(){
     return playCount;
 }


}

public class Task4_1 {
    public static void main(String[] args) {
        Song s1=new Song("Bohemian Rhapsody", "Queen");
        Song s2=new Song("Shape of You", "Ed Sheeran");
        s1.play();
        s2.play();
        s1.play();

        System.out.println("Total songs played: " + Song.getPlayCount());
    }
}
