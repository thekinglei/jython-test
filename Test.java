import java.io.File;


public class Test
{
    public static void main(String[] args) {
        File test = new File("/root/ppppppp");
        test.mkdirs();
        
        System.out.println("create Path:/root/ppppppp");
    }
}
