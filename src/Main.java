public class Main {

    public static void main(String[] args) {
     RandomListFacade randomListFacade=new RandomListFacade(new ListFilter(),new ListPrinter(),new RandomList());
     randomListFacade.printRandomEvenList();
    }
}