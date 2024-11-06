import java.util.ArrayList;
import java.util.List;

public class Portfolio  {

    public void addAsset(Valuable v){
        assets.add(v);
    }

    private List<Valuable> assets = new ArrayList<>();
}
