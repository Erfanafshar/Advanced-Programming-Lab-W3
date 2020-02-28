import java.util.ArrayList;
import java.util.Iterator;

public class FavoriteMusic {

    private ArrayList<Music> files;

    public FavoriteMusic (){
        files = new ArrayList<Music>();
    }

    public void addFile(Music filename)
    {
        files.add(filename);
    }

    public int getNumberOfFiles()
    {
        return files.size();
    }

    public void listFile(int index)
    {
        System.out.println(files.get(index).getName());
    }

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

    public void removeFile(int index)
    {
        files.remove(index);
    }
}
