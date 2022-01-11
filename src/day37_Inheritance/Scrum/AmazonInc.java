package day37_Inheritance.Scrum;

public class AmazonInc {

    public static void main(String[] args) {

        String company="Amazon Inc";

        ProductOwner PO= new ProductOwner("Jason",26,'M',1315,"PO",160000,company);

        ScrumMaster SM=new ScrumMaster("Asiya",30,'F',1215,"SM",130000,company);

        BusinessAnalyst BA=new BusinessAnalyst("Heydar",36,'M',1812,160000,company);

        Tester tester1=new Tester("Chinara",32,'F',1415,"QA",125000,company);

        Tester tester2=new Tester("Yasaman",31,'F',1416,"QA",130000,company);

        Tester tester3=new Tester("Irena",29,'F',1417,"QA",128000,company);

        Tester tester4=new Tester("Cihad",26,'M',1418,"QA",125000,company);
        Tester[] testers={tester1,tester2,tester3,tester4};

        Developer developer1=new Developer("Gunay",27,'F',8,"Java Developer",160000,company);

        Developer developer2=new Developer("Anar",28,'M',1516,"Developer",165000,company);


        Developer[] developers={developer1,developer2};


        ScrumTeam st=new ScrumTeam(PO,BA,SM);
        st.addTesters(testers);
        st.addDevelopers(developers);
        System.out.println(st);

        for(Tester eachTester: testers){
            System.out.println(eachTester.name+" : "+eachTester.salary);
        }
        System.out.println("--------------------------------------------");

        for(Developer eachDeveloper:developers){
            System.out.println(eachDeveloper.name+" : "+eachDeveloper.salary);
        }

    }
}
