package FinalWork;

import  FinalWork.storage.*;
import  FinalWork.view.View;
import  FinalWork.view.interfaceView;

public class Main {
    
    public static void run() {
        Controller Controller = new Controller(new Storage());
        interfaceView view = new View(Controller);

        while (true) {
            view.showKennelRegistry();
            interfaceView.MainMenuCommand code = view.showMainMenuWithResult();
            switch (code) {
                case ADD_ANIMAL -> {
                    boolean result = view.showAddAnimalDialog();
                    String resMessage = result ? "Животное добавлено" : "Не удалось добавить животное";
                    System.out.println(resMessage);
                }
                case SHOW_SKILLS -> {
                    view.showDetailInfoAnimalDialog();
                }
                case REMOVE_ANIMAL -> {
                    int removeId = view.showRemoveAnimalDialog();
                    String resMessage = removeId > -1  ? "Выписано животное" + removeId : "Не удалось  выписать животное";
                    System.out.println(resMessage);
                }
                case EXIT -> {
                    System.out.println("Еще увидимся");
                    return;
                }
            }
        }
    }
}
