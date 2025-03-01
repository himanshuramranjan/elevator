public class ExternalButton extends Button {

    ButtonDispatcher buttonDispatcher;

    public ExternalButton() {
        this.buttonDispatcher = ExternalButtonDispatcher.getInstance();
    }

    public void pressButton(int floor, Direction direction) {

    }
}
