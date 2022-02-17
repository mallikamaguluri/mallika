package JavaPractics;

public class VsoftCompany {
    String president;
    String Managers;
    String Developers;

    public VsoftCompany(String poornaveer) {
        this.president = poornaveer;
    }

    public void VsoftCompany(String president){
        this.president = president;
       // this.Managers=Manager;
       // this.Developers=Developer;
    }
    void display(){
        System.out.println("president is :" + president);
    }
}
class Manager extends VsoftCompany
{
    int Managers =7;
    public Manager(String president,int managers)
    {
        super(president);
    }
    void display(){
        System.out.println("number of managers in each department under president :" + "managers");
    }
}
class Department extends VsoftCompany{
    int servicenow=3;
    int azure=2;
    int aws=5;
    int java=4;
    int mulesoft=6;

    public Department(String president ,String managers,String Departments){
        super("President");
    }
    void d1() {
        System.out.println("service now department has " + " " + servicenow + "" + "maangers");
        System.out.println("azure department has " + " " + azure + "" + "maangers");
        System.out.println("aws department has " + " " + aws + "" + "maangers");
        System.out.println("java department has " + " " + java + "" + "maangers");
        System.out.println("mulesoft department has " + " " + mulesoft + "" + "maangers");
        System.out.println("total number of managers in each department under president:" + (servicenow + azure + aws + java + mulesoft));
    }

    }
    class developers extends VsoftCompany {
        int servicedevelopers = 22;
        int azuredevelopers = 14;
        int awsdevelopers = 44;
        int Javadevelopers = 33;
        int Mulesoftdevelopers = 22;

          developers(String president, String departments, String developers) {
             super("President");

        }

        void f1() {
            System.out.println("servicenow department has" + " " + "servicenowdevelopers" + " " + "developers");
            System.out.println("azure department has" + " " +" azuredevelopers" + " " + "developers");
            System.out.println("java department has" + " " +" javadevelopers" + " " + "developers");
            System.out.println("aws department has" + " " + "awsdevelopers" + " " + "developers");
            System.out.println("mulesoft department has" + " " +" mulesoftdevelopers" + " " + "developers");
            System.out.println("toyal number of developers in each department under managers:" + ("servicenowdevelopers "+ azuredevelopers + awsdevelopers + "javadevelopers "+ "mulesoftdevelopers"));

        }
    }
    class main {
        public static void main(String[] args) {
            VsoftCompany v1 = new VsoftCompany("poornaveer");

            v1.display();

            Department d2 = new  Department("presidents", "managers", "departments");
            d2.d1();
            developers f3 = new developers("president", "departments", "developers");
            f3.f1();
        }
    }






