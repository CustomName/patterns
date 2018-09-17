package me.learn.pattern;

public class Application {

    private static Pattern pattern;
    private static PropertyRetriver propertyRetriver;
    private static String patternName = "pattern.decorator";

    static {
        propertyRetriver = PropertyRetriver.getInstance();
        String patternImpl = propertyRetriver.getProperty(patternName);
        try {
            pattern = (Pattern) Class.forName(patternImpl).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String... args) throws IllegalAccessException, InstantiationException {
        pattern.doIt();
    }

}
