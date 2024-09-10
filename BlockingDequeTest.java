import java.util.concurrent.BlockingDeque;
import java.util.concurrent.*;
import java.util.concurrent.LinkedBlockingDeque;

import javax.swing.text.html.HTMLDocument.Iterator;

public class BlockingDequeTest {
    public static void main(String[] args) {
        BlockingDeque<Integer> block = new LinkedBlockingDeque<>(null);
        block.add(12);
        block.add(873);
        block.add(90);
        // Iterator lbdqIter = block.iterator();
        for (int i = 0; i < block.size(); i++) {
            System.out.println(i);
        }
    }

}
