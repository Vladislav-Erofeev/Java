/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package Prac6.task12;

public interface Command // интерфейс одной команды
{
    void execute(String str, int...args);
    void undo();
}
