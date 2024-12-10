import com.github.dakusui.jcunit8.runners.junit4.JCUnit8;
import com.github.dakusui.jcunit8.runners.junit4.annotations.ConfigureWith;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;


@RunWith(JCUnit8.class)
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
    public int add(int a, int b) {
        return a + b;
    }
    @Test
    public void testAdd() {
        var result = add(1, 2);
        assertEquals(3, result);
    }
}

