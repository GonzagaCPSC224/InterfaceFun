public class InterfaceTester {
    public static void main(String[] args) {
        System.out.println("Output 1: " + "zags".compareTo("apple"));
        System.out.println("Output 2: " + "zags".compareTo("Zags"));
        System.out.println("Output 3: " + "zags".compareTo("zigs"));
        System.out.println("Output 4: " + "zags".compareTo("zags"));
        System.out.println("Output 5: " + "zags".equals("zags"));
        System.out.println("Output 6: " + "zags".equals("Zags"));
        Circle myCircle = new Circle();
        System.out.println("Output 7: " + myCircle.equals(myCircle));
        System.out.println("Output 8: " + new Circle().equals(new Circle()));

        /*
        What does compareTo() return when invoked with a String?
            <0 when the invoking obj < the arg obj
            >0 when the invoking obj > the arg obj
            0 when the invoking obj and the arg obj are the same (string)
        When would you use compareTo()?
            arrays, ordering, ...
        What does equals() return when comparing Strings?
            boolean, true when the strings are the same
            false otherwise
            strings are immutable (cannot be changed)
        What does equals() return when comparing Circles?
            true, if the references refere to the same Circle object in mmemory
            false, otherwise
        In general, what is the purpose of equals()? (tricky)
            to determine if two references refer to the same object in memory
            this behavior is inherited from Object
            you can override it if you want to value comparison
        What happens when you try to run the following line of code (Output 9)?
        Any ideas for how to fix this so we can compare two Circle objects?

        System.out.println("Output 9: " + myCircle.compareTo(myCircle));
         */
    }
}
