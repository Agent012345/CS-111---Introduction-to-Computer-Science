public class Song{

    //instance variables - describe the data type
    private double length; //minutes
    private int bpm; //beats per minute
    private String name; //name of song
    private String artist; //artist of song
    private boolean listened; //false - not listened to, true - listened

    //contructor(s)
    public Song(String name, String artist, double length, int bpm, boolean listened){
        this.name /*"this." Refers to instance variable*/ = name;
        this.artist = artist;
        this.length = length;
        this.bpm = bpm;
        listened = false;
    } //Song s = new Song ("APT", Rose & Bruno Mars, 3, 100);
 
    //getter methods (public ___ get____ and then return what you want to return)
    public String getName(){ //s.getName()
        return name;
    }

    public boolean Listened(){
        return listened;
    }

    public String getArtist(){
        return artist;
    }

    //other operations
    public void listen(){//s.listen();
        listened = true;
    }

    //want to find total # of beats in the song
    public double totalBeats(){
        return bpm * length;
        //bpm -int , length - double (minutes)
    }

    //s1.equals(s2)
    public boolean equals(Song other /*"other" is of type song*/){
        //name, artist have to be equals
        //name1 name2
        if (name.equals(other.getName()) && (artist.equals(other.getArtist()))){
            return true;
    }
        else
            return false;
    }

    public String toString(){
        //<name> by <artist>
        String str = new String (name + " by " + artist);
        return str;
     }

}