package OOP;

public class LoadingMessage {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Loading loading =  new Loading();
        loading.LoadingMessage();

    }
}

class Loading{
    static void LoadingMessage(){
        System.out.println("Loading...");
    }
}
