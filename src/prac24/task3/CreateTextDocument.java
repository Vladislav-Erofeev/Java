/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac24.task3;

public class CreateTextDocument implements ICreateDocument{

    @Override
    public IDocument createNew() {
        TextDocument newFrame = new TextDocument("New file");
        newFrame.addText("New file");
        return newFrame;
    }

    @Override
    public IDocument createOpen() {
        TextDocument newFrame = new TextDocument("Open file");
        newFrame.addText("Opened file");
        return newFrame;
    }
}
