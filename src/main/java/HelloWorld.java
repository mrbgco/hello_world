public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    FileOutputStream fos = null;try
    {
        fos = new FileOutputStream(new File("may_not_exist.txt"));
    }catch(
    FileNotFoundException e)
    {
        // ask the user and try again
    }catch(
    IOException e)
    {
        // more serious, abort
    }finally
    {
        if (fos != null) {
            try {
                fos.close();
            } catch (IOException e) {
                /* ignore */ }
        }
    }
}
