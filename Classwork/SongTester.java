public class SongTester{

    public static void main(String[] args){

        //create Song objects - using the constructor
        //Song(String name, String artist, double length, int bpm)
        Song s1 = new Song("No One Noticed", "The Marias", 3.9, 98, false);
        Song s2 = new Song("Thick Of It", "KSI", 2.9, 120, false);
        Song s3 = new Song("APT", "Rose & Bruno Mars", 2.8, 149, false);
        Song s4 = new Song("Espresso", "Sabrina Carpenter", 2.5, 135, false);

        //did we listen to Espresso?
        System.out.println(s4.Listened());

        //listen to Espresso!
        s4.listen();

        //now, did we listen to Espresso?
        System.out.println(s4.Listened());

        Song[] album = {s1, s2, s3, s4};
        for (int i = 0; i < album.length; i++){
            // if (album[i].getName().charAt(0) == 'A'){ //Name of current song and first character;
                // System.out.println(album[i]);
            //only print songs that have more than 350 beats
            if (album[i].totalBeats() > 350)
                System.out.println(album[i]);
                System.out.println(album[i].toString());
            }
    }
}