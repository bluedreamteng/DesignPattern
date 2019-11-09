package iteratorpattern;

/**
 * 测试代码
 * @author zhangtf
 * @date 2019-09-09 07:36
 */
public class MenuTestDrive {
    public static void main (String[] args) {
        PencakeHouseMenu pencakeHouseMenu = new PencakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pencakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
