import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private String fullName;


    private int quota;
    private List<Component> componentList = new ArrayList<Component>();

    public List<Component> getComponentList() {
        return componentList;
    }

    public void setComponentList(List<Component> componentList) {
        
        this.componentList = componentList;
    }

    public Composite(String fullName, int quota) {
        setFullName(fullName);
        setQuota(quota);
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    //can have subclass
    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public int getQuota() {
        return quota;
    }

    @Override
    public void add(Component component) {
        getComponentList().add(component);


    }

    @Override
    public void remove(Component component) {
        getComponentList().add(component);

    }

    @Override
    public String toString() {
        return
                fullName + quota +componentList;
    }
}
