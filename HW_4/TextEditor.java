package HW_4;

class TextEditor {
    String text = "";

    public void addText(String newText) {
        text += newText + " ";
    }

    public void displayText() {
        System.out.println("Текущий текст: " + text);
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.addText("Привет");
        editor.addText("мир");
        editor.displayText();
    }
}
