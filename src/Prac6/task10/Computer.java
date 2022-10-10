/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package Prac6.task10;

public class Computer
{
    protected CPU cpu;
    protected Memory memory;
    protected Monitor monitor;
    protected Brends brend;
    protected int price;

    public Computer(int cores, int capacity, int diagonal, Brends brend, int price) {
        this.cpu = new CPU(cores);
        this.memory = new Memory(capacity);
        this.monitor = new Monitor(diagonal);
        this.brend = brend;
        this.price = price;
    }

    public CPU getCpu() {
        return cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Brends getBrend() {
        return brend;
    }

    public int getPrice() {
        return price;
    }

    public void display()
    {
        System.out.print("Количество ядер: " + cpu.getCores() +
                " Диагональ экрана: " + monitor.getDiagonal() + " Объём ОЗУ: " + memory.getCapacity() + " Бренд: ");
        switch (brend)
        {
            case DELL:
                System.out.println("Dell");
                break;
            case APPLE:
                System.out.println("Apple");
                break;
            case MSI:
                System.out.println("Msi");
                break;
            case ASUS:
                System.out.println("Asus");
                break;
        }
    }
}
