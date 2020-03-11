import org.junit.*;

public class StackTest {
    //WHAT IS GOING ON?
    StackInterface<Integer> s;

    @Before
    public void setup() throws Exception{
        //Initialize testing stack
        s= new Stack<Integer>(5);

        s.push(1);
        s.push(2);
        s.push(3);
    }

    @Test
    public void testPush() throws Exception {
        //Try to push elements over the size of the stack
        s.push(4);
        s.push(5);

        Assert.assertEquals("push", 5, s.size());
        // Assert statements
        //System.out.print("The function knows it is not possible:"+ assertEquals(-1,s.push(6)));
        //System.out.print("The stack maintains the full state size:"+assertEquals(5, s.size()));
    }

    @Test(expected=PilaLlenaException.class)
    public void testPushStackFull() throws Exception {
        //Try to push elements over the size of the stack
        s.push(4);
        s.push(5);
        s.push(5);

        Assert.assertEquals("push", s.size(), 5);
    }


    @Test
    public void TestPop() throws Exception{
        //Try to pop elements under the empty state
        Assert.assertEquals("testPop", 3, s.size());

         int i=s.pop();
         Assert.assertEquals("testPop",3, i);
         Assert.assertEquals("testPop", 2, s.size());

         s.pop();


         s.pop();
         // Assert statements
//         System.out.print("The function knows it is not possible:"+assertEquals(-1,s.pop));
//         System.out.print("The stack maintains the empty state size :"+assertEquals(0,s.size()));

     }
}