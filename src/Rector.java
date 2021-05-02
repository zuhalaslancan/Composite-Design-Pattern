import java.util.ArrayList;
import java.util.List;

public class Rector { // this is client
    public static void main(String[] args) {
        List<Component> ieu = new ArrayList<Component>(); // universite oluşturuldu.
        Composite lawFac = new Composite("law", 15); // fakulte-departman oluşturuldu.
        Composite engineeringFac = new Composite("engineeringfac ", 54);
        Composite softwareEngDep = new Composite("softwareEng" , 52);

        Course course = new Course("introduction programming", 15);
        engineeringFac.add(softwareEngDep);
        ieu.add(lawFac);
        ieu.add(engineeringFac);

        System.out.println(ieu);
        softwareEngDep.add(course);
        System.out.println(ieu);
        Composite ceng= new Composite("ceng" , 50);
        engineeringFac.add(ceng);
        System.out.println(ieu);
        Course oryantasyon= new Course("oryantasyon " , 50);
        ieu.add(oryantasyon);

        System.out.println(ieu);






    }
}
