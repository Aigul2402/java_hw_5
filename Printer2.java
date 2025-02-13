public class Printer2 {
    public static void main(String[] args) {
        BrowserHistory2 browserHistory = new BrowserHistory2();
        browserHistory.visitSite("google.com");
        browserHistory.visitSite("stackoverflow.com");
        browserHistory.visitSite("githib.com");

        System.out.println(browserHistory.back(1));
        System.out.println(browserHistory.getHistory());
    }

}
