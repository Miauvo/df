
//https://en.wikipedia.org/wiki/ANSI_escape_code


public class df
{
    public static final String ANSI_RESET_BLACK =       "\u001B[30;0m";  //Черный
    public static final String ANSI_RESET_GRAY =        "\u001B[30;1m";  //Серый

    public static final String ANSI_TEXT_LIGHT_RED =    "\u001B[31;1m";  //Светло красный
    public static final String ANSI_TEXT_LIGHT_GREEN =  "\u001B[32;1m";  //Светло зеленый
    public static final String ANSI_TEXT_LIGHT_YELLOW = "\u001B[33;1m";  //Светло желтый
    public static final String ANSI_TEXT_LIGHT_BLUE =   "\u001B[34;1m";  //Светло синий
    public static final String ANSI_TEXT_LIGHT_PINK =   "\u001B[35;1m";  //Розовый
    public static final String ANSI_TEXT_LIGHT_CYAN =   "\u001B[36;1m";  //Голубой
    public static final String ANSI_TEXT_LIGHT_GRAY =   "\u001B[37;22m"; //Светло серый

    public static final String ANSI_TEXT_DARK_RED =     "\u001B[31;2m";  //Бордовый
    public static final String ANSI_TEXT_DARK_GREEN =   "\u001B[32;2m";  //Темно зеленый
    public static final String ANSI_TEXT_DARK_YELLOW =  "\u001B[33;2m";  //Темно желтый
    public static final String ANSI_TEXT_DARK_BLUE =    "\u001B[34;2m";  //Темно синий
    public static final String ANSI_TEXT_DARK_PINK =    "\u001B[35;2m";  //Темно Розовый
    public static final String ANSI_TEXT_DARK_CYAN =    "\u001B[36;2m";  //Темно бирюзовый
    public static final String ANSI_TEXT_DARK_GRAY =    "\u001B[37;2m";  //Темно серый

    public static final String ANSI_TEXT_RED =         "\u001B[31;22m";  //Бордовый
    public static final String ANSI_TEXT_GREEN =       "\u001B[32;22m";  //Темно зеленый
    public static final String ANSI_TEXT_YELLOW =      "\u001B[33;22m";  //Темно желтый
    public static final String ANSI_TEXT_BLUE =        "\u001B[34;22m";  //Темно синий
    public static final String ANSI_TEXT_PINK =        "\u001B[35;22m";  //Темно Розовый
    public static final String ANSI_TEXT_CYAN =        "\u001B[32;47m";  //Темно бирюзовый


    //------------------------------------------------

    public static final String ANSI_BACKGROUNG_RED= "\u001B[0m"; //Черный






    public static void main(String[] args)
    {
        System.out.println( "\u001B[36;22m"     + "ANSI_RESET_GRAY");
        System.out.println(ANSI_RESET_BLACK    + "ANSI_RESET_BLACK");


        System.out.println(ANSI_TEXT_LIGHT_BLUE   + "ANSI_TEXT_LIGHT_BLUE"   + ANSI_TEXT_DARK_BLUE   + "\tANSI_TEXT_DARK_BLUE"   + ANSI_TEXT_BLUE   + "\tANSI_TEXT_BLUE");
        System.out.println(ANSI_TEXT_LIGHT_CYAN   + "ANSI_TEXT_LIGHT_CYAN"   + ANSI_TEXT_DARK_CYAN   + "\tANSI_TEXT_DARK_CYAN"   + ANSI_TEXT_CYAN   + "\tANSI_TEXT_CYAN");
        System.out.println(ANSI_TEXT_LIGHT_GREEN  + "ANSI_TEXT_LIGHT_GREEN"  + ANSI_TEXT_DARK_GREEN  + "\tANSI_TEXT_DARK_GREEN"  + ANSI_TEXT_GREEN  + "\tANSI_TEXT_GREEN");
        System.out.println(ANSI_TEXT_LIGHT_PINK   + "ANSI_TEXT_LIGHT_PINK"   + ANSI_TEXT_DARK_PINK   + "\tANSI_TEXT_DARK_PINK"   + ANSI_TEXT_PINK   + "\tANSI_TEXT_PINK");
        System.out.println(ANSI_TEXT_LIGHT_RED    + "ANSI_TEXT_LIGHT_RED"    + ANSI_TEXT_DARK_RED    + "\tANSI_TEXT_DARK_RED"    + ANSI_TEXT_RED    + "\tANSI_TEXT_RED");
        System.out.println(ANSI_TEXT_LIGHT_YELLOW + "ANSI_TEXT_LIGHT_YELLOW" + ANSI_TEXT_DARK_YELLOW + "\tANSI_TEXT_DARK_YELLOW" + ANSI_TEXT_YELLOW + "\tANSI_TEXT_YELLOW");
        System.out.println(ANSI_TEXT_LIGHT_GRAY   + "ANSI_TEXT_LIGHT_GRAY"   + ANSI_TEXT_DARK_GRAY   + "\tANSI_TEXT_DARK_GRAY"   + ANSI_RESET_GRAY  + "\tANSI_RESET_GRAY");




        for (int i = 30; i < 150; i++) {
            System.out.println("");
            for (int j = 0; j < 150; j++) {
                System.out.print("\u001b["+i+";"+j+"m" + i + ";"+j+"\t");
            }

        }
        System.out.println("");
        System.out.println("\u001b[31;47m" + "text");

    }

}
