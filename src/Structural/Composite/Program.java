package Structural.Composite;

public class Program {
    public static void main(String[] args) {
        PostSales kirill = new PostSales("kirill", 21, "postsales");
        PostSales micha = new PostSales("micha", 50, "postsales");

        Director sasha = new Director("hildebrandt", 30, "post sales manager");
        sasha.addEmployee(kirill);
        sasha.addEmployee(micha);

        Director huy = new Director("pizd", 30, "pre sales sales manager");

        Director mainDirector = new Director("pizd", 30, "main dirctor");

        mainDirector.addEmployee(sasha);
        mainDirector.addEmployee(huy);

        mainDirector.showEmpDetails();




    }
}
