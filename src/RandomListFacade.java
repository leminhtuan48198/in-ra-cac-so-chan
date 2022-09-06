import java.util.ArrayList;
import java.util.List;

public class RandomListFacade {
    private ListFilter listFilter;
    private ListPrinter listPrinter;
    private RandomList randomList;

    public RandomListFacade() {
    }

    public RandomListFacade(ListFilter listFilter, ListPrinter listPrinter, RandomList randomList) {
        this.listFilter = listFilter;
        this.listPrinter = listPrinter;
        this.randomList = randomList;
    }

    public void printRandomEvenList(){
        List numbers=new ArrayList<>();
        numbers=this.randomList.generateList(10,0,10);
        numbers=this.listFilter.filterOdd(numbers);
        this.listPrinter.printList(numbers);
    }
}
