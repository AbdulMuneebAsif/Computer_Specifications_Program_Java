public class Main {

    static String[] computerNames = {"Intel", "Dell", "Hp", "Lenovo"};
    static int[] memorySize = {4, 8, 2, 3};
    static int[] memoryPrice = {2400, 1200, 600, 750};
    static int[] monitorSize = {-1, 0, 17, 14};


    public static void main(String[] args) {

        Computer[] computers = initComputers(initProcessors());

        displayComputerSpecs(computers);

//        the end of this task !!!
    }

    private static void displayComputerSpecs(Computer[] computers)
    {
        for (Computer computer : computers) {
            System.out.println(" \n\t\t***************** " + computer.mboard.getCompName() + " ******************** ");

            computer.display();

        }
    }

    private static Computer[] initComputers(Processor[][] processors) {

        Computer[] computers = new Computer[processors.length];

            for (int i = 0; i < processors.length; i++)
            {
                computers[i] = new Computer(computerNames[i], processors[i], new MainMemory(memorySize[i], memoryPrice[i]));
                computers[i].setMonitor(monitorSize[i]);
            }
        return computers;
    }

    private static Processor[][] initProcessors() {

        Processor[][] processors = new Processor[4][5];

        processors[0] = new Processor[]{
                new Processor(250f, 1.8f),
                new Processor(150.0f, 2.2f)
        };

        processors[1] = new Processor[]{
                new Processor(255f, 1.8f),
                new Processor(149.99f, 2.2f),
                new Processor(123.45f, 3.3f)
        };

        processors[2] = new Processor[]{
                new Processor(260f, 1.8f)
        };

        processors[3] = new Processor[]{
                new Processor(22.2f, 1.8f),
                new Processor(234.5f, 2.2f),
                new Processor(345.1f, 3.3f),
                new Processor(1234.67f, 4.4f),
                new Processor(3456.65f, 5.5f)
        };

        return processors;
    }
}