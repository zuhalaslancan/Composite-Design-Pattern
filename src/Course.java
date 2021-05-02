public class Course implements Component {
    //leaf: there is no class under the this class.
    private String fullName;
    private int quota;




    @Override
    public void add(Component component) {


    }

    @Override
    public void remove(Component component) {

    }

    public Course(String fullName, int quota) {
        setFullName(fullName);
        setQuota(quota);
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public int getQuota() {
        return quota;
    }
    @Override
    public String toString() {
        return  fullName  + quota;
    }
}
