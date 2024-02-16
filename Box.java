import java.util.ArrayList;
import java.util.List;


class Box{
    private List<String> contents;

    public Box() {
        this.contents = new ArrayList<String>();
    }
    
    public void add(String truc) {
        this.contents.add(truc);
    }

    public boolean contains(Object o) {
        return this.contents.contains(o); 
    }

}