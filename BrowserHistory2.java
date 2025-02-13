
import java.util.Deque;
import java.util.LinkedList;

public class BrowserHistory2 {

    private Deque<String> history = new LinkedList<>();

    public void visitSite( String site){
        history.addFirst(site);
    }
    public  String back (int steps){
        if (steps >= history.size()){
            return null;
        }
        return 
        history.stream().skip(steps).findFirst().orElse(null);
    }
    public  Deque<String> getHistory(){
        return history;
    }
}
