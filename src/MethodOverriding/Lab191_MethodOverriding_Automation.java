package MethodOverriding;

public class Lab191_MethodOverriding_Automation {

    public static void main(String[] args) {


        CommonToAll a = new CommonToAll();
        a.OpenBrowser();
        ChromeTc T= new ChromeTc();
        T.OpenBrowser(3);

        FireFoxTc F = new FireFoxTc();
        F.OpenBrowser();

        // Dynamic Dispatch
//        CommonToAll c2 = new ChromeTC();
//        c2.openBrowser();
//
//        CommonToAll c3 = new Firefox();
//        c3.openBrowser();


        // Firefox ff = new ChromeTC(); Not relation



    }
}

class CommonToAll{
    void OpenBrowser(){
        System.out.println("Open the IE browser");
    }
}
class ChromeTc extends CommonToAll{
    @Override
    void OpenBrowser(){
        System.out.println("browser is opening");
    }

    int OpenBrowser(int a){
        return 10;
    }

}

class FireFoxTc extends CommonToAll{
    @Override
    void OpenBrowser(){
        System.out.println("Firefox browser will start");
    }
}
