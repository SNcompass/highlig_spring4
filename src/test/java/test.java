import org.junit.Test;

/**
 * @author F31
 * @Date 2021/11/05 15:41
 */
public class test {

    @Test
    public void test(){
        String str1 = "1283";
        String str2 = "哈哈";
        String str3 = null;
        String str = str1+str2+str3;
        System.out.println(String.valueOf(str.hashCode()));
    }
}
