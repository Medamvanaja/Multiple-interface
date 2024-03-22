interface Backend
{
    public void connectserver();
}
class Frontend
{
    public void responsive(String str)
    {
        System.out.println(str +"can also be used as fronted");
    }
}
class Language extends Frontend implements Backend
{
    String Language = "java";
    public void connectserver()
    {
        System.out.println(Language + "can be used as a backend");
    }    
}    
class Main
{
    public static void main(String args[])
    {
        Language java = new Language();
        java.connectserver();
        java.responsive(java.Language);
    }
}
