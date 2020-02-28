public class Main {
    public static void main(String[] args) {

        // create some music collection
        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();

        // create some music
        Music m1 = new Music("iran") ;
        Music m2 = new Music("dep") ;
        Music m3 = new Music("loool") ;
        Music m4 = new Music("sasi") ;

        // create a favorite music
        FavoriteMusic fm1 = new FavoriteMusic();


        pop.addFile(m1);
        pop.addFile(m2);
        pop.addFile(m3);
        pop.addFile(m4);
        pop.listAllFiles();
        System.out.println();
        fm1.addFile(m1);
        fm1.listAllFiles();
        System.out.println();

        pop.searchSongNameAndSinger("sasi");



    }
}
