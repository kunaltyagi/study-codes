package ds4;

/**
 *
 * @author kunaltyagi
 */
public class DS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DLArray store = new DLArray();
        Item temp = new Item();
        temp.setName("Bournvita");
        temp.setId(189);
        long startTime, endTime, total = 0;
        for(int j = 0; j < 10; ++j) {
            startTime = System.nanoTime();
            for(int i = 0; i < 1000000; ++i)  {
                temp.setId(i+12);
                store.add(temp);
            }
            endTime = System.nanoTime();
            total = endTime - startTime + total;
        }
        total = 0;
        
        for(int j = 0; j < 10; ++j) {
            
            for(int i = 0; i < 100000; ++i)  {
                temp.setId((int)(1.5*i));
                startTime = System.nanoTime();
                store.search(temp);
                endTime = System.nanoTime();
                total = endTime - startTime + total;
            }
            
            
        }
        System.out.println(total/10L);
        //store.print();
        //System.out.println(store.search(temp));
        //System.out.println(store.getElement(store.search(temp)).getId());
    }
}

//     10I      43151      10D       7876      10S      26052
//    100I     359627     100D     110604     100S     216034
//   1000I    1731516    1000D     273346    1000S     395841
//  10000I    2790629   10000D    1179295   10000S    1711008
// 100000I    3952485  100000D    3759076  100000S   19984291
//1000000I    6750058 1000000D    5173061 1000000S  184168053 