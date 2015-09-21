package no.moldesoft.tools.path.human;

/**
 * Created by Erling Molde on 21.09.2015.
 */
public class HumanPath {
    public HumanPath(String[] args) {
        parse(args);
    }

    private void parse(String[] args) {
    }

    public static void main(String[] args) {
        new HumanPath(args).execute();
    }

    private void execute() {
        String path = System.getenv("PATH");
        String[] split = path.split(";");
        System.out.printf("Path:%n");
        for (String s : split) {
            System.out.printf("\t%s%n", s);
        }
    }
}
