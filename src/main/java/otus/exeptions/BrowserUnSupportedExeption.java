package otus.exeptions;

public class BrowserUnSupportedExeption extends RuntimeException{

    public BrowserUnSupportedExeption(String browser){
        super(String.format("Browser %s unsupported",browser));
    }

}
