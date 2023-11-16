public class Main {
    public static void main(String[] args) {
        //Run --> Edit Configuration --> Configuration Templates --> Program arguments
        Vehicle jarmu=new Vehicle(Integer.parseInt(args[0]),args[1]);
        System.out.println(jarmu.toString());
        jarmu.setMove();
        System.out.println(jarmu.toString());

        Car kocsi=new Car("321BCA",400);
        System.out.println(kocsi.isEngineIsWorking());
        kocsi.setStop();
        System.out.println(kocsi.toString());

        Bicycle bicikli=new Bicycle("iahf");
        System.out.println(bicikli.toString());
        bicikli.setSize(3);
        System.out.println(bicikli.toString());

        Vehicle[] jarmuvek=new Vehicle[5];
        jarmuvek[0]=jarmu;
        jarmuvek[1]=kocsi;
        jarmuvek[2]=bicikli;
        jarmuvek[3]=new Bicycle("ulqf");
        jarmuvek[4]=new Car("KYS-589", 360);
        System.out.println("----------------------------------");
        for(Vehicle v : jarmuvek){
            System.out.println(v);
        }



    }
}
