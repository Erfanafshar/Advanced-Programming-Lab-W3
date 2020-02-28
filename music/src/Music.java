public class Music {

    // Fields //
    public String name ;
    private String musicAddress ;
    public String singer ;
    private String releaseDate ;

    // Constructor //

    public Music (String nme){
        name =nme ;
    }

    public Music (String nme , String snger , String releaseD){
        name = nme ;
        singer = snger ;
        releaseDate = releaseD ;
    }

    // Method //

    public void setMusicAddress(String musicA){
        musicAddress = musicA ;
    }

    public String getMusicAddress() {
        return musicAddress;
    }

    public String getName() {
        return name;
    }
}
