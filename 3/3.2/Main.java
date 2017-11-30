class Main
{
    private static int readSpacesInLine(String line)
    {
        return line.length() - line.replaceAll(" ", "").length();
    }
    
    public static void main(String[] args)
    {
        String line = BIO.getString();
        while (!line.contains("END"))
        {
            int numSpaces = readSpacesInLine(line);
            System.out.printf("[%-1d] spaces in \"%s\"\n", numSpaces, line);
            line = BIO.getString();
        }
    }
}

class Main extends BIO
{
    public static int vowelCount(String line)
    {
        String[] vowels = {"a","e","i","o","u"};
        int lineLength = line.length();
        int vowelCount = 0;
        for (int i = 0; i <= vowels.length-1; i++)
        {  
            vowelCount = vowelCount + (lineLength - line.toLowerCase().replaceAll(vowels[i], "").length());
        }
        return vowelCount;
    }
    
    public static void main(String[] args)
    {
        String line = BIO.getString();
        line = line.trim();
        while (!line.equals("END"))
        {
           int numVowels = vowelCount(line);
           System.out.printf("[%-4d] vowels in \"%s\"\n", numVowels, line);
           line = BIO.getString();
           line = line.trim();
        }
    }
}