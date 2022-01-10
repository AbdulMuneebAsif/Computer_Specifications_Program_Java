public class Computer {

    //  An array of type processor containg all the processors
    Processor[] processors;

    //  A data member named " ram " of type MainMemory
    MainMemory ram;

    //  A data member named " mboard " of type MotherBoard
    MotherBoard mboard;

    //  A data member named "screen" of type Monitor
    Monitor screen;

    //    parameterized constructor that accepts 3 args mentioned in the problem
    Computer(String computer_name, Processor[] processor, MainMemory ram) {
        this.mboard = new MotherBoard();
        this.mboard.setCompName(computer_name);

        this.processors = processor;
        this.ram = ram;

//      instantiate Monitor's object (screen) with default screen size of 15 inches...

        screen = new Monitor(15);
    }

//    setter function to set the screen size of monitor

    public void setMonitor(int size) {
        if (size >= 0) {
            this.screen.setSize(size);
        }
    }

//    a display function that print complete computer specifications

    public void display() {

//        check that if a computer have more than 4 processors, then display an error message

        if (processors.length <= 4) {
            System.out.print(" \nComputer : " + mboard.getCompName());

//        check that if the of monitor is 0 then it means that Monitor does not exist & display " without monitor " message

            if (screen.getSize() == 0) {
                System.out.println(" without Monitor ");
            }
//        otherwise, display the actual size of monitor

            else {
                System.out.println(" with Monitor size " + screen.getSize() + " inches ");
            }
            System.out.print("CPU(s)   : ");

            for (Processor processorElement : processors) {            //For each element named processorElement from array processors
                System.out.print(processorElement.speed + ", ");
            }
            System.out.println(" MHz  ");

            System.out.println("RAM      : " + ram.size + " Gb");
        } else {
            System.out.println("\nComputer cannot have more than 4 processors.");

            System.out.println("ERROR !!!");
        }

    }
}
