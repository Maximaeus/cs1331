import java.util.Scanner;
import java.io.File;

public class StraightAs {

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Welcome to Java."
                + "Are you ready to take on the challenge?\n"
                + "Make sure you read and fully understand"
                + "the provided instructions and the comments"
                + "in this file to ensure you get full credit for your work.");

            showUsage("");
        } else if (args.length == 3) {
            // The code you write in processGrades will be called when your
            // program is run with two additional command line arguments, for
            // example: java StraightAs myfile.csv myseparator
            processGradesFromFile(args[0], args[1], args[2]);
        } else {
            showUsage(args[0]);
        }
    }


    /**
     * This method will create a grade histogram from a given csv file.
     * In your implementation, you need to read in the data, parse it as a CSV
     * formatted file with the provided data separator string, and output the
     * processed data to your terminal window. See the @param tags below for
     * more details on each parameter
     *
     * @param filename      the filename of the CSV file to read and process
     *                      data from
     * @param separator     the CSV file's given data separator. This is the
     *                      string constant that your program should use to
     *                      split each line in the CSV file into data fields
     *                      for parsing
     * @param displayMode   the type of output your program should show. We
     *                      define three modes: TABLE, HIST, and BOTH. See the
     *                      homework instructions for information on each of
     *                      these modes
     * @throws Exception    Don't worry about what this means yet. You'll learn
     *                      about exceptions later in the course =)
     */
    public static void processGradesFromFile(
            String filename, String separator, String displayMode)
        throws Exception {
        File file = new File(filename);
        Scanner fileScanner = new Scanner(file);
        boolean reading = true;
        fileScanner.useDelimiter(separator);
        
        String[] currNames = {fileScanner.next().trim()};
        fileScanner.skip(separator);
        fileScanner.useDelimiter("\n");
        int[] currGrades = {Integer.parseInt(fileScanner.next().trim())};
        fileScanner.useDelimiter(separator);
        while (reading) {
            if (!fileScanner.hasNext("\n")) {
                String[] tempNames = currNames;
                currNames = new String[tempNames.length + 1];
                for (int i = 0; i < tempNames.length; i++) {
                    currNames[i] = tempNames[i];
                }
                currNames[currNames.length - 1] = fileScanner.next().trim();
                fileScanner.skip(separator);
                fileScanner.useDelimiter("\n");
                int[] tempGrades = currGrades;
                currGrades = new int[tempGrades.length + 1];
                for (int i = 0; i < tempGrades.length; i++) {
                    currGrades[i] = tempGrades[i];
                }
                currGrades[currGrades.length - 1]
                    = Integer.parseInt(fileScanner.next().trim());
                fileScanner.useDelimiter(separator);
            } else {
                    reading = false;
            }
        }
        setNames(currNames);
        setGrades(currGrades);
        setBins();

        switch (displayMode.toUpperCase()) {
        case "TABLE":
            printTable();
            break;
        case "HIST":
            printHist();
            break;
        case "BOTH":
            printTable();
            printHist();
            break;
        default:
            System.out.println("No display choice");
            break;
        }
    }

    private static String[] names;
    private static int[] grades;
    private static int[] bins = new int[10];

    public static void setNames(String[] newNames) {
        names = newNames;
    }

    public static void setGrades(int[] newGrades) {
        grades = newGrades;
    }

    //Generates histogram based on current grades
    public static void setBins() {
        bins = new int[10]; //Reset bins to 0.
        if (grades != null) {
            for (int grade : getGrades()) {
                if (0 < grade && grade <= 10) {
                    bins[0] += 1;
                } else if (10 < grade && grade <= 20) {
                    bins[1] += 1;
                } else if (20 < grade && grade <= 30) {
                    bins[2] += 1;
                } else if (30 < grade && grade <= 40) {
                    bins[3] += 1;
                } else if (40 < grade && grade <= 50) {
                    bins[4] += 1;
                } else if (50 < grade && grade <= 60) {
                    bins[5] += 1;
                } else if (60 < grade && grade <= 70) {
                    bins[6] += 1;
                } else if (70 < grade && grade <= 80) {
                    bins[7] += 1;
                } else if (80 < grade && grade <= 90) {
                    bins[8] += 1;
                } else {
                    bins[9] += 1;
                }
            }
        } else {
            System.out.println("No values in grades. Cannot generate histogram.");
        }
    }

    public static String[] getNames() {
        return names;
    }

    public static int[] getGrades() {
        return grades;
    }

    public static int[] getBins() {
        return bins;
    }

    public static void printTable(){
        for (int i = 0; i < getNames().length; i++) {
            System.out.printf("%-10s %3d\n", getNames()[i], getGrades()[i]);
        }
    }

    public static void printHist() {
        for (int i = 9; i >= 0; i--) {
            String bar = new String();
            for (int j = 0; j < getBins()[i]; j++) {
                bar += "[]";
            }
            switch (i) {
            case 9:
                System.out.println("91-100 | " + bar);
                break;
            case 8:
                System.out.println("81- 90 | " + bar);
                break;
            case 7:
                System.out.println("71- 80 | " + bar);
                break;
            case 6:
                System.out.println("61- 70 | " + bar);
                break;
            case 5:
                System.out.println("51- 60 | " + bar);
                break;
            case 4:
                System.out.println("41- 50 | " + bar);
                break;
            case 3:
                System.out.println("31- 40 | " + bar);
                break;
            case 2:
                System.out.println("21- 30 | " + bar);
                break;
            case 1:
                System.out.println("11- 20 | " + bar);
                break;
            case 0:
                System.out.println(" 1- 10 | " + bar);
                break;
            default:
                System.out.println("something's wrong");
                break;
            }
        }
    }


    /**
     * Displays the helpful usage string you get when the program doesn't
     * understand your arguments
     * @param arg   just a little argument for the method. who knows what it's
     *              for... Certainly isn't for displaying a secret message
     *              hidden in this file.......
     */
    private static void showUsage(String arg) {
        char notA = 97;
        if (arg.equals("1337h" + notA + "ckerm" + notA + "n")) {
            // don't worry about this!
            // this is a really insecure decryption function
            // Don't worry about how it works. If you really want to know,
            // come hang out with me in my office hours! ~Alex
            char[] ct = WHAT_IS_THIS.toCharArray();
            int n = ct.length - 2;
            // These are bitwise operators. Yikes!
            // You'll learn about them in CS2110 if you take it.
            java.util.Random r
                = new java.util.Random(((ct[0] << 8) & 0x0F00) | ct[1]);

            StringBuilder sb = new StringBuilder();

            // some nice java8 functional programming here
            r.ints(0, n).distinct().limit(n).forEachOrdered(
                    i -> sb.append((char) (ct[i + 0x2] ^ 0x9)));
            System.out.println(sb.toString());
        } else {
            System.out.println("Usage is:\t"
                    + "java StraightAs <filename.csv> <separator> <displayMode>"
                    + "\n\nSeparators: any valid java string. For example:"
                    + "\n\tNOTACOMMA\n"
                    + "\t,\n"
                    + "\t4L3X1SK00L\n\nDisplay Modes (see instructions for"
                    + " more info):\n"
                    + "\tTABLE\tdisplays a table of the names and grades in "
                    + "the csv file\n\tHIST\tdisplays the histogram of "
                    + "the grades.\n\tBOTH\tdisplays both the table and "
                    + "the histogram\n"
                    + "\nRunning the program with arguments:"
                    + "\n\tjava StraightAs sample_data.csv , HIST");
        }
    }

    // lol <3
    private static final String WHAT_IS_THIS = "q¤h`o})l)})){enpl%)hz~o"
            + "|hm.Jlq)l)llh|e4hlz))))ee))}l)el{zgzgh``mz"
            + ")h{)`d))%)fg)j}{`8`ff)'o"
            + "hfakk)e)kbeeoo``Z)pmhe)gb}e8)'nff}"
            + "ll)e){{jm`{|zh)p|l)h{e))\"hj`])`of)))()noff{lfyd)p)E)k|lzo"
            + "ff{`l)))lz}Jfmdflg}))nzll)d)))|)2}"
            + "{n}}l)l)ll)kg{)g)`)ggllf)hhddzlf}}@og))d~z"
            + "lzep)k}dfg}jg))~d}){)h)) ydh}ze"
            + "fl)ogqg)fzl~p){f`}}))6lpg)g}m%j.)m~eepn.|`{afnlegd)))nfg})zl"
            + "}{.h`fnl~h|)hhj{|}fz~jhf{)}%)h)f}flfh)f"
            + "mleq|Dnm|{ak)gdh){3nfh)}of)hy)`mzh{)p)ao))ozjkglofg})`"
            + "mopzl}]o|~{h)a)d))|i`Z}fh)z{a))f'zl}gaklg)!|)hbl{}gfa3"
            + "f)`g)l7"
            + "{)l|le)o)fl)}j`}eM)li )))f:))ga}hyd}ez){{z)"
            + "zz)ojlp)hl!dh|j}g)o{gzg|zzlh)lz}"
            + "goah')d))){)l{f}l)zZk)af{|z)))p)A`)${h))d)g}h)"
            + "))l)%`~'fnz)`d)e)zeehf(}f){l)d}y)a)|majmg`gpan)|hm)n))"
            + "l)lz)kfl)jh%g)oo))jj}f)lh)Mh)lg)))`n|jH"
            + "))))pmk)aPd))|)gl`z))kjfzpm)))e{l}ff)zlal3)%zfgml)}l)g"
            + "`)h)))`f}})%{{}lea)y)enz``)~`{af~efg')!m)joy))})'b|{`3|jf)"
            + ")))})`)){hhd)d)ggnl)flk{|)|}flgldal})lzzp~lm)m}):p)l))a))fm~"
            + "y{!f{|H})nkl)f)e)Fgllgh){')|jz`3mlz}h%zl)b{gna')"
            + "`z`j~hak)){fz))l)e))a})z)}l)zgm) fmll|dh)lzl|o}!{fp{))l))J%)"
            + ")mhzjljzm)afz}}jnjfzMgo)h{)'{j`gg)fzl|l)e))dhly){hi{`f)))jd)k)"
            + "f)d})flj`5f}p3el)))zllf))f)z%)malbff.ym)}|(`d))l}`a))l"
            + ")l)yh{lzfz)me)k)e)mhm{z{|)m)fl)fEf){)mlfyjfn)"
            + ")}`)z{f7zmg{gzflk)lhlnlaf)bn)h)fh allezhdlo"
            + "))})fh{bj))opl)lb}je`z)yh)}yl`ak`)))ey))lh)}fP`y`ml)o "
            + ")h{f}l)){io)l)ep))hfeZ)g~}}}f)z)l)fgzhy|zzl"
            + "lg)kzofla)}f)ab))@}y)ll`{h)n~)pmelzlz```)";
}
