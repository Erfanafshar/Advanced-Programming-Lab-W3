import java.util.ArrayList;
import java.util.Iterator;

public class MusicCollection {
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> files;
    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        files = new ArrayList<Music>();
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(Music filename)
    {
        files.add(filename);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        System.out.println(files.get(index).getName());
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        /*for (int i = 0 ; i < files.size() ; i++ ){
            System.out.println(files.get(i));
        }*/
        Iterator<Music> it = files.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getName());
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        files.remove(index);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        player.startPlaying(files.get(index).getName());
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        // The return value.
        // Set according to whether the index is valid or not.
        if ( index <0 || index >= files.size()){
            System.out.println("file not found ! ");
            return false ;
        }
        else {
            return true ;
        }
    }

    public void searchSongNameAndSinger (String srch){
        Iterator<Music> it = files.iterator();
        while (it.hasNext()){
            if (srch.equals(it.next().name)){
                System.out.println("The " +srch + " song founded .");
                break;
            }
            else {
                if (srch.equals(it.next().name)){
                    System.out.println("The " +srch + " singer founded .");
                    break;
                }
                else {
                    //System.out.println("not found . ");
                    //break;
                }
            }
            //System.out.println("not found . ");
        }
    }
}
